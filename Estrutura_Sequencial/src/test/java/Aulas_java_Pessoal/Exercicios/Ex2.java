package Aulas_java_Pessoal.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R;

        System.out.println("Valor do raio: ");
        R = sc.nextDouble();

        double Result = Math.PI * Math.pow(R, 2.0);

        System.out.printf("Valor do Pi: %.4f%n", Result);
    }
}
