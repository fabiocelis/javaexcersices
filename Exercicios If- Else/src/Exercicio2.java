import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero interiro: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("Numero Par");
        } else{
            System.out.println("Numero Impar");
        }

        sc.close();
    }
}
