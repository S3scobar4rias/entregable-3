/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulario;

/**
 *
 * @author santi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FriendsApp extends JFrame {
    private JTextArea contactListTextArea;

    public FriendsApp() {
        setTitle("Friends App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        contactListTextArea = new JTextArea();
        contactListTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(contactListTextArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton addFriendButton = new JButton("Add Friend");
        addFriendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter friend's name:");
                String numberStr = JOptionPane.showInputDialog("Enter friend's number:");
                long number = Long.parseLong(numberStr);
                AddFriend.addFriend(name, number);
                updateContactList();
                JOptionPane.showMessageDialog(FriendsApp.this, "Friend added.");
            }
        });
        buttonPanel.add(addFriendButton);

        JButton deleteFriendButton = new JButton("Delete Friend");
        deleteFriendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter friend's name:");
                DeleteFriend.deleteFriend(name);
                updateContactList();
                JOptionPane.showMessageDialog(FriendsApp.this, "Friend deleted.");
            }
        });
        buttonPanel.add(deleteFriendButton);

        JButton updateFriendButton = new JButton("Update Friend");
        updateFriendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter friend's name:");
                String numberStr = JOptionPane.showInputDialog("Enter new friend's number:");
                long number = Long.parseLong(numberStr);
                UpdateFriend.updateFriend(name, number);
                updateContactList();
                JOptionPane.showMessageDialog(FriendsApp.this, "Friend updated.");
            }
        });
        buttonPanel.add(updateFriendButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setSize(400, 300); // Establecer el tamaño de la ventana (ancho x altura)
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true);

        updateContactList();
    }

    private void updateContactList() {
        try {
            StringBuilder sb = new StringBuilder();
            RandomAccessFile raf = new RandomAccessFile("friendsContact.txt", "rw");
            String line;
            while ((line = raf.readLine()) != null) {
                String[] lineSplit = line.split("!");
                String name = lineSplit[0];
                long number = Long.parseLong(lineSplit[1]);
                sb.append("Friend Name: ").append(name).append("\n");
                sb.append("Contact Number: ").append(number).append("\n\n");
            }
            contactListTextArea.setText(sb.toString());
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FriendsApp();
            }
        });
    }
}


