public class Ejercicio6{

    public static void main (String[] args){
        mayor(1, 2, 3);
        mayor(7, 6, 5);
        mayor(10, 30, 20);
        mayor(4, 4, 4);
        mayor(100, 200, 500);

    }

    public static void mayor(int num1, int num2, int num3){

        if (num1>num2 && num1>num3){
            System.out.println(num1);
        } else if (num2>num1 && num2>num3){
            System.out.println(num2);
        } else if (num3>num1 && num3>num1){
            System.out.println(num3);
        } else {
            System.out.println(num1);

        }

    }
}