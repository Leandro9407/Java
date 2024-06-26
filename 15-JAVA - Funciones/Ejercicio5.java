public class Ejercicio5{

    public static void main (String[] args){

        potencia(4, 9);
        potencia(70, 10);
        potencia(1, 2);
        potencia(600, 200);
        potencia(8, 8);

    }

    public static void potencia(int num1, int num2){
        int elevado=num2*2;
        int calculado=num1*elevado;
        System.out.println("El resultado de la potencia es: " + calculado);
    }

}