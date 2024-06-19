import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese numero: ");
        int numero=entrada.nextInt();

        int arreglo[]=new int[numero];

        int cont=0;

        while(cont<arreglo.length){
            int aleatoria=(int) (Math.random()*1000);
            if (aleatoria%2==1){
                arreglo[cont]=aleatoria;
                cont++;
                
            }
        }
        
            for (int i=0; i<numero; i++){
                System.out.println("Numero impar " + (i+1) + ": " + arreglo[i]);
            }
        


  







    }
}