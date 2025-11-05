public class Main { // Precisa de uma classe em todo arquivo java


    public static void main(String[] args) {

        // Declaração de variáveis tipo, nome, valor
        int idade = 19;
        String nomevariavel = "Leonardo";

        // Tipos primitivos

        // Numeros inteiros

        byte b = 100; //byte => 8 bits => -128 a 127
        short s = 10000;
        int i = 100000;
        long l = 1000000L;

        // Numeros decimais
        float preco1 = 1.0f;
        double preco2 = 35.50;

        // String, char, Boolean
        String nome2 = "Pereira";
        char meuChar = 'L';
        boolean boll = true;

        /*------------------------------------------------------------------------------------------*/

        // Estruturas Condicionais

        if (b > 99) { // Se
            System.out.println("Verdadeiro");
        } else { // Senão
            System.out.println("Falso");
        }

        //ou

        if (nomevariavel == "Fernando") {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        
    }
}