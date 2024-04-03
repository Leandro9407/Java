import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        int numero_1=teclado_numero.nextInt();

        System.out.print("Ingrese segundo numero: ");
        int numero_2=teclado_numero.nextInt();

        int suma=numero_1+numero_2;

        System.out.println("Resultado: " + suma);

    }
}