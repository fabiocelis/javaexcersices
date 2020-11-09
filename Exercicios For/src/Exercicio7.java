import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int a, b, c;
            a = i * 1;
            b = (int) Math.pow(i, 2);
            c = (int) Math.pow(i, 3);
            System.out.println(a + " " + b + " " + c);
        }

        sc.close();
    }
}

