import java.util.Scanner;

public class Entradas{
    public static void main(String[] args){

        //Creando variable para entrada de datos, en este caso por teclado
        Scanner teclado_numero=new Scanner(System.in);  //Scanner nombre variable=new...
        Scanner teclado_texto=new Scanner(System.in);

        //Pidiendo datos al usuario
        System.out.print("Ingrese la edad: ");  //print LN= es para generar una nueva linea
        int edad=teclado_numero.nextInt();         //en el next la varibla siempre empieza con mayuscula

        //Imprimiendo datos de variables
        System.out.println("=> La edad ingresada fue: " + edad);
        

        System.out.print("Ingrese edad de su companero: ");
        byte companero=teclado_numero.nextByte();
        System.out.println("=> La edad del companero fue: " + companero);

        System.out.print("Ingrese el turno: ");
        short turno=teclado_numero.nextShort();

        System.out.print("Ingrese la cedula: ");
        int cedula=teclado_numero.nextInt();

        System.out.print("Ingrese nota: ");
        float nota=teclado_numero.nextFloat();

         System.out.print("Ingrese latitud: ");
        double latitud=teclado_numero.nextDouble();

         System.out.print("Ingrese estado (true - false): ");
        boolean estado=teclado_numero.nextBoolean();

        System.out.print("Ingrese un simbolo: ");
        char simbolo=teclado_texto.nextLine().charAt(0);

        System.out.print("Ingrese nombre completo: ");
        String nombres=teclado_texto.nextLine();

        //Imprimir datos de variables
        System.out.println("=> La edad ingresada fue: " + edad);
        System.out.println("=> El turno ingresado fue: " + turno);
        System.out.println("=> La cedula ingresado fue: " + cedula);
        System.out.println("=> La nota ingresado fue: " + nota);
        System.out.println("=> La latitud ingresado fue: " + latitud);
        System.out.println("=> El estado ingresado fue: " + estado);
        System.out.println("=> El simbolo ingresado fue: " + simbolo);
        System.out.println("=> El nombre ingresado fue: " + nombres);


    }
}