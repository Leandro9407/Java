import java.util.Scanner;

public class Ejercicio6{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese edad: ");
        int edad=teclado_numero.nextInt();

        if (edad>17){
            System.out.println("Habilitado para votar");

        } else {
            System.out.println("No cumple con la edad para votar");
        }

    }
}
