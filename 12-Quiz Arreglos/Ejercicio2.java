import java.util.Scanner;

public class Ejercicio2{
    public static void main (String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese longitud del vector: ");
        int longitud=entrada.nextInt();

        int vector[]=new int[longitud];

        for (int i=0; i<=longitud-1; i++){
            int aleatorio=(int) (Math.random()*9999+1);

            vector[i]=aleatorio;
        }

        for (int i=0; i<=longitud-1; i++){
            System.out.println("Numero " + i + ": " + vector[i]);
        }

        System.out.print("Ingrese numero a encontrar: ");
        int encontrar=entrada.nextInt();

        int cont=0;
        int detener=0;

        for (int i=0; i<=longitud-1; i++){
                
            if (encontrar==vector[i]){
            
                detener++;
                System.out.print("Numero encontrado, posicion: " + cont);   
             }

            cont++;
   
        }
        
        if (detener==0) {
                    System.out.print("No se encontro el numero");
        
        }
       

            

    }
}