package Aulas_Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aulas_1001 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        //Expressões Aritmeticas
        // +, -, *, /, %
        // precedencias = 1: *, /, %. 2: + e -

        System.out.println("=========EXPRESSÕES ARITMETICAS===========");

        int number = 2 * 6 / 3; // 4, conta da esquerda para direita
        int number2 = 3 + 2 * 4; // 11, conta da direita para esquerda devido a precedencia
        int number3 = (3+2) * 4; // 20, conta da esquerda para direita devido aos parenteses
        int number4 = 60 / (3+2) * 4; //48, conta feita da esquerda para direita, pois (/ e *) tem a mesma precedencia, mas resolver primeiro a conta entre parenteses
        int number5 = 60 / ((3+2) * 4);

        System.out.println("Resposta: " + number);
        System.out.println("Resposta: " +number2);
        System.out.println("Resposta: " +number3);
        System.out.println("Resposta: " +number4);
        System.out.println("Resposta: " +number5);
        //operador "MOD" ou %

        int mod1 = 14 % 3; // Resultado é 2, pois, 14 dividido por 3 da 12, sobra 2
        int mod2 = 19 % 5; // Resultado é 4, pois, 19 dividido por 5 da 15, sobra 4

        System.out.println("Resposta: " +mod1);
        System.out.println("Resposta: " +mod2);

        System.out.println("=========VARIAVEIS E TIPOS BASICOS===========");

        //Tipos Numericos inteiros: byte, short, int, long
        byte bite = 127; //8 bits, Valores que vão do −128 para o 127
        short shorte = 32767; //16 bits. Valores que vão do -32768 para o 32767
        int inteiro = 2000000000; //32 bits. Valores que vão do -2000000000 para o 2000000000
        long longo = 2000000000; //64 bits. Valores que vão do -2000000000 para o 2000000000

        System.out.print(bite);
        System.out.println(shorte);
        System.out.println(inteiro);
        System.out.println(longo);

        // Tipos numericos de ponto flutuante: Float e Double

        float numFlo = 2.4f; // 32 bits

        double numDou = 2.4; // 64 bits

        System.out.println(numFlo);
        System.out.println(numDou);

        //Cadeia de Caracteres: String

        String nome = "Meu nome é Leonardo"; //utilizado para armazenar palavras ou textos

        System.out.println(nome);

        System.out.println("=========ENTRADA E SAIDA DE DADOS===========");

        System.out.println("Bom dia"); //pula a proxima palavra para baixo
        System.out.print("Bom dia!"); // não pula a proxima palavra

        int a = 40;
        System.out.println(a); // pode colocar variaveis e funções para exibir na saida dos dados

        double x = 10.72362;

        System.out.printf("%.2f%n", x); // faz com que delimite 2 numeros após o (.)
        System.out.printf("%.4f%n", x); // faz com que delimite 4 numeros após o (.)

        System.out.println("==========CASTING============");

        int ca = 5;
        int cb = 2;
        double resultado;
        resultado = (double) ca/cb; // quando se tem variaveis que são de tipos diferentes e que dão um numero de ponto flutuante e necessario colocar o (Double)
        System.out.println(resultado);

        //usamos o casting tb para informar ao compilador quando não "ligamos" para uma perda de informação, por exemplo
        double ca2 = 5.0;
        double cb2 = a;
        System.out.println(cb2);

        System.out.println("============ ENTRADA DE DADOS ============");

        // Para fazer qualquer tipo de entrada de dados precisamos de um objeto Scanner que seria:
        Scanner sc = new Scanner(System.in); //variavel: sc do tipo Scanner
        //sc.close() para quando não precisar mais do Scanner ou o nome da variavel

        System.out.println("Qual seu nome: ");
        String nomeSC = sc.next();
        System.out.println("Qual sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Qual sua altura: ");
        double altura = sc.nextDouble(); //Lembrar que para que o compilador indentifique o ponto flutuante com o ( . ) voce deve importar a biblioteca Locale

        System.out.println("Informações: "+ "Nome: "+nomeSC +" Idade: "+ idade +" Altura: "+ altura );

        System.out.println("Digite uma palavra: ");

        char p =sc.next().charAt(0); //A função charAt(0) é reponsavel por pegar o primeiro caracter doque você digitou.
        System.out.println(p);

        // Digitar qualquer coisa até a quebra de linha você deve usar o NextLine

        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();

        System.out.println("========== FUNÇÕES MATEMATICAS ===========");

        // funções matematicas para raiz quadrada, potencia e valor absoluto com a biblioteca Math

        double v1 = 3.0;
        double v2 = 4.0;
        double neg = -5.0;
        double A, B, C;

        A = Math.sqrt(v1);
        B = Math.sqrt(v2);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de +"+ v1 + "é:" +A);
        System.out.println("Raiz quadrada de +"+ v2 + "é:" +B);
        System.out.println("Raiz quadrada de 25 é: "+C);

        A = Math.pow(v1,v2);
        B = Math.pow(v1, 2.0);
        C = Math.pow(5.0,2.0);

        System.out.println(v1 + " elevado a " + v2 + "Igual a: " + A);
        System.out.println(v1 + "Elevado a 2 é igual a: " + B);
        System.out.println("5 Elevado a 2 é igual a: "+ C);

        A = Math.abs(v2);
        B = Math.abs(neg);

        System.out.println("Valor absoluto de "+ v2 + "É de: " +A);
        System.out.println("Valor absoluto de "+ neg + "É de: " +B);


    }
}
