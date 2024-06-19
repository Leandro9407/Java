import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese longitud del vector: ");
        int longitud=entrada.nextInt();

        int vector[]=new int[longitud];

        for (int i=0; i<longitud; i++){
            System.out.print("Ingrese numero " + i + ": ");
            int numero=entrada.nextInt();  
            
            vector[i]=numero;

        }

        System.out.print("Numero vectores: ");
        for (int i=0; i<vector.length; i++){
            System.out.print(vector[i] + ", ");
        }


        System.out.println("");
      
        for (int i=1; i<vector.length; i++){

            for (int j=0; j<vector.length-1; j++){
                
                 if (vector[j]<vector[j+1]){
                    int aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                 }
            }
        }
        System.out.print("Numero de forma descendente: ");
        for (int i=0; i<vector.length; i++){
            System.out.print(vector[i] + ", ");
        }

    }    
}
