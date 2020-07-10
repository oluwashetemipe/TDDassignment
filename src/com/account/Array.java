package com.account;

import java.util.Scanner;

public class Array {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int[] arrays = new int[5];
        int counter = 1;
        int response;
        System.out.println("Enter a number between 10 and 100:");

        while (counter <= 5) {
            response = input.nextInt();
            if (response < 10 || response > 100) {
                System.out.println("Enter a number between 10 and 100:");
                continue;
            }
            for (int i = 0; i <= arrays.length;i++){
                if (response == arrays[i] ) break;
                if(response != arrays[i] && arrays[i] == 0){
                    arrays[i] = response;
                    counter++;
                    for (int array : arrays) {
                        if (array != 0) {
                            System.out.print(array + " ");
                        }
                    }
                    System.out.println();
                    break;
                }
            }
            if (counter < 6) System.out.print("Enter another unique number: ");
                }
            }
        }








