public class Ejercicio4{

    public static void main (String[] args){

        double prueba_1 = division(10, 4);
        System.out.println("El resultado de la division es: " + prueba_1);
        double prueba_2 = division(333, 222);
        System.out.println("El resultado de la division es: " + prueba_2);
        double prueba_3 = division(500, 1);
        System.out.println("El resultado de la division es: " + prueba_3);
        double prueba_4 = division(485, 485);
        System.out.println("El resultado de la division es: " + prueba_4);
        double prueba_5 = division(3, 8);
        System.out.println("El resultado de la division es: " + prueba_5);

    }

    public static double division(double num1, double num2){
        double operacion=num1 / num2;
        return operacion;
    }
}