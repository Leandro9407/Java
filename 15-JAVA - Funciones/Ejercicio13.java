import java.util.Scanner;

public class Ejercicio13{

    public static void main (String[] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese numero de longitud del arreglo 1: ");
        int longitud = entrada.nextInt();

        int ascendente_1[] = new int[longitud];
        ascendente_1 = ascendente(ascendente_1);

        for (int i=0; i<ascendente_1.length; i++){
            System.out.println("Ingrese numero " + i + ": ");
            ascendente_1[i] = entrada.nextInt();
        }
        
        System.out.print("1 : [ ");
        for (int i=0; i<ascendente_1.length; i++){
        System.out.print(ascendente_1[i] + " ");
        }
        System.out.println("]");

    }

    public static int[] ascendente(int[] arreglo){

       for (int i=0; i<arreglo.length-1; i++) 
        for (int j=0; j<arreglo.length-i-1; j++){
            if (arreglo[j]<arreglo[j+1]){
                int aux = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = aux;
            }
        }

        return arreglo;
    }
}
