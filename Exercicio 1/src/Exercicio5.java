import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int codigo1;
        int numeroPecas1;
        double valorUnitario1;
        codigo1 = sc.nextInt();
        numeroPecas1 = sc.nextInt();
        valorUnitario1 = sc.nextDouble();

        int codigo2;
        int numeroPecas2;
        double valorUnitario2;
        //sc.nextLine();
        codigo2 = sc.nextInt();
        numeroPecas2 = sc.nextInt();
        valorUnitario2 = sc.nextDouble();
        double valorAPagar  = (numeroPecas1 * valorUnitario1) + (numeroPecas2 * valorUnitario2);

        System.out.printf("Valor a ser pago = R$%.2f%n", valorAPagar);

        sc.close();

    }
}
