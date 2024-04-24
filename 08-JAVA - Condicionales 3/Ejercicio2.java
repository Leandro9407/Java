import java.util.Scanner;

public class Ejercicio2{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese precio original: ");
        int precio_original=teclado_numero.nextInt();

        System.out.print("Ingrese precio final: ");
        int precio_final=teclado_numero.nextInt();

        if (precio_original>precio_final){
            int resta=precio_original-precio_final;
            float resul=resta*100;
            float total=resul/precio_original;

            System.out.println("Porcentaje de descuento: " + total);
            System.out.println("Valor descuento: $" + resta);

        } else if (precio_original==precio_final){

            System.out.println("Precios iguales, no tienen descuento");

        } else if (precio_original<precio_final){

            System.out.println("Error");
        }



    }
}