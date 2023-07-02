package com.epam.rd.autotasks;

import java.rmi.UnexpectedException;

class ConditionStatements {

    public static void main(String[] args) {
        System.out.println(ConditionStatements.task1(4));
        System.out.println(ConditionStatements.task1(-5));
        System.out.println(ConditionStatements.task1(0));
    }
    public static int task1(int n) {
        if (n >= 0) {
            return n * n;
        }
        if (n < 0) {
            return n * -1;
        }
        if (n == 0) {
            return n = 0;
        }

        return n;
    }
}
