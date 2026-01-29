package Aulas_Estrutura_Sequencial.Exercicios_Repetição;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if ( n2 == 0) {
                System.out.println("impossivel Calcular");
            } else {
                double calc = (double) n1 / n2;
                System.out.printf("%.2f%n",calc);
            }
        }
    }
}
