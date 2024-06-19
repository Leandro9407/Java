import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese la cantidad de numeros del vector: ");
        int cantidad=entrada.nextInt();

        int arreglo[]= new int[cantidad];

        int cont=0;

        for (int i=0; i<cantidad; i++){

            System.out.print("Ingrese numero del vector  " + (i) + ": ");
             int numero=entrada.nextInt();

            arreglo[cont]=numero;
            cont++;
        }


        System.out.print("Ingrese numero del indice: ");
        int indice=entrada.nextInt();

        System.out.print("Anti horario: ");

        for (int i=indice; i>=0; i--){
    
            System.out.print(arreglo[i] + "-");

        }


        for (int j=cont-1; j>indice; j--){

            System.out.print("-" + arreglo[j]);
        }




    }
}