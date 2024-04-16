import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese primera nota: ");
        float nota1=teclado_numero.nextFloat();

        System.out.print("Ingrese segunda nota: ");
        float nota2=teclado_numero.nextFloat();

        System.out.print("Ingrese tercera nota: ");
        float nota3=teclado_numero.nextFloat();

        float promedio=(nota1+nota2+nota3)/3;
        double roundedPromedio=Math.round(promedio * 100.0) / 100.0;

        System.out.println("Promedio: " + roundedPromedio);
        

        if (promedio>=7){
            System.out.println("Aprobado");

        } else {
            System.out.println("Reprobado");

        }

    }
}
