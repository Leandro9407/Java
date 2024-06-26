import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner teclado_numero = new Scanner (System.in);
        Scanner texto = new Scanner (System.in);

        System.out.print("Ingrese longitud del arreglo: ");
        int longitud = teclado_numero.nextInt();

        String arreglo[] = new String[longitud];
        
        for (int i=0; i<arreglo.length; i++){

            System.out.print("Digite nombre: ");
            arreglo[i]=texto.nextLine();

        }

        for (int i=0; i<arreglo.length; i++){
            System.out.println("Nombre: " + i + ": " + arreglo[i]);
        }

        System.out.print("Digite nombre a comprobar: ");
        String comprobar = texto.nextLine();

        int cont=0;

        for (int i=0; i<arreglo.length; i++){
            if (arreglo[i].equals(comprobar)){
                System.out.println("Nombre encontrado");
                System.out.println("Posicion: " + i);
                cont++;
            } 
        }

        if (cont==0) {
            System.out.println("Nombre no encontrado");
        }


    }
}
