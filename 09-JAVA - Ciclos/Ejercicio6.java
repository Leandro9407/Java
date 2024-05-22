import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese posicion a saber de Fibonacci: ");
        int posicion=entrada.nextInt();

        int n1=0;
        int n2=1;
        int re=0;

        for (int i=1; i<=posicion; i++){
            re=n1;
            n1=n2+n1;
            n2=re;

        }

        System.out.print("El numero Fibonacci es: " + re);
    }
}
