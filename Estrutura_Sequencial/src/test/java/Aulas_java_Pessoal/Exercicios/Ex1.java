package Aulas_java_Pessoal.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int v1, v2;

        System.out.println("Primeiro Valor: ");
        v1 = sc.nextInt();

        System.out.println("Segundo Valor: ");
        v2 = sc.nextInt();

        int soma = v1 + v2;

        System.out.println("SOMA: "+ soma);
    }
}
