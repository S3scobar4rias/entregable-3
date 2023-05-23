/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma_mayorymenor;

/**
 *
 * @author santi
 */
public class NumberFinder {
    private int[] numbers;

    public NumberFinder(int[] numbers) {
        this.numbers = numbers;
    }

    public int findLargestNumber() {
        int largestNumber = Integer.MIN_VALUE;
        int Minnumber = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        for (int number : numbers) {
            if (number < Minnumber) {
                Minnumber = number;
            }
        }

        return largestNumber + Minnumber;
    }
}
