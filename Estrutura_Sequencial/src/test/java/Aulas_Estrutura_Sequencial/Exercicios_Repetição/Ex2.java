package Aulas_Estrutura_Sequencial.Exercicios_Repetição;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros: ");
        int n = sc.nextInt();
        int dentro = 0;
        int fora = 0;

        for( int i = 1; i <= n; i++){
            int num = sc.nextInt();
            if (num >= 10 && num <= 20){
                dentro++;
            }else {
                fora++;
            }
        }

        System.out.println(dentro +" in");
        System.out.println(fora + " out");

    }
}
