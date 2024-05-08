import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese un numero (maximo 6 digitos): ");
        int numero=teclado_numero.nextInt();

        int n1=numero/100000;
        int n2=(numero - (n1*100000))/10000;
        int n3=(numero - (n1*100000) - (n2*10000))/1000;
        int n4=(numero - (n1*100000) - (n2*10000) - (n3*1000))/100;
        int n5=(numero - (n1*100000) - (n2*10000) - (n3*1000) - (n4*100))/10;
        int n6=(numero - (n1*100000) - (n2*10000) - (n3*1000) - (n4*100) - (n5*10));

        if (numero<10){
            System.out.println("Digito uno: " + n6);

        } else if (numero<100 && numero>9){
            System.out.println("Digito uno: " + n5);
            System.out.println("Digito dos: " + n6);

        } else if (numero<1000 && numero>99){
            System.out.println("Digito uno: " + n4);
            System.out.println("Digito dos: " + n5);
            System.out.println("Digito tres: " + n6);

        } else if (numero<10000 && numero>999){
            System.out.println("Digito uno: " + n3);
            System.out.println("Digito dos: " + n4);
            System.out.println("Digito tres: " + n5);
            System.out.println("Digito cuatro: " + n6);

        } else if (numero<100000 && numero>9999){
            System.out.println("Digito uno: " + n2);
            System.out.println("Digito dos: " + n3);
            System.out.println("Digito tres: " + n4);
            System.out.println("Digito cuatro: " + n5);
            System.out.println("Digito cinco: " + n6);

        } else if (numero<1000000 && numero>99999){
            System.out.println("Digito uno: " + n1);
            System.out.println("Digito dos: " + n2);
            System.out.println("Digito tres: " + n3);
            System.out.println("Digito cuatro: " + n4);
            System.out.println("Digito cinco: " + n5);
            System.out.println("Digito seis: " + n6);
        }



    }
}
