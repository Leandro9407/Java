import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        int array_1[] = new int[1];
        array_1=numeroArray(array_1);
        System.out.print("Arreglo 1: [ ");
        for (int i=0; i<array_1.length; i++){
            System.out.print(array_1[i] + " ");
        }
        System.out.println("]");

        int array_2[] = new int[2];
        array_2=numeroArray(array_2);
        System.out.print("Arreglo_2: [ ");
        for (int i=0; i<array_2.length; i++){
            System.out.print(array_2[i] + " ");
        }
        System.out.println("]");

        int array_3[] = new int[3];
        array_3=numeroArray(array_3);
        System.out.print("Arreglo 3: [ ");
        for (int i=0; i<array_3.length; i++){
            System.out.print(array_3[i] + " ");
        }
        System.out.println("]");

        int array_4[] = new int[4];
        array_4=numeroArray(array_4);
        System.out.print("Arreglo 4: [ ");
        for (int i=0; i<array_4.length; i++){
            System.out.print(array_4[i] + " ");
        }
        System.out.println("]");

        int array_5[] = new int[5];
        array_5=numeroArray(array_5);
        System.out.print("Arreglo 5: [ ");
        for (int i=0; i<array_5.length; i++){
            System.out.print(array_5[i] + " ");
        }
        System.out.println("]");

    }

    public static int[] numeroArray(int[] arreglo){

        Scanner entrada = new Scanner (System.in);

        for (int i=0; i<arreglo.length; i++){
            System.out.print("Ingrese numero " + i + ": ");
            arreglo[i]=entrada.nextInt();
        }

        return arreglo;
    }

}


