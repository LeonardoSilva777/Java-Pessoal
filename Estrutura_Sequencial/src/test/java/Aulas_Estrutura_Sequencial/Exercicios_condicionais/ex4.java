package Aulas_Estrutura_Sequencial.Exercicios_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Hora de inicio: ");
        int horaInicio = sc.nextInt();

        System.out.println("Hora final: ");
        int horaFinal = sc.nextInt();

        int hours = 24; //dia tem 24 horas

        int horasTotais = horaFinal - horaInicio;

        if (horasTotais < 0){
            horasTotais += hours; // ja que não existe hora negativa, é só somar 24 ao valor que deu
            System.out.println("O JOGO DUROU: "+horasTotais +" HORAS");
        }else if (horaInicio == 0 && horaFinal == 0){
            System.out.println("O JOGO DUROU: 24 HORAS");
        } else {
            System.out.println("O JOGO DUROU: "+ horasTotais + " HORAS");
        }
    }
}
