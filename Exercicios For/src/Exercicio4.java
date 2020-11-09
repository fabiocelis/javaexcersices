import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
             double a = sc.nextDouble();
             double b = sc.nextDouble();
             double resultado = 0;

             if (b != 0) {
                 resultado = a / b;
                 System.out.println(resultado);
             } else {
                 System.out.println("Divisao Impossivel");
             }
        }

        sc.close();
    }
}
