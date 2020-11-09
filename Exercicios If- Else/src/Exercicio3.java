import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primiro numero: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = sc.nextInt();

        if(numero1 % numero2 == 0 || numero2 % numero1 == 0){
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }
        sc.close();
    }
}
