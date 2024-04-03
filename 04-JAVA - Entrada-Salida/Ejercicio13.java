import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Digite segundos: ");
        int convertir=teclado_numero.nextInt();

        int horas=convertir/3600;
        int minutos=(convertir%3600)/60;
        int segundos=convertir%60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
        System.out.println(horas + ":" + minutos + ":" + segundos);


    }
}
