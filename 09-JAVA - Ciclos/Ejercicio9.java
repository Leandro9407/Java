import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese numero: ");
        int numero=entrada.nextInt();

        double cont=1;
        int cont_primo=0;

        for (int i=1; i<=numero; i++){

            double primo=numero%cont;
    
            cont++;

            if (primo==0){
                cont_primo++;
                
            }

        }
                
            if (cont_primo==2){
                System.out.println("El numero ingresado es primo");

            } else if (cont_primo>2){
                System.out.println("El numero ingresado no es primo");
            }

        

        



        }


    }

