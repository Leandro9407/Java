import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args){

    Scanner entrada=new Scanner (System.in);

    System.out.print("Ingrese numero: ");
    int numero=entrada.nextInt();

    int arreglo[]=new int[numero];

    boolean buscar=true;
    int cont=0;

    while(buscar){

            int cont_primo=0;
            int aleatorio=(int) (Math.random()*100);
            int primo=0;

        for(int i=1; i<=aleatorio; i++){

           
            primo=aleatorio%i;
            

            if (primo==0){
                cont_primo++;
            }                
        }
            
            if (cont_primo==2){
                arreglo[cont]=aleatorio;
                cont++;
            }

            if (cont==numero){
                buscar=false;
            }

    }

    for (int j=0; j<arreglo.length; j++){
            System.out.println("Numero " + (j+1) + ": " + arreglo[j]);
        }
    
        

   
   





    }
}