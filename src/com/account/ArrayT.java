package com.account;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ArrayT {
    public static void main(String... args) {
        int[][] t = new int[2][3];
        Scanner input = new Scanner(System.in);
        //t has 2 rows

        // t has 3 columns

        //t has 6 elements

        //elements in row 1 of t
        System.out.println(t[1][0]);
        System.out.println(t[1][1]);
        System.out.println(t[1][2]);

        //elements in column 2 of t
        System.out.println(t[0][2]);
        System.out.println(t[1][2]);

        //statement that sets row 0 column 1 to zero
        t[0][1] = 0;

        //statement to initialize each element of t to zero
        t[0][0] = 0;
        //t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

        for(int row = 0;row < t.length;row++){
            for(int column = 0; column < t[row].length;column++){
                t[row][column]= 0;
                System.out.println(t[row][column]);
            }
        }

        for(int row = 0;row < t.length; row++ ){
            for(int column = 0;column < t[row].length;column++){
                System.out.println("Enter numbers for the array:");
                t[row][column] = input.nextInt();
            }
        }
    //checking smallest value
        int value;
        value = t[0][0];
        value = Math.min(value,t[0][1]);
        value = Math.min(value,t[0][2]);
        value = Math.min(value,t[1][0]);
        value = Math.min(value,t[1][1]);
        value = Math.min(value,t[1][2]);

        System.out.println("Smallest value is " + value);
        //elements in the first row of t
        System.out.printf("Numbers in the first row %d %d %d\n", t[0][0],t[0][1],t[0][2]);
        //sum of elements in the third column of t
        System.out.printf("Sum of third column %d\n" ,t[0][2] + t[1][2]);
        //tabular form of t
        System.out.println("                Column");
        System.out.printf("Row1%8d%8d%8d\n", t[0][0],t[0][1],t[0][2]);
        System.out.printf("Row2%8d%8d%8d\n", t[1][0],t[1][1],t[1][2]);
    }

}
