package Aulas_java_Pessoal.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;

        A=5;
        B=6;
        C=-7;
        D=8;

        int Result = (A*B - C*D);
        System.out.println(Result);
    }
}
