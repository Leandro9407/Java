import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){

        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese numero (maximo 6 digitos): ");
        int numero=entrada.nextInt();

        int n1=numero/100000;
        int n2=(numero - (n1*100000))/10000;
        int n3=(numero - (n1*100000) - (n2*10000))/1000;
        int n4=(numero - (n1*100000) - (n2*10000) - (n3*1000))/100;
        int n5=(numero - (n1*100000) - (n2*10000) - (n3*1000) - (n4*100))/10;
        int n6=(numero - (n1*100000) - (n2*10000) - (n3*1000) - (n4*100) - (n5*10));

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);


    }
    
}
