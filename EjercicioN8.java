//Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5

import java.util.Scanner;

public class EjercicioN8 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un número: ");
        numero = sc.nextInt();

        // En esta parte veremos si es par o impra
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número no es par.");
        }

        //En esta parte veremos si el nunmero que se ingresa es divisible para 5
        if (numero % 5 == 0) {
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número no es divisible entre 5.");
        }
    }
}



