public class Ejercicio10 {
    
    public static void main (String[] args){

        int promedio_1[] = new int[4];
        promedio_1 = promedio_arreglo(promedio_1);

        float sumatoria_1=0;
        int conteo_1=0;

        System.out.print("Arreglo 1: [ ");
        for (int i=0; i<promedio_1.length; i++){
            System.out.print(promedio_1[i] + " ");
            sumatoria_1+=promedio_1[i];
            conteo_1++;
        }
        System.out.println("]");
        System.out.println("Promedio: " + (sumatoria_1/conteo_1));
        
        int promedio_2[] = new int[10];
        promedio_2 = promedio_arreglo(promedio_2);

        float sumatoria_2=0;
        int conteo_2=0;

        System.out.print("Arreglo 2: [ ");
        for (int i=0; i<promedio_2.length; i++){
            System.out.print(promedio_2[i] + " ");
            sumatoria_2+=promedio_2[i];
            conteo_2++;
        }
        System.out.println("]");
        System.out.println("Promedio: " + sumatoria_2/conteo_2);


        int promedio_3[] = new int[7];
        promedio_3 = promedio_arreglo(promedio_3);

        float sumatoria_3=0;
        int conteo_3=0;

        System.out.print("Arreglo 3: [ ");
        for (int i=0; i<promedio_3.length; i++){
            System.out.print(promedio_3[i] + " ");
            sumatoria_3+=promedio_3[i];
            conteo_3++;
        }
        System.out.println("]");
        System.out.println("Promedio: " + sumatoria_3/conteo_3);


        int promedio_4[] = new int[5];
        promedio_4 = promedio_arreglo(promedio_4);

        float sumatoria_4=0;
        int conteo_4=0;

        System.out.print("Arreglo 4: [ ");
        for (int i=0; i<promedio_4.length; i++){
            System.out.print(promedio_4[i] + " ");
            sumatoria_4+=promedio_4[i];
            conteo_4++;
        }
        System.out.println("]");
        System.out.println("Promedio: " + sumatoria_4/conteo_4);


        int promedio_5[] = new int[14];
        promedio_5 = promedio_arreglo(promedio_5);

        float sumatoria_5=0;
        int conteo_5=0;

        System.out.print("Arreglo 5: [ ");
        for (int i=0; i<promedio_5.length; i++){
            System.out.print(promedio_5[i] + " ");
            sumatoria_5+=promedio_5[i];
            conteo_5++;
        }

        System.out.println("]");
        System.out.println("Promedio: " + (sumatoria_5/conteo_5));
    }

    public static int[] promedio_arreglo(int[] arreglo){
        for (int i=0; i<arreglo.length; i++){
            arreglo[i] = (int) (Math.random()*100+1);

        }    

        return arreglo;
    }

}
