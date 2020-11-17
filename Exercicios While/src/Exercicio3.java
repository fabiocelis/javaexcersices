import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int codigoCombustivel = 0;
        int alcool = 0, gasolina = 0, diesel = 0;

         while (codigoCombustivel != 4){
             System.out.println("Digite o Codigo do Combustivel: ");
             codigoCombustivel = sc.nextInt();
             if(codigoCombustivel == 1){
                 alcool += 1;
             } else if(codigoCombustivel == 2){
                 gasolina += 1;
             } else if (codigoCombustivel == 3){
                 diesel += 1;
             }
         }

         System.out.println("Muito Obrigado!");
         System.out.println("Alcool: " + alcool);
         System.out.println("Gasolina: " + gasolina);
         System.out.println("Diesel: " + diesel);

         sc.close();
    }
}
