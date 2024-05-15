import java.util.Scanner;

public class Ejercicio3{
    public static void main (String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese numero de altura de piramide: ");
        int piramide=entrada.nextInt();

        int espacio=piramide-1;
        int equis=1;

        for (int i=1; i<=piramide; i++){

            for (int e=1; e<=espacio; e++){
                System.out.print(" ");
            }
            for (int x=1; x<=equis; x++){
                System.out.print("X");
            }
            System.out.println("");

            espacio-=1;
            equis+=2;

        }




    }
}