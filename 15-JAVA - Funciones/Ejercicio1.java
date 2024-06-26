
public class Ejercicio1{

    public static void main (String[] args){

        int prueba_1 = suma(4, 5);
        System.out.println("El resultado de la suma es: " + prueba_1);
        int prueba_2 =suma(10, 20);
        System.out.println("El resultado de la suma es: " + prueba_2);
        int prueba_3 =suma(4, -9);
        System.out.println("El resultado de la suma es: " + prueba_3);
        int prueba_4 =suma(100000, 1);
        System.out.println("El resultado de la suma es: " + prueba_4);
        int prueba_5=suma(3, 10);
        System.out.println("El resultado de la suma es: " + prueba_5);

    }

    public static int suma(int num1, int num2){
        int operacion=num1+num2;
        return operacion;
       
    }

}