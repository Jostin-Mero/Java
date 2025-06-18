//Escribe un programa que calcule el área de un rectángulo

import java.util.Scanner;

public class EjercicioN4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura;
        double area;
    
        System.out.println("Ingrese la base: ");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = sc.nextDouble();

        area = base * altura;
        System.out.println("El área del rectángulo es de: " + area);
    }
}