import java.util.Scanner;

public class Prueba_lucacian{
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner (System.in);

        System.out.println("Bienvenido");

        System.out.print("Ingrese nombre: ");
        String nombre_usuario = teclado.nextLine();

        System.out.print("Ingrese valor de la compra: ");
        int valor_compra = teclado.nextInt();

        if (valor_compra>=200000){
            double bono = valor_compra*0.15;
            double total_pago = valor_compra - bono;
            System.out.println("Su bono de descuento es del 15%");
            System.out.println("Su total a pagar es $:" + total_pago);
            System.out.println("Gracias por su compra " + nombre_usuario);
        } else if (valor_compra>=50000 && valor_compra<=199999){
            double bono = valor_compra*0.02;
            double total_pago = valor_compra - bono;
            System.out.println("Su bono de descuento es del 2%");
            System.out.println("Su total a pagar es $:" + total_pago);
            System.out.println("Gracias por su compra " + nombre_usuario);
        } else if (valor_compra>=20000 && valor_compra<=499999){
            double bono = valor_compra*0.015;
            double total_pago = valor_compra - bono;
            System.out.println("Su bono de descuento es del 1.5%");
            System.out.println("Su total a pagar es $:" + total_pago);
            System.out.println("Gracias por su compra " + nombre_usuario);
        } else {
            System.out.println("Sin descuento");
            System.out.println("Su valor a pagar es: $" + valor_compra);
            System.out.println("Gracias por su compra " + nombre_usuario);
        }    
    }
}