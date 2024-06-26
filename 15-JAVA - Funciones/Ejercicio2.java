public class Ejercicio2{

    public static void main (String[] args){

        int prueba_1 = resta(4, 76);
        System.out.println("El resultado de la resta es: " + prueba_1);
        int prueba_2 = resta(96, 1);
        System.out.println("El resultado de la resta es: " + prueba_2);
        int prueba_3 = resta(100, 100);
        System.out.println("El resultado de la resta es: " + prueba_3);
        int prueba_4 = resta(5, 0);
        System.out.println("El resultado de la resta es: " + prueba_4);
        int prueba_5 = resta(1000, 500);
        System.out.println("El resultado de la resta es: " + prueba_5);

    }

    public static int resta(int num1, int num2){
        int operacion = num1 - num2;
        return operacion;
    }    
}