import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese numero (maximo 6 digitos): ");
        int numero=entrada.nextInt();

        int cont=1;
        int a=0;

        if (numero<1000000){
   
            for (int i=100000; i>=1; i/=10){

            int generado=numero/i;
            numero=numero%i;
            a+=generado*cont;
            cont*=10;
        
            }

            System.out.println(a);

            if (numero==a){
                System.out.print("El numero es polindromo");
            } else {
                System.out.print("El numero no es polindromo");
            }

        } else {
            System.out.print("Error: numero mayor a 6 digitos");
        }



    }
}