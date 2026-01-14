package Aulas_Estrutura_Sequencial.Exercicios;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cp1, cp2, v1, v2;
        double pr1, pr2;

        System.out.println("Codigo peça 1, unidades de peças e valor unitario: ");
        cp1 = sc.nextInt();
        v1 = sc.nextInt();
        pr1 = sc.nextDouble();

        System.out.println("Codigo peça 2, unidades de peças e valor unitario: ");
        cp2 = sc.nextInt();
        v2 = sc.nextInt();
        pr2 = sc.nextDouble();

        double R1, R2, R3;

        R1 = v1 * pr1;
        R2 = v2 * pr2;
        R3 = R1 + R2;

        System.out.printf("Valor a pagar: R$ %.2f%n", R3);

    }
}
