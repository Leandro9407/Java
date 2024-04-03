import java.util.Scanner;

    public class Ejercicio20{
        public static void main(String[] args){

            Scanner teclado_numero=new Scanner (System.in);

            System.out.print("Ingrese numero: ");
            int numero=teclado_numero.nextInt();

            
            int numero1=numero/10000;
            int numero2=(numero - (numero1*10000)) / 1000;
            int numero3=(numero - (numero1*10000) - (numero2*1000)) / 100;
            int numero4=(numero - (numero1*10000) - (numero2*1000) - (numero3*100)) / 10;
            int numero5=(numero - (numero1*10000) - (numero2*1000) - (numero3*100) - (numero4*10));

            int suma=numero1+numero2+numero3+numero4+numero5;

            System.out.println(numero1);
            System.out.println(numero2);
            System.out.println(numero3);
            System.out.println(numero4);
            System.out.println(numero5);
            System.out.println("Sumatoria: " + suma);

        }
    }