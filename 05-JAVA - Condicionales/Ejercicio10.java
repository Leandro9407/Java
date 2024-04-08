import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese nota de Matematicas: ");
        float matematicas=teclado_numero.nextFloat();
        System.out.print("Ingrese nota de Español: ");
        float español=teclado_numero.nextFloat();
        System.out.print("Ingrese nota de Ingles: ");
        float ingles=teclado_numero.nextFloat();
        System.out.print("Ingrese nota de Ciencias Naturales: ");
        float naturales=teclado_numero.nextFloat();
        System.out.print("Ingrese nota de Deportes: ");
        float deportes=teclado_numero.nextFloat();
        System.out.println("");

        float promedio=(matematicas+español+ingles+naturales+deportes)/5;
        double roundedPromedio=Math.round(promedio * 100.0)/100.0;
        float sumatoria=matematicas+español+ingles+naturales+deportes;


        if (matematicas>español & matematicas>ingles & matematicas>naturales & matematicas>deportes){
            System.out.println("Asignatura con mejor nota: Matematicas");

        } else if (español>matematicas & español>ingles & español>naturales & español>deportes){
            System.out.println("Asignatura con mejor nota: Español");

        } else if (ingles>matematicas & ingles>español & ingles>naturales & ingles>deportes){
            System.out.println("Asignatura con mejor nota: Ingles");

        } else if (naturales>matematicas & naturales>español & naturales>ingles & naturales>deportes){
            System.out.println("Asignatura con mejor nota: Ciencias Naturales");

        } else if (deportes>matematicas & deportes>español & deportes>ingles & deportes>naturales){
            System.out.println("Asignatura con mejor nota: Deportes");
        }


        if (matematicas<español & matematicas<ingles & matematicas<naturales & matematicas<deportes){
            System.out.println("Asignatura con menor nota: Matematicas");

        } else if (español<matematicas & español<ingles & español<naturales & español<deportes){
            System.out.println("Asignatura con menor nota: Español");

        } else if (ingles<matematicas & ingles<español & ingles<naturales & ingles<deportes){
            System.out.println("Asignatura con menor nota: Ingles");

        } else if (naturales<matematicas & naturales<español & naturales<ingles & naturales<deportes){
            System.out.println("Asignatura con menor nota: Ciencias Naturales");

        } else if (deportes<matematicas & deportes<español & deportes<ingles & deportes<naturales){
            System.out.println("Asignatura con menor nota: Deportes");
        }


        System.out.println("Promedio de notas: " + roundedPromedio);

        if (promedio<3.0){

            if (matematicas<español & matematicas<ingles & matematicas<naturales & matematicas<deportes){
                float obtener=15-sumatoria;
                float aprobar_mate=matematicas+obtener;
                double roundedAprobar_mate=Math.round(aprobar_mate * 100.0)/100.0;
                System.out.println("Debio obtener una nota de " + roundedAprobar_mate + "en matematicas para aprobar el periodo");
    
            } else if (español<matematicas & español<ingles & español<naturales & español<deportes){
                float obtener=15-sumatoria;
                float aprobar_esp=español+obtener;
                double roundedAprobar_esp=Math.round(aprobar_esp * 100.0)/100.0;
                System.out.println("Debio obtener una nota de " + roundedAprobar_esp+ " en Español para aprobar el periodo");
    
            } else if (ingles<matematicas & ingles<español & ingles<naturales & ingles<deportes){
                float obtener=15-sumatoria;
                float aprobar_ing=ingles+obtener;
                double roundedAprobar_ing=Math.round(aprobar_ing * 100.0)/100.0;
                System.out.println("Debio obtener una nota de " + roundedAprobar_ing + " en Ingles para aprobar el periodo");
    
            } else if (naturales<matematicas & naturales<español & naturales<ingles & naturales<deportes){
                float obtener=15-sumatoria;
                float aprobar_natu=naturales+obtener;
                double roundedAprobar_natu=Math.round(aprobar_natu * 100.0)/100.0;
                System.out.println("Debio obtener una nota de " + roundedAprobar_natu + " en Ciencias Naturales para aprobar el periodo");
    
            } else if (deportes<matematicas & deportes<español & deportes<ingles & deportes<naturales){
                float obtener=15-sumatoria;
                float aprobar_dep=deportes+obtener;
                double roundedAprobar_dep=Math.round(aprobar_dep * 100.0)/100.0;
                System.out.println("Debio obtener una nota de " + roundedAprobar_dep + " en deportes para aprobar el periodo");
            }
    
        }
    }
}