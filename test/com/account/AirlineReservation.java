package com.account;

import java.util.Scanner;

public class AirlineReservation {

        public static void main(String[] args) {
            boolean[] seats = new boolean[10];
            Scanner input = new Scanner(System.in);
            int response;
            int economyCount = 1;
            int firstClassCount = 1;


            while (true) {
                System.out.print("Enter 1 for First-Class or Enter 2 for Economy or 0 to quit: ");
                response = input.nextInt();

                if (response == 0) break;

                if (response == 1) {
                    for (int i = 0; i < 5; i++ ) {
                        if (seats[i] == false) {
                            seats[i] = true;
                            firstClassCount++;
                            System.out.printf("Seat number is: %d [First-Class] %n", i + 1);
                            break;
                        }
                        if (firstClassCount > 5) {
                            System.out.println("First-Class section is full. Enter 2 to be placed in Economy section");
                            break;
                        }
                    }
                }
                else if (response == 2) {
                    for (int i = 5; i < 10; i++) {
                        if (seats[i] == false) {
                            seats[i] = true;
                            economyCount++;
                            System.out.printf("Your seat number is: %d [Economy] %n", i + 1);
                            break;
                        }
                        if (economyCount > 5) {
                            System.out.println("Economy section is full. Enter 1 to be placed in First-Class section");
                            break;
                        }
                    }
                }

                if (economyCount > 5 && firstClassCount > 5) {
                    System.out.println("Both sections are full");
                    System.out.println("Next flight leaves in 3 hours.");
                    break;
                }
            }
        }
    }

