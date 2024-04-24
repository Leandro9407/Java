import java.util.Scanner;

public class Ejercicio4{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese peso: ");
        int peso=teclado_numero.nextInt();

        System.out.print("Ingrese altura: ");
        float altura=teclado_numero.nextFloat();

        float imc=peso/(altura*altura);
        System.out.println(imc);

        if (imc<18.5){
            System.out.println("Bajo de peso");

        } else if (imc>18.5 && imc<25){
            System.out.println("Peso normal");

        } else if (imc>24.9 && imc<30){
            System.out.println("Sobrepeso");

        } else if (imc>29.9 && imc<35){
            System.out.println("Obesidad I");

        } else if (imc>34.9 && imc<40){
            System.out.println("Obesidad II");

        } else if (imc>39.9 && imc<50){
            System.out.println("Obesidad III");

        } else if (imc>49.9){
            System.out.println("Obesidad IV");
        }


    }
}