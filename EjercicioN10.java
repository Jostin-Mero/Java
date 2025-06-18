//Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
//su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
//incorrecta, el programa deberá mostrar un mensaje de error.

import java.util.Scanner;

public class EjercicioN10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jugador 1 (piedra, papel o tijera): ");
        String j1 = sc.nextLine();

        System.out.print("Jugador 2 (piedra, papel o tijera): ");
        String j2 = sc.nextLine();

        if (j1.equals(j2)) {
            System.out.println("Empate");

            // Ojo usaremos equals para ser o comparar si dos textos son iguales
        } else if (j1.equals("piedra") && j2.equals("tijera") ||
                   j1.equals("papel") && j2.equals("piedra") ||
                   j1.equals("tijera") && j2.equals("papel")) {
            System.out.println("Gana el jugador 1");
        } else {
            System.out.println("Gana el jugador 2");
        }
    }
}
