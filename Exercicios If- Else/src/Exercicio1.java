import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero interio: ");
        int numero = sc.nextInt();

        if(numero >= 0){
            System.out.println("Nao negativo");
        } else{
            System.out.println("Negativo");
        }

        sc.close();
    }
}
