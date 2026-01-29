package Aulas_Estrutura_Sequencial.Exercicios_Repetição;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
