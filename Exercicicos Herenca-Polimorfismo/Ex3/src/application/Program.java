package application;

import enteties.Company;
import enteties.Individual;
import enteties.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberOfTaxPayer = sc.nextInt();

        for (int i = 1; i<= numberOfTaxPayer; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or Company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual Income: ");
            double annualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenditures));
            } else if (ch == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, annualIncome, numberOfEmployees));
            }

        }

        System.out.println();
        System.out.println("TAX PAID");
        for (TaxPayer taxPayer : list) {
            System.out.println(taxPayer.getName() + " $ " + String.format("%.2f", taxPayer.taxPaid()));
        }

        System.out.println();
        double sum = 0;
        for (TaxPayer taxPayer : list){
            sum += taxPayer.taxPaid();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
