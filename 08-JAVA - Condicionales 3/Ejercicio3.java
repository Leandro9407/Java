import java.util.Scanner;

public class Ejercicio3{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado: ");
        float lado1=teclado_numero.nextFloat();

        System.out.print("Ingrese la longitud del segundo lado: ");
        float lado2=teclado_numero.nextFloat();

        System.out.print("Ingrese la longitud del tercer lado: ");
        float lado3=teclado_numero.nextFloat();

        if (lado1==lado2 && lado1==lado3 && lado2==lado1 && lado2==3 && lado3==lado1 && lado3==lado2){
            System.out.println("Triangulo Equilatero");

        } else if (lado1==lado2 || lado1==lado3 ||lado2==lado3 ){
            System.out.println("Triangulo Isosceles");

        } else if (lado1!=lado2 && lado1!=lado3 && lado2!=lado1 && lado2!=3 && lado3!=lado1 && lado3!=lado2){
            System.out.println("Triangulo Escaleno");
        }

    }
}