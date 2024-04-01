import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese precio del producto: $");
        int producto=teclado_numero.nextInt();

        System.out.print("Ingrese porcentaje de descuento: ");
        int porcentaje=teclado_numero.nextInt();

        double conversor=porcentaje / 100.0;
        double descuento=producto * conversor;
        double total=producto - descuento;

        System.out.println("Valor del descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);


    }
}