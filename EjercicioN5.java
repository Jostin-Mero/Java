//Escribe un programa que calcule el salario semanal de un empleado en base a
//las horas trabajadas, a razón de 12 euros la hora.
import java.util.Scanner;
public class EjercicioN5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pago;
        double horas, elpago;
        horas=0;
        pago=12;

        System.out.println("Cuantas horas haz trabajado: ");
        horas = sc.nextDouble();

        System.out.println("El pago por hora son de: "+ pago +" euro");
        
        elpago = horas*pago;
        System.out.println("Tu pago semanal es de: "+elpago +" euro");
    }
}