import java.util.Scanner;

public class Ejercicio7{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese inversion: ");
        int inversion=teclado_numero.nextInt();

        System.out.print("Ingrese tasa de interes anual: ");
        int tasa=teclado_numero.nextInt();

        System.out.print("Ingrese frecuencia de capitalizacion: ");
        int capitalizacion=teclado_numero.nextInt();

        System.out.print("Ingrese tiempo de inversion: ");
        int tiempo=teclado_numero.nextInt();

         double interes=tasa/100.0;
         double cf=inversion*Math.pow(1+(interes/capitalizacion), capitalizacion*tiempo);
         double roundedCf=Math.round(cf*100.0)/100.0;

        System.out.println("El monto que recibes de interes compuesto es: " + roundedCf);
    
    }
}
