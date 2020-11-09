import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double valorUm = 0, valorDois = 0, valorTres = 0;

        for (int i = 0; i < n; i++) {
            valorUm = sc.nextDouble();
            valorDois = sc.nextDouble();
            valorTres = sc.nextDouble();
            double media = ((valorUm * 2) + (valorDois * 3) + (valorTres * 5)) / 10;
            System.out.printf("Media " + (i + 1) + " %.2f%n", media);
        }

        sc.close();
    }
}
