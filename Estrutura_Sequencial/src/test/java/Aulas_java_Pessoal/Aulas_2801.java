package Aulas_java_Pessoal;

import java.util.Locale;
import java.util.Scanner;

public class Aulas_2801 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Estruturas de Repetição: While
        // A regra do While é a seguinte, enquanto a conddição for verdadeira. Ele fica em loop, quando ela for falsa ela sai.
        System.out.println("Digite 0 para parar! ");

        System.out.println("====================");

        // Estruturas de Repetição: For
        System.out.println("Digite quantas vezes quer o loop! ");
        int a = sc.nextInt(); // quantidade de vezes que quero que a aplicação funcione
        int soma = 0;
        for(int i = 1 ; i <= a; i++){ //bom usar quando ja saber quando ira para.
            int b = sc.nextInt(); // variavel para os valores
            soma += b; // armazendando os valores na variavel soma
        } // para cada loop, o for incrementa +1, i++

        System.out.println(soma); //mostra a soma

        for(int vali = 0; vali <= 5; vali++){ //como i funciona
            System.out.println("Valor de i: "+vali);
        }

        System.out.println("================");

        for(int rev = 5; rev >= 0; rev--){
            System.out.println("Valor de i, regressiva: "+rev);
        }

        //Então sabemos que o for é bom para contagens tanto progressiva quando regressiva
    }
}
