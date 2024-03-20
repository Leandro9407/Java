import java.util.Scanner;

public class Ejercicio3{
    public static void main (String[] args){
        int aux;
        Scanner teclado_numero=new Scanner(System.in);

        System.out.print("Ingrese numero uno: ");
        int numero1=teclado_numero.nextInt();

        System.out.print("Ingrese numero dos: ");
        int numero2=teclado_numero.nextInt();

        System.out.println("numero1: " + numero1);
        System.out.println("numero2: " + numero2);

        aux = numero2;
        System.out.println("aux: " + aux);
        numero2 = numero1;
        System.out.println("numero2: " + numero2);
        numero1 = aux;
        System.out.println("numero1: " + aux);


    }
}