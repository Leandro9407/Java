import java.util.Scanner;

public class Ejercicio10{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Digite numero: ");
        float numero1=teclado_numero.nextFloat();

        System.out.print("Digite segundo numero: ");
        float numero2=teclado_numero.nextFloat();

        float division=numero1/numero2;
        //float resto=numero1%numero2;
        float resto= numero1-(division*numero2);

        System.out.println("Cociente: " + division);
        System.out.println("Resto: " + resto);




    }
}
