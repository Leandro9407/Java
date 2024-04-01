import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese el monton inicial: ");
        float monto_inicial=teclado_numero.nextFloat();

        System.out.print("Ingrese tasa de interes anual: ");
        float tasa_interes=teclado_numero.nextFloat();

        System.out.print("Ingrese numero de periodos: ");
        float periodo=teclado_numero.nextFloat();

        System.out.print("Ingrese el tiempo de inversion: ");
        float tiempo=teclado_numero.nextFloat();

        float porcentaje=tasa_interes/100;
        double interes_compuesto=monto_inicial*(1+(porcentaje/periodo)*(periodo*tiempo));
        
        System.out.println("Interes compuesto de: " + interes_compuesto);

       

    }
}
