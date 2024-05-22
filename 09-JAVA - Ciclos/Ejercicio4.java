import java.util.Scanner;

public class Ejercicio4{
   public static void main (String[] args){     
        
       Scanner entradas=new Scanner (System.in);
       
        int i=0;

       while (i!=3){

        System.out.println("|------------ Bienvenido -------------|");
        System.out.println("| 1. Docente                          |");
        System.out.println("| 2. Estudiante                       |");
        System.out.println("| 3. Salir                            |");
        System.out.println("|-------------------------------------|");

        System.out.print("Ingrese opcion: ");
        System.out.println("");
        int opcion=entradas.nextInt();

        if (opcion==1){
            System.out.println("---------- Docente -----------");
            System.out.print("Ingrese cantidad de notas: ");
        int cantidad=entradas.nextInt();

        float sumatoria=0;

        for (int j=0; j<cantidad; j++){
            System.out.print("Ingrese nota " + (j+1) + ": ");
            float nota=entradas.nextFloat();

            sumatoria+=nota; 
        }

        float promedio=sumatoria/cantidad;
        System.out.println("Promedio de nota obtenida: " + promedio);
        System.out.println("");
        
        i=1;
        
        } else if (opcion==2){
            System.out.println("--------- Estudiante ----------");
            System.out.print("Ingrese cantidad de materias: ");
            int cantidad=entradas.nextInt();
    
            float sumatoria=0;
            int suma_creditos=0;
    
            for (int c=1; c<=cantidad; c++){
                System.out.print("Ingrese nota de la materia " + c + ": ");
                float nota=entradas.nextFloat();
    
                System.out.print("Ingrese creditos de la materia " + c + ": ");
                int creditos=entradas.nextInt();
    
                suma_creditos+=creditos;
                sumatoria+=nota*creditos;
            }
    
            System.out.println("Total de credito: " + suma_creditos);
            System.out.println("Promedio del semestre: " + (sumatoria/suma_creditos));
            System.out.println("");
            
            i=2;

       } else {
        i=3;
        System.out.println("->¡Hasta luego!");
       }

    }
}

}
