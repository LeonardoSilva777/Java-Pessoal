package Aulas_Estrutura_Sequencial;

import org.w3c.dom.ls.LSOutput;

public class Aulas_1901 {
    public static void main(String[] args) {
        //Expressões comparativas: <, >, >=, <=, ==, !=.
        // (>): Maior
        // (<): Menor
        // (>=): Maior igual
        // (<=): Menor igual
        // (==): igual
        // (!=): Diferente

        // Operadores Logicos: &&, ||, !.
        // (&&): E, Todas as condições devem ser verdadeiras.

        int x = 5;

        if(x <= 20 && x == 10) {
            System.out.println("Se as 2 condições não forem verdadeiras então a expressão é falsa");
        }
        if(x>0 && x!=3){
            System.out.println("Essa expressão é verdadeira pois ambas as condições condizem");
        }
        // (||): OU, Umas das condições devem ser verdadeira.
        if(x >= 20 || x == 5){
            System.out.println("Se uma das condições forem verdadeiras, a expressão sera True");
        }

        if (x == 20 || x <= 3){
            System.out.println("As 2 condições não são verdadeiras, então a expressão é falsas");
        }
        // (!): NÃO, Ele inverte o valor da condição
        if (!(x == 5)){
            System.out.println("Essa expressão se torna falsa pois x é igual a 5");
        }

        if (!(x >= 5 && x == 20)){
            System.out.println("Essa expressão se torna verdadeira pois a expressão && deve ter as 2 condições verdadeiras");
        }

        // para não confundir a expressão (!) um ex: você tem direito a receber uma bolsa de estudos
        //SE você NÃO receber uma renda de mais de R$3000

        //Operadores de atribuição cumulativa

        // a += b; a = a + b
        // a -= b; a = a - b
        // a *= b; a = a * b
        // e assim por diante com todos os operadores matematicos: / e %


        // Switch Case

        //quando se tem varias opções dde fluxo a serem tratadas com base no valor de uma variavel
        // podemos utilizar o switch case ao inves de varios if e else. Exemplo dias da semana

        int y = 8;
        String dia;

        switch (y){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "invalido";
                break;
        }

        System.out.println("Dia da semana: "+dia);

        //quando se tem mais de uma "opção" usamos o switch case

        //expressão coondicional ternaria

        //sintaxe: (condição) ? valor_Verdadeiro: valor_Falso

        double preco = 34.5;

        double desconto = (preco < 20.00) ? preco * 0.1: preco * 0.05;

        System.out.printf("%.4f%n", desconto);
    }

}
