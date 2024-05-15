import java.util.Scanner;

public class Ejercicio2{
    public static void main (String[] args){

        Scanner entrada= new Scanner (System.in);

        System.out.print("Ingrese cantidad de materias: ");
        int cantidad=entrada.nextInt();

        float sumatoria=0;
        int suma_creditos=0;

        for (int i=1; i<=cantidad; i++){
            System.out.print("Ingrese nota de la materia " + i + ": ");
            float nota=entrada.nextFloat();

            System.out.print("Ingrese creditos de la materia " + i + ": ");
            int creditos=entrada.nextInt();

            suma_creditos+=creditos;
            sumatoria+=nota*creditos;
        }

        System.out.println("Total de credito: " + suma_creditos);
        System.out.println("Promedio del semestre: " + (sumatoria/suma_creditos));


    }
}