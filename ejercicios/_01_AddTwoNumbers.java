package ejercicios;

import java.util.Arrays;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.

 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.

 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]

 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */
public class _01_AddTwoNumbers {

    public static void main(String[] args) {
        int[] l1 = new int[]{9,9,9,9,9,9,9};
        int[] l2 = new int[]{9,9,9,9};

        int l1Number = getInversNumber(l1);
        int l2Number = getInversNumber(l2);
        int sum = l1Number + l2Number;
        System.out.println("sum = " + sum);
        int[] result = getArray(sum);
        System.out.printf(Arrays.toString(result));
    }

    public static int getInversNumber(int[] array) {
        int size = array.length;
        StringBuilder number = new StringBuilder();
        for (int i = size-1; i >= 0; i--) {
            number.append(array[i]);
        }
        return Integer.parseInt(number.toString());
    }

    public static int[] getArray(int sum) {
        String sumString = String.valueOf(sum);
        int[] result = new int[sumString.length()];
        int index = 0;
        for (int i = sumString.length()-1; i >= 0; i--) {
            result[index] = Integer.parseInt(sumString.substring(i, i+1));
            index++;
        }
        return result;
    }

}
