//Realiza un conversor de Kb a Mb.
import java.util.Scanner;

public class Ejercicion6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double KB,MB;
        double resultado;
        MB=1024;

        System.out.println("Ingresa la cantidad de Kilobytes");
        KB = sc.nextDouble();

        resultado = KB/MB;
        System.out.println("El resultado de la conversion es de: "+resultado);



    }
}
