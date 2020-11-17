package application;

import entities.Costumers;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Costumers[] vect = new Costumers[10];

        System.out.print("How many roons to be rented? ");
        int rentedRoons = sc.nextInt();
        System.out.println();
        
        for (int i = 0; i < rentedRoons; i++) {
            System.out.println("Rent #" + (i + 1));
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            System.out.println();
            vect[roomNumber] = new Costumers(name, email, roomNumber);
        }

        System.out.println("Busy rooms:");
        for(int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(vect[i]);
            }
        }


    }
}
