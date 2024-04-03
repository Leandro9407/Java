import java.util.Scanner;

public class Ejercicio15{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese longitud de metros: ");
        double metros=teclado_numero.nextDouble();

        double centimetros=metros*100;
        double pulgadas=metros*393701;
        double pies=metros*328084;

        System.out.println("Centimetros: " + centimetros);
        System.out.println("Pulgadas: " + pulgadas);
        System.out.println("Pies: " + pies);
    }
}