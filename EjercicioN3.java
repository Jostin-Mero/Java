//Realiza un programa que pida dos números y que luego muestre el resultado
//de su multiplicación.

import java.util.Scanner;

public class EjercicioN3 {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        int n,m;
        int resultado;
        
        System.out.println("Ingrese el Primer numero");
        n = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        m = sc.nextInt();
        resultado = n*m;

        System.out.println("El resultado de la multiplicscion es  5"+resultado);

    }
}