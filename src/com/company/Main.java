package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int n = 30;
        int sumEven = 0;
        int sumOdd = 0;
        int[] array= new int[n];
        for (int i = 0; i <n; i++) {
            array[i] = (int)(Math.random()*45 -20);
        }
        System.out.println("Array:");
        System.out.println(Arrays.toString(array) + "\n");
        for (int i = 0; i < n; i++) {
            if(array[i] % 2 == 1)
                sumOdd += array[i];
        
            else
                sumEven += array[i];
        }

        System.out.println(" Sum of even : " + sumEven);
        System.out.println("Sum odd : " + sumOdd + "\n");
    }
}
