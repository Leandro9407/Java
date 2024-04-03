import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.println("Buen dia terricola");

        System.out.print("Ingrese edad: ");
        int edad=teclado_numero.nextInt();

        if (edad<18){
            System.out.println("Recibe auxilio de: $800.000");
        } else if (edad>17) {
            System.out.println("Debe pagar impuesto de: $200.000");

        }



    }
}