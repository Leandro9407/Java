import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese numero (maximo 6 digitos): ");
        int numero=entrada.nextInt();

        int suma=0;

        System.out.print("El numero construido es: ");
        for(int i=0; i<numero; i++){
            int aleatorio=(int)(Math.random()*9+1);
            suma=aleatorio;
            System.out.print(aleatorio);
        }
        System.out.println("");
        System.out.print("Resultado producto: " + suma*2);


    }
}