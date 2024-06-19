import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);
        Scanner nombres= new Scanner (System.in);

        System.out.print("Ingrese longitud del vector: ");
        int longitud=entrada.nextInt();

        String vector[] = new String [longitud];

        for (int i=0; i<vector.length; i++){
            System.out.print("Ingresa nombre: ");
            vector[i]=nombres.nextLine();
            
        }

        
        for (int i=0; i<vector.length; i++){
            System.out.println(i + ". Nombre: " + vector[i]);
        }


    }
}