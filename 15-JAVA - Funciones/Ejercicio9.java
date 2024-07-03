public class Ejercicio9 {
    
    public static void main(String[] args) {

        int vector_1[] = new int[5];
        vector_1=minimoArreglo(vector_1);
        System.out.print("Arreglo 1: [ ");
        for (int i=0; i<vector_1.length; i++){
            System.out.print( vector_1[i] + " ");
        }
        System.out.println("]");

        int primer_menor=101;

        for (int i=0; i<vector_1.length; i++){
            if (vector_1[i]<primer_menor){
                primer_menor=vector_1[i];
                
            }
        }

        System.out.println("El numero menor es: " + primer_menor);

        int vector_2[] = new int[10];
        vector_2 = minimoArreglo(vector_2);
        System.out.print("Arreglo 2: [ ");
        for (int i=0; i<vector_2.length; i++){
            System.out.print(vector_2[i] + " ");
        }
        System.out.println("]");

        int segundo_menor=101;

        for (int i=0; i<vector_2.length; i++){
            if (vector_2[i]<segundo_menor){
                segundo_menor=vector_2[i];
            }
        }

        System.out.println("El numero menor es: " + segundo_menor);

        int vector_3[] = new int[7];
        vector_3 = minimoArreglo(vector_3);
        System.out.print("Arreglo 3: [ ");
        for (int i=0; i<vector_3.length; i++){
            System.out.print(vector_3[i] + " ");
        }
        System.out.println("]");

        int tercer_menor=101;

        for (int i=0; i<vector_3.length; i++){
            if (vector_3[i]<tercer_menor){
                tercer_menor=vector_3[i];
            }
        }

        System.out.println("El numero menor es : " + tercer_menor);

        int vector_4[] = new int[3];
        vector_4 = minimoArreglo(vector_4);
        System.out.print("Arreglo 4: [ ");
        for (int i=0; i<vector_4.length; i++){
            System.out.print(vector_4[i] + " ");
        }
        System.out.println("]");

        int cuarto_menor=101;

        for (int i=0; i<vector_4.length; i++){
            if (vector_4[i]<cuarto_menor){
                cuarto_menor=vector_4[i];
            }
        }

        System.out.println("El numero menor es : " + cuarto_menor);


        int vector_5[] = new int[16];
        vector_5 = minimoArreglo(vector_5);
        System.out.print("Arreglo 5: [ ");
        for (int i=0; i<vector_5.length; i++){
            System.out.print(vector_5[i] + " ");
        }
        System.out.println("]");

        int quinto_menor=101;

        for (int i=0; i<vector_5.length; i++){
            if (vector_5[i]<quinto_menor){
                quinto_menor=vector_5[i];
            }
        }

        System.out.println("El numero menor es : " + quinto_menor);

    }   


    public static int[] minimoArreglo(int[] arreglo) {

        for (int i=0; i<arreglo.length; i++){
            arreglo[i]=(int) (Math.random()*100+1);
            
        }

        return arreglo;
        
    }
}
