import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese longitud del vector: ");
        int longitud=entrada.nextInt();

        int vector[]=new int[longitud];

        for (int i=0; i<longitud; i++){

            System.out.print("Ingrese numero " + i + ": ");
            int numero=entrada.nextInt();

            vector[i]=numero;
        }

        System.out.print("Ingrese numero de movimientos: ");
        int movimientos=entrada.nextInt();

        boolean buscar=false;
        int cont=0;
        int primer_numero=0;

        while (buscar==false){

            System.out.print("Movimiento " + (cont+1) + ": {");

            primer_numero=vector[0];

            for (int i=0; i<longitud-1; i++){  
                vector[i]=vector[i+1];
            }

            vector[longitud-1]=primer_numero;

            for (int i=0; i<longitud; i++){  
                System.out.print(vector[i] + ", ");
            }

            System.out.println("}");

            cont++;

            if (cont==movimientos){
                buscar=true;
            }

        }

       
        

        



    }
    
}
