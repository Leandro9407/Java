import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese primer numero: ");
        int numero1=teclado_numero.nextInt();

        System.out.print("Ingrese segundo numero: ");
        int numero2=teclado_numero.nextInt();

        System.out.print("Ingrese tercer numero: ");
        int numero3=teclado_numero.nextInt();

        System.out.print("Ingrese cuarto numero: ");
        int numero4=teclado_numero.nextInt();

        if (numero1>numero2 & numero1>numero3 & numero1>numero4){
            System.out.println("Este es el numero mayor: " + numero1);

        } else if (numero2>numero1 & numero2>numero3 & numero2>numero4){
            System.out.println("Este es el numero mayor: " + numero2);

        } else if (numero3>numero1 & numero3>numero2 & numero3>numero4){
            System.out.println("Este es el numero mayor: " + numero3);

        } else if (numero4>numero1 & numero4>numero2 & numero4>numero3){
            System.out.println("Este es el numero mayor: " + numero4);

        }    

    }
}
