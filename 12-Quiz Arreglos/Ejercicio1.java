import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese longitud del vector: ");
        int longitud=entrada.nextInt();

        int vector[]=new int[longitud];

        
        for (int i=0; i<=longitud-1; i++){
            int aleatorio=(int) (Math.random()*100+1);
            
            int impar=aleatorio%2;

            if (impar==1){
                vector[i]=aleatorio;
            } else {
                i--;
            }
        
        }


            for (int i=0; i<=longitud-1; i++){
                System.out.println("Numero impar " + (i+1) + ": " + vector[i]);
            }


    }
}