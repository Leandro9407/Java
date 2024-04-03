import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese la altura: ");
        int altura=teclado_numero.nextInt();

        System.out.print("Ingrese el ancho: ");
        int ancho=teclado_numero.nextInt();

        int area=altura * ancho;

        System.out.println("Area: " + area);

    }
}
