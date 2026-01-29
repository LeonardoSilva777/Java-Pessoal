package Aulas_java_Pessoal.Exercicios_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero Maior:");
        int a = sc.nextInt();

        System.out.println("Numero Menor: ");
        int b = sc.nextInt();

        String Divisivel;

        String result = (a % b == 0) ? "Divisivel":"Não divisivel";
        //Para ver se um número é divisivel por outro número basta pegar o resto da divisãoo
        //Se o resultado for 0 é divisivel, se for 1 não é divisivel

        System.out.println(result);


    }
}
