import java.util.Scanner;

public class Ejercicio18{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese peso: ");
        float peso=teclado_numero.nextFloat();

        System.out.print("Ingrese altura: ");
        float altura=teclado_numero.nextFloat();

        float imc=peso/(altura*altura);

        System.out.println("IMC: " + imc);

    }
}
