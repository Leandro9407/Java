import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese numero: ");
        int numero=teclado_numero.nextInt();


        if (numero>99 & numero<1000){

            int residuo=numero%2;

            if (residuo==1){

            System.out.println("El numero ingresado es: impar.");

            }else

            System.out.println("El numero ingresado es: par.");

        } else {

            System.out.println("El numero no tiene 3 digitos.");
        }


        }

    }
