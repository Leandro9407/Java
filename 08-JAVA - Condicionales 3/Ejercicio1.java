import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese precio del producto: ");
        int precio=teclado_numero.nextInt();

        System.out.print("Ingrese tasa de descuento: ");
        float tasa=teclado_numero.nextFloat();

        float conversor=tasa/100;
        float descuento=precio*conversor;
        float precio_final=precio-descuento;

        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + precio_final);


    }
}