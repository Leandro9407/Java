import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese numero: ");
        int numero=entrada.nextInt();
       
        String guardado=" ";
        int contador=0;
        boolean buscar=true;
        int cont_primo=0;

        while (buscar){

            cont_primo=0;
            int cont_uno=0;
            
            int aleatorio=(int)(Math.random()*100+1);

            for(int j=0; j<aleatorio; j++){
                
            cont_uno++;    
            int primo=aleatorio%cont_uno;

            if (primo==0){
                cont_primo++;

            }

        }

        if (cont_primo==2){
            contador+=1;
            System.out.println("Primo " + contador + " generador: " + aleatorio);
        }

        if (contador==numero){
            buscar=false;
        }

        }

       // System.out.println("Primos aleatorios:");

       // for (int j=0; j<numero; j++){

            

           
       // }
            
        



    }
}
    

