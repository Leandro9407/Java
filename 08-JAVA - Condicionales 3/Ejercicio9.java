import java.util.Scanner;

public class Ejercicio9{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese numero (maximo seis digitos): ");
        int numero=teclado_numero.nextInt();

        int n1=numero/100000;
        int n2=(numero - (n1*100000))/10000;
        int n3=(numero - (n1*100000) - (n2*10000))/1000;
        int n4=(numero - (n1*100000) - (n2*10000) - (n3*1000))/100;
        int n5=(numero - (n1*100000) - (n2*10000) - (n3*1000)- (n4*100))/10;
        int n6=(numero - (n1*100000) - (n2*10000) - (n3*1000)- (n4*100) -(n5*10));

        if (numero<10){
            System.out.println(n6);

        } else if (numero<100 && numero>9){
            System.out.print(n6);
            System.out.print(n5);

        } else if (numero<1000 && numero>99){
            System.out.print(n6);
            System.out.print(n5);
            System.out.print(n4);

        } else if (numero<10000 && numero>999){
            System.out.print(n6);
            System.out.print(n5);
            System.out.print(n4);
            System.out.print(n3);


        } else if (numero<100000 && numero>9999){
            System.out.print(n6);
            System.out.print(n5);
            System.out.print(n4);
            System.out.print(n3);
            System.out.print(n2);


        } else if (numero<1000000 && numero>99999){
            System.out.print(n6);
            System.out.print(n5);
            System.out.print(n4);
            System.out.print(n3);
            System.out.print(n2);
            System.out.print(n1);

        }


    }
}
