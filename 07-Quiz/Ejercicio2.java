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

        //total creditos
        float total_creditos=creditos_matematicas+creditos_espanol+creditos_ingles+creditos_naturales+creditos_deportes;

        //ponderado de cada nota
        float promedio_matematicas=matematicas*creditos_matematicas;
        float promedio_espanol=espanol*creditos_espanol;
        float promedio_ingles=ingles*creditos_ingles;
        float promedio_naturales=naturales*creditos_naturales;
        float promedio_deportes=deportes*creditos_deportes;

        //promedio ponderado
        float p_p=(promedio_matematicas+promedio_espanol+promedio_ingles+promedio_naturales+promedio_deportes)/total_creditos;
        double roundedp_p=Math.round(p_p * 100.0)/100.0;

        System.out.println("================================");
        System.out.println("=          CALCULADO           =");
        System.out.println("================================");

        System.out.println("Promedio Ponderado: " + roundedp_p);


        if (roundedp_p<3) {

        if (matematicas<espanol && matematicas<ingles && matematicas<naturales && matematicas<deportes){
            float p_matematicas=(3*(total_creditos)-promedio_espanol-promedio_ingles-promedio_naturales-promedio_deportes)/creditos_matematicas;
            System.out.println("Para obtener promedio de 3,0 - Se necesita la nota de matematicas en " + p_matematicas); 

        } else if (espanol<matematicas && espanol<ingles && espanol<naturales && espanol<deportes){
           float p_espanol=(3*(total_creditos)-promedio_matematicas-promedio_ingles-promedio_naturales-promedio_deportes)/creditos_espanol;
            System.out.println("Para obtener promedio de 3,0 - Se necesita la nota de español en " + p_espanol);

        } else if (ingles<matematicas && ingles<espanol && ingles<naturales && ingles<deportes){
           float p_ingles=(3*(total_creditos)-promedio_matematicas-promedio_espanol-promedio_naturales-promedio_deportes)/creditos_ingles;
            System.out.println("Para obtener promedio de 3,0 - Se necesita la nota de ingles en " + p_ingles);

        } else if (naturales<matematicas && naturales<espanol && naturales<ingles && naturales<deportes){
           float p_naturales=(3*(total_creditos)-promedio_matematicas-promedio_espanol-promedio_ingles-promedio_deportes)/creditos_naturales;
            System.out.println("Para obtener promedio de 3,0 - Se necesita la nota de ciencias naturales en " + p_naturales);

        } else if (deportes<matematicas && deportes<espanol && deportes<ingles && deportes<naturales){
           float p_deportes=(3*(total_creditos)-promedio_matematicas-promedio_espanol-promedio_ingles-promedio_naturales)/creditos_deportes;
            System.out.println("Para obtener promedio de 3,0 - Se necesita la nota de deportes en " + p_deportes);
        
        }

    }
       

        }
    }
