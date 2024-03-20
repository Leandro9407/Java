import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner(System.in);

        System.out.print("Ingrese numero uno: ");
        int numeroUno= teclado_numero.nextInt();

        System.out.print("Ingrese numero dos: ");
        int numeroDos= teclado_numero.nextInt();

        System.out.println("numeroUno: " + numeroUno);
        System.out.println("numeroDos: " + numeroDos);

        numeroUno= numeroDos + numeroUno;
        numeroDos= numeroUno - numeroDos;
        numeroUno= numeroUno - numeroDos;

        System.out.println("numeroUno: " + numeroUno);
        System.out.println("numeroDos: " + numeroDos);


    }
}