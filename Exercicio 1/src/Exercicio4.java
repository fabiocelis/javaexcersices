import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario = horas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$%.2f%n", salario);

    }
}
