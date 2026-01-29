package Aulas_Estrutura_Sequencial.Exercicios_Repetição;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fato = 1;

        for (int i = 1; i <= n; i++){
            fato *= i;
        }

        System.out.println(fato);


    }
}
