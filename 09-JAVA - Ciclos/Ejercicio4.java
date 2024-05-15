import java.util.Scanner;

public class Ejercicio4{
    public static void main (String[] args){

        Scanner entradas=new Scanner (System.in);

        System.out.println("|---------- Bienvenido ---------|");
        System.out.println("| 1. Docente                    |");
        System.out.println("| 2. Estudiante                 |");
        System.out.println("| 3. Salir                      |");
        System.out.println("|-------------------------------|");
        System.out.println("--> Ingrese una opcion: ");
        int opcion=entradas.nextInt();


        While (opcion!=3) {

        System.out.println("|---------- Bienvenido ---------|");
        System.out.println("| 1. Docente                    |");
        System.out.println("| 2. Estudiante                 |");
        System.out.println("| 3. Salir                      |");
        System.out.println("|-------------------------------|");
        System.out.println("--> Ingrese una opcion: ");
        int opcion=entradas.nextInt();

        if (opcion==1){

            System.out.print("Ingrese cantidad de notas: ");
        int cantidad=entradas.nextInt();

        float sumatoria=0;

        for (int i=0; i<cantidad; i++){
            System.out.print("Ingrese nota " + (i+1) + ": ");
            float nota=entradas.nextFloat();

            sumatoria+=nota; 
        }

        float promedio=sumatoria/cantidad;
        System.out.print("Promedio de nota obtenida: " + promedio);


        } else if (opcion==2){

            System.out.print("Ingrese cantidad de materias: ");
        int cantidad=entradas.nextInt();

        float sumatoria=0;
        int suma_creditos=0;

        for (int j=1; j<=cantidad; j++){
            System.out.print("Ingrese nota de la materia " + j + ": ");
            float nota=entradas.nextFloat();

            System.out.print("Ingrese creditos de la materia " + j + ": ");
            int creditos=entradas.nextInt();

            suma_creditos+=creditos;
            sumatoria+=nota*creditos;
        }

        System.out.println("Total de credito: " + suma_creditos);
        System.out.println("Promedio del semestre: " + (sumatoria/suma_creditos));


        }


        }

    }
}