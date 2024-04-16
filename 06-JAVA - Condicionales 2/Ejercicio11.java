import java.util.Scanner;

public class Ejercicio11{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese numero: ");
        int numero=teclado_numero.nextInt();

        float par=numero%2;

        if (par==0){
            System.out.println("El numero es par");

        } else {
            System.out.println("El numero es impar");
        }



    }
}
