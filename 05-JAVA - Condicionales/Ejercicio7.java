import java.util.Scanner;

public class Ejercicio7{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.println("Ingrese numero maximo 10 digitos e inferior a 2 mil millones");
        System.out.print("Ingrese numero: ");
        int numero=teclado_numero.nextInt();

        int n1=numero/1000000000;
        int n2=(numero - (n1*1000000000))/1000000;
        int n3=(numero - (n1*1000000000)-(n2*1000000))/1000;
        int n4=(numero - (n1*1000000000)-(n2*1000000)-(n3*1000));

        System.out.println("Moneda: " + n1 + "." + n2 + "." + n3 + "." + n4);

        
    }
}
