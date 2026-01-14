package Aulas_Estrutura_Sequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        System.out.println("Valores de A, B, C: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double tri = (A*C) / 2;
        double cir = Math.PI * Math.pow(C, 2);
        double tra = ((A + B)* C ) / 2;
        double qua = Math.pow(B, 2);
        double re = A * B;

        System.out.printf("Triangulo: %.3f%n", tri);
        System.out.printf("Circulo: %.3f%n", cir);
        System.out.printf("Trapezio: %.3f%n",tra);
        System.out.printf("Quadrado: %.3f%n",qua);
        System.out.printf("Retangulo: %.3f%n",re);
    }
}
