public class Ejercicio3{

    public static void main (String[] args){

        int prueba_1 = multiplicacion(1, 1);
        System.out.println("El resultado de la multiplicacion es: " + prueba_1);
        int prueba_2 = multiplicacion(2, 10);
        System.out.println("El resultado de la multiplicacion es: " + prueba_2);
        int prueba_3 = multiplicacion(100, 200);
        System.out.println("El resultado de la multiplicacion es: " + prueba_3);
        int prueba_4 = multiplicacion(10000, 0);
        System.out.println("El resultado de la multiplicacion es: " + prueba_4);
        int prueba_5 = multiplicacion(300, 23);
        System.out.println("El resultado de la multiplicacion es: " + prueba_5);

    }

    public static int multiplicacion(int num1, int num2){
       int multiplicar = num1 * num2;
       return multiplicar;
    }



}