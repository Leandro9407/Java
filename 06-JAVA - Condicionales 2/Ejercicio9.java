import java.util.Scanner;

public class Ejercicio9{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese horas trabajadas: ");
        int horas=teclado_numero.nextInt();

        System.out.print("Ingrese tarifa de la hora: ");
        int tarifa=teclado_numero.nextInt();

        int pago=horas*tarifa;

        if (horas>40){
            double extra=pago*0.5;
            double total=pago+extra;
            System.out.println("Incremento: " + extra);
            System.out.println("Salario total: " + total);

        } else {
            System.out.print("Salario: " + pago);
        }
    }
}
