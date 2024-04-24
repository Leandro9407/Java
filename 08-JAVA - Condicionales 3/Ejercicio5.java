import java.util.Scanner;

public class Ejercicio5{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.println("0 para piedra");
        System.out.println("1 para papel");
        System.out.println("2 para tijera");
        System.out.print("Elije tu opcion: ");
        int opcion=teclado_numero.nextInt();

        int aleatorio=(int) (Math.random() * 3);

        if (opcion==0 && aleatorio==0){
            System.out.println("Empate");

        } else if (opcion==0 && aleatorio==1){
            System.out.println("Perdiste");

        } else if (opcion==0 && aleatorio==2){
            System.out.println("Ganaste");

        } else if (opcion==1 && aleatorio==0){
            System.out.println("Ganaste");

        } else if (opcion==1 && aleatorio==1){
            System.out.println("Empate");

        } else if (opcion==1 && aleatorio==2){
            System.out.println("Perdiste");

        } else if (opcion==2 && aleatorio==0){
            System.out.println("Perdiste");

        } else if (opcion==2 && aleatorio==1){
             System.out.println("Ganaste");

        } else if (opcion==2 && aleatorio==2){
             System.out.println("Empate");
        }

    }
}