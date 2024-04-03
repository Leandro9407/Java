import java.util.Scanner;

public class Ejercicio2{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese temperatura: ");
        float temperatura=teclado_numero.nextFloat();

        float fahrenheit=((temperatura*9/5) +32);

        System.out.print("Grados Fahrenheit: " + fahrenheit);


    }
}