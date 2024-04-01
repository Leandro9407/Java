import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese nota de matematicas: ");
        float matematicas=teclado_numero.nextFloat();

        System.out.print("Ingrese credito de matematicas: ");
        float credito_matematicas=teclado_numero.nextFloat();


        System.out.print("Ingrese nota de artes: ");
        float artes=teclado_numero.nextFloat();

        System.out.print("Ingrese credito de artes: ");
        float credito_artes=teclado_numero.nextFloat();


        System.out.print("Ingrese nota de lenguaje: ");
        float lenguaje=teclado_numero.nextFloat();

        System.out.print("Ingrese credito de lenguaje: ");
        float credito_lenguaje=teclado_numero.nextFloat();

        float suma_creditos=credito_matematicas+credito_artes+credito_lenguaje;
        float nota_1=(matematicas*credito_matematicas)/suma_creditos;
        float nota_2=(artes*credito_artes)/suma_creditos;
        float nota_3=(lenguaje*credito_lenguaje)/suma_creditos;

        System.out.println("Promedio poderado de matematicas: " + nota_1);
        System.out.println("Promedio ponderado de artes: " + nota_2);
        System.out.println("Promedio ponderado de lenguaje: " + nota_3);

    }
}
