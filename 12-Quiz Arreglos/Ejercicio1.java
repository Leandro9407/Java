import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese longitud del vector: ");
        int longitud=entrada.nextInt();

        int vector[]=new int[longitud];

        boolean buscar=false;
        int cont=0;

        while (cont<vector.length) {

            int aleatorio=(int) (Math.random()*1000+1);

                if (aleatorio%2==1){ 

                    for (int i=0; i<=longitud-1; i++){
                        if (aleatorio==vector[i]){
                            buscar=true;
                        }
                    }

                    if (buscar==false){
                        vector[cont]=aleatorio;
                        cont++;
                        
                    }

                }

        }

            for (int i=0; i<=longitud-1; i++){
                System.out.println("Numero impar " + (i+1) + ": " + vector[i]);
            }


    }
}