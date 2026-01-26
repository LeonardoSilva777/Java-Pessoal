package Aulas_Estrutura_Sequencial.Exercicios_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o codigo do item: ");
        int item = sc.nextInt();

        System.out.println("Qual a quantidade: ");
        int quantidade = sc.nextInt();

        String nomeComida;
        double valorComida;
        double result;

        switch (item){
            case 1:
                nomeComida = "Cachorro quente";
                valorComida = 4.00;
                result = quantidade * valorComida;
                System.out.println("Total: R$"+result);
                break;
            case 2:
                nomeComida = "X-Salada";
                valorComida = 4.50;
                result = quantidade * valorComida;
                System.out.println("Total: R$"+result);
                break;
            case 3:
                nomeComida = "Refrigerante";
                valorComida = 1.50;
                result = quantidade * valorComida;
                System.out.println("Total: R$"+result);
                break;
            case 4:
                nomeComida = "X-Bacon";
                valorComida = 5.0;
                result = quantidade * valorComida;
                System.out.println("Total: R$"+result);
                break;
            case 5:
                nomeComida = "Torrada";
                valorComida = 2.50;
                result = quantidade * valorComida;
                System.out.println("Total: R$"+result);
                break;

            default:
                nomeComida = "INVALIDO";
                valorComida = 0;
        }

    }
}
