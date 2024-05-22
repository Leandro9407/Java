import java.util.Scanner;

public class Ejercicio5{
    public static void main (String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese numero: ");
        int numero=entrada.nextInt();

        int anterior=0;
        int adelantado=1;
        int suma;

        for (int i=1; i<=numero; i++){
            suma=anterior;
            anterior=adelantado+anterior;
            adelantado=suma;

            System.out.print(suma + ",");
        }


       }

    }
