import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args){

    Scanner teclado_numero=new Scanner (System.in);

    System.out.print("ingrese año de nacimiento: ");
    int año=teclado_numero.nextInt();

    int edad=2024-año;

    if (edad>17){
        System.out.println("Es mayor de edad: " + edad);

    } else {
        System.out.println("Es menor de edad: " + edad);

    }

    }
}
