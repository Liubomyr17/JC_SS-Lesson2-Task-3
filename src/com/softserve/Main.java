package com.softserve;

public class Main {
    public static void main(String[] args) {
        int start = 8;
        int end = 22;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0)
                sum += i;
        }
        System.out.println("The sum of odd natural numbers: " + sum + ";");
    }
}




