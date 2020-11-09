import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorDigitado;

        System.out.println("Digite um valor: ");
        valorDigitado = sc.nextDouble();
         if(valorDigitado >= 0 && valorDigitado <= 25){
             System.out.println("Intervalo [0, 25]");
         } else if(valorDigitado > 25 && valorDigitado <= 50){
             System.out.println("Intervalo [25, 50]");
         } else if(valorDigitado > 50 && valorDigitado <= 75){
             System.out.println("Intervalo [50, 75]");
         } else if(valorDigitado > 75 && valorDigitado <= 100){
             System.out.println("Intervalo [75, 100]");
         } else{
             System.out.println("Fora de Intervalo");
         }

         sc.close();
    }
}
