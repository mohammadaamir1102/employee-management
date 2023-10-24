package com.employee.java8.interview;

public class CountSurroundedZerosInBinary {
    public static void main(String[] args) {
        int decimalNumber = 50;
        String binary = Integer.toBinaryString(decimalNumber);

        int surroundedZeroCount = 0;

        // Check for '01' or '10' in the binary string
        for (int i = 0; i < binary.length() - 1; i++) {
            if ((binary.charAt(i) == '0' && binary.charAt(i + 1) == '1') ||
                    (binary.charAt(i) == '1' && binary.charAt(i + 1) == '0')) {
                surroundedZeroCount++;
            }
        }

        System.out.println("Binary representation of 50: " + binary);
        System.out.println("Number of '0's surrounded by '1's: " + surroundedZeroCount);
    }
}
