import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salario, imposto, restoSalario;

        System.out.println("Digite o valor do salario");
        salario = sc.nextDouble();

        if(salario <= 2000){
            System.out.println("Isento");
        } else if(salario <= 3000){
            restoSalario = salario - 2000;
            imposto = restoSalario * 0.08;
            System.out.printf("R$ %.2f", imposto);
        } else if(salario <= 4500){
            restoSalario = salario - 3000;
            imposto = restoSalario * 0.18 + 80;
            System.out.printf("R$ %.2f", imposto);
        } else if(salario > 4500){
            restoSalario = salario - 4500;
            imposto = restoSalario * 0.28 + 270 + 80;
            System.out.printf("R$ %.2f", imposto);
        }
        sc.close();
    }
}
