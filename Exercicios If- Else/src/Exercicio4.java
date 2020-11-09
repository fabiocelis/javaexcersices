import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int duracao;

        System.out.println("Digite a hora de inicio do jogo: ");
        int horaInicio = sc.nextInt();

        System.out.println("Digite a hora de fim do jogo: ");
        int horaFim = sc.nextInt();

        if(horaInicio > horaFim){
            duracao = (24 - horaInicio) + horaFim;
            System.out.println("O Jogo durou " + duracao + " Hora(s)");
        } else if(horaInicio < horaFim){
            duracao = horaFim - horaInicio;
            System.out.println("O Jogo durou " + duracao + " Hora(s)");
        } else if (horaInicio == horaFim){
            System.out.println("O Jogo durou 24 Hora(s)");
        }

        sc.close();
    }
}
