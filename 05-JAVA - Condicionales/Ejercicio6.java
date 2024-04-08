import java.util.Scanner;

public class Ejercicio6{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese numero: ");
        int numero=teclado_numero.nextInt();

        System.out.println("//----------------------------------------------//");
        System.out.println("     Menu:                                        ");
        System.out.println("     1. Primer digito.      2. Segundo digito.    ");
        System.out.println("     3. Tercer digito.      4. Cuarto digito.     ");
        System.out.println("     5. Quinto digito.      6. Sexto digito.      ");
        System.out.println("//----------------------------------------------//");

        int n1=numero/100000;
        int n2=(numero - (n1*100000))/10000;
        int n3=(numero - (n1*100000) - (n2*10000))/1000;
        int n4=(numero - (n1*100000) - (n2*10000) - (n3*1000))/100;
        int n5=(numero - (n1*100000) - (n2*10000) - (n3*1000) - (n4*100))/10;
        int n6=(numero - (n1*100000) - (n2*10000) - (n3*1000) - (n4*100) - (n5*10));

    
        System.out.print("Ingrese opcion: ");
        int opcion=teclado_numero.nextInt();
         
        if (opcion==1){
            System.out.println("El primer digito es: " + n1);

        } else if (opcion==2){
            System.out.println("El segundo digito es: " + n2);

        } else if (opcion==3){
            System.out.println("El tercer digito es: " + n3);

        } else if (opcion==4){
            System.out.println("El cuarto digito es: " + n4);

        } else if (opcion==5){
            System.out.println("El quinto digito es: " + n5);

        } else if (opcion==6){
            System.out.println("El sexto digito es: " + n6);

        }

    }
}
