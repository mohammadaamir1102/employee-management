package com.employee.interview;

public class DivideTwoNoWithOutUsingOperators {

    public static void main(String[] args) {
        int divide = 10;
        int divisor = 2;

        int result = divide(divide, divisor);
        System.out.println(result);
    }

    public static int divide(int devide, int devisor) {
        if (devisor == 0) {
            throw new IllegalArgumentException("valid input");
        }
        int sign = ((devide < 0) ^ (devisor < 0)) ? -1 : 1;
        devide = Math.abs(devide);
        devisor = Math.abs(devisor);

        int qutient = 0; //5

        while (devide >= devisor) {
            devide = devide - devisor; //0
            qutient++;

        }

        return sign * qutient;

    }
}
