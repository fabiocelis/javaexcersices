import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        float total = 0;

        System.out.println("Digite o codigo do produto: ");
        codigo = sc.nextInt();

        System.out.println("Digite a quantidade deste item: ");
        quantidade = sc.nextInt();

        if(codigo == 1){
            total = 4 * quantidade;
        } else if(codigo == 2){
            total = (float) (4.5 * quantidade);
        } else if(codigo == 3){
            total = (float) (5 * quantidade);
        } else if(codigo == 4){
            total = (float) (2 * quantidade);
        } else if(codigo == 5){
            total = (float) (1.5 * quantidade);
        }
        System.out.printf("Total: R$%.2f%n", total);

        sc.close();

    }
}
