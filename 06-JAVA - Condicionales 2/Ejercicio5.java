import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
    
    Scanner teclado_numero=new Scanner (System.in);

    System.out.print("Ingrese año: ");
    int año=teclado_numero.nextInt();

        float bisiesto1=año%4;
        float bisiesto2=año%100;
        float bisiesto3=año%400;

        if (bisiesto1==0 && bisiesto2!=0 || bisiesto3==0){
            System.out.println("Año bisiesto");

        } else {
            System.out.println("Año no bisiesto");

        }


    }
}