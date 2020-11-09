import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaTriangulo = a * c / 2;
        areaCirculo = Math.PI * Math.pow(c, 2);
        areaTrapezio = (a + b) * c / 2;
        areaQuadrado = b * b;
        areaRetangulo = a * b;

        System.out.printf("Triangulo: %.3f%n", areaTriangulo);
        System.out.printf("Circulo: %.3f%n", areaCirculo);
        System.out.printf("Trapezio: %.3f%n", areaTrapezio);
        System.out.printf("Quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Retangulo: %.3f%n", areaRetangulo);

        sc.close();

    }
}
