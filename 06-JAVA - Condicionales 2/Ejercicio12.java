import java.util.Scanner;

public class Ejercicio12{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese precio del articulo: ");
        int precio=teclado_numero.nextInt();

        System.out.print("Ingrese el porcentaje de descuento: ");
        int porcentaje=teclado_numero.nextInt();

        if (porcentaje>0 && porcentaje<101){
            float conversor=(float) porcentaje/100;
            float descuento=precio*conversor;
            float total=precio-descuento;

            System.out.println("Descuento: $" + descuento);
            System.out.println("Valor a pagar: $" + total);

        } else {
            System.out.println("Descuento: sin descuento");
            System.out.println("Valor a pagar: $" + precio);
        }

    }
}

