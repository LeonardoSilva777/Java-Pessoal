package Aulas_java_Pessoal.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int ID, hours;
        double salary;

        System.out.println("ID: ");
        ID = sc.nextInt();

        System.out.println("Horas trabalhadas: ");
        hours = sc.nextInt();

        System.out.println("Salario por hora: ");
        salary = sc.nextDouble();

        double Result = hours * salary;

        System.out.println("ID: "+ ID);
        System.out.println("Salary: "+ Result);
    }
}
