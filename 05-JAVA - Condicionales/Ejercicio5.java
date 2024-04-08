import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese primer numero: ");
        int numero_1=teclado_numero.nextInt();

        System.out.print("Ingrese segundo numero: ");
        int numero_2=teclado_numero.nextInt();

        System.out.print("Ingrese tercero numero: ");
        int numero_3=teclado_numero.nextInt();

        if (numero_1<numero_2 & numero_1<numero_3 & numero_2<numero_3){

            System.out.println("Se ingresaron en orden ascendente");

        } else if (numero_1>numero_2 & numero_1>numero_3 & numero_2>numero_3) {

            System.out.println("Se ingresaron en orden descendente");

        } else {
            System.out.println("Se ingresaon en desorden");
        }

    }
}