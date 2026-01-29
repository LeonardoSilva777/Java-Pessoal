package Aulas_java_Pessoal.Exercicios_Repetição;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero de testes: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;
            System.out.printf("%.2f%n", media);
            int teste = 1;

            System.out.println(teste);
        }


    }
}
