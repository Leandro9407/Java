import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[] args){
        
        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese base: ");
        float base=teclado_numero.nextFloat();

        System.out.print("Ingrese altura: ");
        float altura=teclado_numero.nextFloat();

        float area=(base*altura)/2;
        double roundedArea=Math.round(area * 100.0)/100.0;

        System.out.println("El area de un es triangulo: " + roundedArea);


    }
}
