import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroN = sc.nextInt();
        int numeroX = 0;
        int somaIn = 0, somaOut = 0;

        for (int i = 0; i < numeroN; i++){
            //System.out.println("Digite um valor: ");
            numeroX = sc.nextInt();
            if (numeroX >= 10 && numeroX <= 20){
                somaIn += 1;
            } else {
                somaOut += 1;
            }
        }
        System.out.println(somaIn + " In");
        System.out.println(somaOut + " Out");

        sc.close();
    }
}
