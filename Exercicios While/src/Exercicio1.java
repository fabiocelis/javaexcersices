import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 0;
        System.out.println("Digite o valor da senha:");
        senha = sc.nextInt();

        while(senha != 2002){
            System.out.println("Senha Invalida!");
            System.out.println("Digite o valor da senha:");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido!");

        sc.close();

    }
}
