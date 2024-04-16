import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese numero: ");
        int numero=teclado_numero.nextInt();

        int diviDos=numero%2;
        int diviTres=numero%3;
        int diviCinco=numero%5;

        if (diviDos==0 & diviTres==0 & diviCinco==0 | diviCinco==5){
            System.out.println("El numero es divisible por: 2, 3, y 5");

        } else {
            System.out.println("No es divisible por: 2, 3, y 5");
        }





    }
}
