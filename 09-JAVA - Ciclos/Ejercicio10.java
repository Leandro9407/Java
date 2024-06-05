import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese numero: ");
        int numero=entrada.nextInt();

        int multi=numero*numero;
        int cont=1;
        int cont_primo=0;

        for (int i=1; i<=multi; i++){

            int primo=cont_primo%cont;
    
            cont++;

            if (primo==0){
                cont_primo++;
                System.out.print(", " + primo);
                
                
            }

        }
                



        }


    }

