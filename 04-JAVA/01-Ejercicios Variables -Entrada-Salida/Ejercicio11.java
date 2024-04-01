import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese el radio: ");
        float radio=teclado_numero.nextFloat();

        double perimetro=(2 * 3.14) * radio;
        double area=3.14 * (radio * radio);

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);




    }
}