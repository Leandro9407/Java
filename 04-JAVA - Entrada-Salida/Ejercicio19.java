import java.util.Scanner;

    public class Ejercicio19{
        public static void main(String[] args){

            Scanner teclado_numero=new Scanner (System.in);
            Scanner teclado_texto=new Scanner (System.in);

            System.out.print("Ingrese nombre: ");
            String nombre=teclado_texto.nextLine();

            System.out.print("Ingrese edad: ");
            int edad=teclado_numero.nextInt();

            System.out.print("Ingrese salario: ");
            int salario=teclado_numero.nextInt();


            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Salario: " + salario);

        }
    }