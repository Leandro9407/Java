import java.util.Scanner;

public class Ejercicio7{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese numero: ");
        int numero=teclado_numero.nextInt();

        if (numero>99 & numero<1000){
            int n1=numero/100;
            int n2=(numero - (n1*100))/10;
            int n3=numero - (n1*100) - (n2*10); 

            if (n1==n3){
                System.out.println("El numero es polindromo");
            }else{
                System.out.println("El numero no es polindromo");
            }

        }else if (numero>999 & numero<10000){
            int n1=numero/1000;
            int n2=(numero - (n1*1000))/100;
            int n3=(numero - (n1*1000) - (n2*100))/10;
            int n4=numero - (n1*1000) - (n2*100) - (n3*10);

            if (n1==n4 & n2==n3 || n1==n3 & n2==n4){
                System.out.println("El numero es polindromo");
            } else {
                System.out.println("El numero no es polindromo");
            }

        } if (numero>9999 & numero<100000){
            int n1=numero/10000;
            int n2=(numero - (n1*10000))/1000;
            int n3=(numero - (n1*10000) - (n2*1000))/100;
            int n4=(numero - (n1*10000) - (n2*1000) - (n3*100))/10;
            int n5=numero - (n1*10000) - (n2*1000) - (n3*100) - (n4*10);

            if (n1==n5 & n2==n4 || n1==n4 & n2==n5){
                System.out.println("El numero es polindromo");

            } else {
                System.out.println("El numero no es polindromo");
            }

        } if (numero>99999 & numero<1000000){
            int n1=numero/100000;
            int n2=(numero - (n1*100000))/10000;
            int n3=(numero - (n1*100000) - (n2*10000))/1000;
            int n4=(numero - (n1*100000) - (n2*10000) - (n3*1000))/100;
            int n5=(numero - (n1*100000) - (n2*10000) - (n3*1000) - (n4*100))/10;
            int n6=numero - (n1*100000) - (n2*10000) - (n3*1000) - (n4*100) - (n5*10); 

            if (n1==n6 & n2==n5 & n3==n4 || n1==n4 & n2==n5 & n3==n6){
                System.out.println("El numero es polindromo");

            } else {
                System.out.println("El numero no es polindromo");
            }

        } else if (numero>999999 & numero<10000000){
            int n1=numero/1000000;
            int n2=(numero - (n1*1000000))/100000;
            int n3=(numero - (n1*1000000) - (n2*100000))/10000;
            int n4=(numero - (n1*1000000) - (n2*100000) - (n3*10000))/1000;
            int n5=(numero - (n1*1000000) - (n2*100000) - (n3*10000) - (n4*1000))/100;
            int n6=(numero - (n1*1000000) - (n2*100000) - (n3*10000) - (n4*1000) - (n5*100))/10;
            int n7=numero - (n1*1000000) - (n2*100000) - (n3*10000) - (n4*1000) - (n5*100) - (n6*10);             

            if (n1==n7 & n2==n6 & n3==n5 || n1==n5 & n2==n6 & n3==n7){
                System.out.println("El numero es palindromo");

            } else {
                System.out.println("El numero no es polindromo");
            }
        }

    }
}
