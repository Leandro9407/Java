import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base= teclado_numero.nextInt();

        System.out.print("Ingrese la altura ");
        int altura= teclado_numero.nextInt();

        int area=(base*altura)/2;

        System.out.print("El area de un tringulo es: " + area);


    }
}