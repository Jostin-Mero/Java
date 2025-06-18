//Escribe un programa que ordene tres números enteros introducidos por teclado.

import java.util.Scanner;

public class EjercicioN7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();

        System.out.println("Ingrese el tercer numero");
        num3 = sc.nextInt();

        int mayor, mediano, menor; // En esta parte vamos a ordenar los numeros ingtresa de mayor a menor con el if

  if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                mediano = num2;
                menor = num3;
            } else {
                mediano = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                mediano = num1;
                menor = num3;
            } else {
                mediano = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                mediano = num1;
                menor = num2;
            } else {
                mediano = num2;
                menor = num1;
            }
        }

        System.out.println("Números ordenados de mayor a menor: " + mayor + ", " + mediano + ", " + menor);
    }
}
