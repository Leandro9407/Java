import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese numero 1: ");
        float numero1=teclado_numero.nextFloat();

        System.out.print("Ingrese numero 2: ");
        float numero2=teclado_numero.nextFloat();

        System.out.print("Ingrese numero 3: ");
        float numero3=teclado_numero.nextFloat();

        float promedio=(numero1+numero2+numero3)/3;

        System.out.print("Promedio: " + promedio);
    }
}