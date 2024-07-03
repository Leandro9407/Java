public class Ejercicio7{


    public static void main(String[] args) {
        
        int arreglo_1[]=new int[8];
        arreglo_1=llenarArreglo(arreglo_1);
        System.out.print("Arreglo 1: [");
        for (int i=0; i<arreglo_1.length; i++){
            System.out.print(arreglo_1[i] + ", ");
        }
        System.out.println("]");

        int arreglo_2[]=new int[15];
        arreglo_2=llenarArreglo(arreglo_2);
        System.out.print("Arreglo 2: [");
        for (int i=0; i<arreglo_2.length; i++){
            System.out.print(arreglo_2[i] + ", ");
        }
        System.out.println("]");

        int arreglo_3[]=new int[3];
        arreglo_3=llenarArreglo(arreglo_3);
        System.out.print("Arreglo 3: [");
        for (int i=0; i<arreglo_3.length; i++){
            System.out.print(arreglo_3[i] + ", ");
        }
        System.out.println("]");

        int arreglo_4[]=new int[20];
        arreglo_4=llenarArreglo(arreglo_4);
        System.out.print("Arreglo 4: [");
        for (int i=0; i<arreglo_4.length; i++){
            System.out.print(arreglo_4[i] + ", ");
        }
        System.out.println("]");

        int arreglo_5[]=new int[12];
        arreglo_5=llenarArreglo(arreglo_5);
        System.out.print("Arreglo 5: [");
        for (int i=0; i<arreglo_5.length; i++){
            System.out.print(arreglo_5[i] + ", ");
        }
        System.out.println("]");

    }   

    public static int[] llenarArreglo(int[] arreglo){

        for (int i=0; i<arreglo.length; i++){
            arreglo[i]=(int) (Math.random()*100);
            
        }

        return arreglo;
    }

    
        
    
}    