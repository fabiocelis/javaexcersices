package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        String dateFormat = "dd/MM/yyyy";
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int numberProducts = sc.nextInt();
        for (int i = 1; i <= numberProducts; i++) {
            System.out.print("Common, used or imported (c/u/i)? ");
            char choice = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (choice == 'i') {
                System.out.print("Custom fee: ");
                Double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            } else if (choice == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                Date date = new SimpleDateFormat(dateFormat).parse(sc.nextLine());
                list.add(new UsedProduct(name, price, date));
            } else {
                list.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
