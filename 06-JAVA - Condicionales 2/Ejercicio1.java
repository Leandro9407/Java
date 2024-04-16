import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese numero: ");
        int numero=teclado_numero.nextInt();

        if (numero>0){
            System.out.println("Numero positivo");

        } else if (numero<0){
            System.out.println("Numero negativo");
        }

    }
}