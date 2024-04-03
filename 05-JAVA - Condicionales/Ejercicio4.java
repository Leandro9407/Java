 import java.util.Scanner;

 public class Ejercicio4{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese primer numero: ");
        int numero_1=teclado_numero.nextInt();

        System.out.print("Ingrese segundo numero: ");
        int numero_2=teclado_numero.nextInt();

        System.out.print("Ingrese tercer numero: ");
        int numero_3=teclado_numero.nextInt();


        if (numero_1>numero_2 & numero_1>numero_3){

            System.out.println("El numero mayor es: " + numero_1);

        } else if (numero_2>numero_1 & numero_2>numero_3){

            System.out.println("El numero mayor es: " + numero_2);

        } else if (numero_3>numero_1 & numero_3>numero_2){

            System.out.println("El numero mayor es: " + numero_3);

        }


        if (numero_1<numero_2 & numero_1<numero_3){

            System.out.println("El numero menor es: " + numero_1);

        } else if (numero_2<numero_1 & numero_2<numero_3){

            System.out.println("El numero menor es: " + numero_2);

        } else if (numero_3<numero_1 & numero_3<numero_2){

            System.out.println("El numero menor es: " + numero_3);

        }

        

    }
 }