package Aulas_java_Pessoal.Exercicios_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
