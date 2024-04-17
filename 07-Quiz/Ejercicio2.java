import java.util.Scanner;

public class Ejercicio2{
    public static void main (String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese nota de matematicas: ");
        float matematicas=teclado_numero.nextFloat();
        System.out.print("Ingrese creditos: ");
        int creditos_matematicas=teclado_numero.nextInt();

        System.out.print("Ingrese nota de español: ");
        float espanol=teclado_numero.nextFloat();
        System.out.print("Ingrese creditos: ");
        int creditos_espanol=teclado_numero.nextInt();

        System.out.print("Ingrese nota de ingles: ");
        float ingles=teclado_numero.nextFloat();
        System.out.print("Ingrese creditos: ");
        int creditos_ingles=teclado_numero.nextInt();

        System.out.print("Ingrese nota de ciencias naturales: ");
        float naturales=teclado_numero.nextFloat();
        System.out.print("Ingrese creditos: ");
        int creditos_naturales=teclado_numero.nextInt();

        System.out.print("Ingrese nota de deportes: ");
        float deportes=teclado_numero.nextFloat();
        System.out.print("Ingrese creditos: ");
        int creditos_deportes=teclado_numero.nextInt();

        float total_creditos=creditos_matematicas+creditos_espanol+creditos_ingles+creditos_naturales+creditos_deportes;

        float promedio_matematicas=matematicas*creditos_matematicas;
        float promedio_espanol=espanol*creditos_espanol;
        float promedio_ingles=ingles*creditos_ingles;
        float promedio_naturales=naturales*creditos_naturales;
        float promedio_deportes=deportes*creditos_deportes;

        float p_p=(promedio_matematicas+promedio_espanol+promedio_ingles+promedio_naturales+promedio_deportes)/total_creditos;

        if (p_p<2.9) {

        if (promedio_matematicas<promedio_espanol & promedio_matematicas<promedio_ingles & promedio_matematicas<promedio_naturales & promedio_matematicas<promedio_deportes){
            


        }

        }

        System.out.println("============  PROMEDIO  ============");

        System.out.println("Promedio Ponderado: "+ p_p);

    }
}