import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese cantidad de notas: ");
        int cantidad=teclado_numero.nextInt();

        float sumatoria=0;

        for (int i=0; i<cantidad; i++){
            System.out.print("Ingrese nota " + (i+1) + ": ");
            float nota=teclado_numero.nextFloat();

            sumatoria+=nota; 
        }

        float promedio=sumatoria/cantidad;
        System.out.print("Promedio de nota obtenida: " + promedio);

    }
}