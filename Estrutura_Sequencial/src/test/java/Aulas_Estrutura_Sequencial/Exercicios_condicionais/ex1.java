package Aulas_Estrutura_Sequencial.Exercicios_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Esse numero é negativo");
        }else {
            System.out.println("Esse numero é positivo");
        }
    }
}
