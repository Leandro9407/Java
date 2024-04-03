import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese X: ");
        int numero_x=teclado_numero.nextInt();

        System.out.print("Ingrese Y: ");
        int numero_y=teclado_numero.nextInt();


        if (numero_x>0 & numero_y>0){

        System.out.println("Cordenada en el primer cuadrante");

        } else if (numero_x<0 & numero_y>0){

        System.out.println("Cordenada en el segundo cuadrante"); 

        } else if (numero_x<0 & numero_y<0){

         System.out.println("Cordenada en el tercer cuadrante"); 

        } else if (numero_x>0 & numero_y<0){

        System.out.println("Cordenada en el cuarto cuadrante");

        } 
    }
}