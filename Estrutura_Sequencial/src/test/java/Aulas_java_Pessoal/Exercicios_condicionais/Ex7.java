package Aulas_java_Pessoal.Exercicios_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;
        System.out.println("Valor X: ");
        x = sc.nextDouble();

        System.out.println("Valor Y: ");
        y = sc.nextDouble();

        if (x >= 0.1 && y <= -0.1){
            System.out.println("EIXO Q4");
        }else if (x >= 0.1 && y >= 0.1){
            System.out.println("EIXO Q1");
        }else if (x <= -0.1 && y >= 0.1){
            System.out.println("EIXO Q2");
        } else if (x <= -0.1 && y <= -0.1) {
            System.out.println("EIXO Q3");
        } else {
            System.out.println("EIXO ORIGEM");
        }
    }
}
