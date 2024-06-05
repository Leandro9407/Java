import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese numero (entre 1 y 6): ");
        int numero=entrada.nextInt();

        if (numero<7){

        int suma=0;
        int incremento=1;

        System.out.print("El numero construido es: ");
        for(int i=0; i<numero; i++){
            int aleatorio=(int)(Math.random()*9);
            suma+=aleatorio*incremento;
            incremento*=10;
        }
        System.out.println(suma);
        System.out.print("Resultado producto: " + suma*2);

    } else {
        System.out.print("Error: numero es superior a 6");
    }

    }
}