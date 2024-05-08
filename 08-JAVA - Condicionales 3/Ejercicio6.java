import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.println("Calendario gregoriano - 1");
        System.out.println("Calendario juliano - 2");
        int eleccion=teclado_numero.nextInt();

        System.out.println("3 - marzo, 4 - abril ...  13 - enero, 14 - febrero");
        System.out.print("Ingrese día del mes: ");
        int dia_mes=teclado_numero.nextInt();

        System.out.print("Ingrese mes: ");
        int mes=teclado_numero.nextInt();

        System.out.print("Ingrese año: ");
        int año=teclado_numero.nextInt();


        if (eleccion==1){
            int gregoriano=(dia_mes+(26*(mes+1)/10)+año%100+((año%100)/4)+((año/100)/4)+((año/100)*5))%7;
            System.out.println("Resultado: " + gregoriano);

            if (gregoriano==0){
                System.out.print("Sabado");
            } else if (gregoriano==1){
                System.out.print("Domingo");
            } else if (gregoriano==2){
                System.out.print("Lunes");
            } else if (gregoriano==3){
                System.out.print("Martes");
            } else if (gregoriano==4){
                System.out.print("Miercoles");
            } else if (gregoriano==5){
                System.out.print("Jueves");
            } else if (gregoriano==6){
                System.out.print("Viernes");
            } 
        
        }
        
        if (eleccion==2){
            int juliano=(dia_mes+(13*(mes+1)/5)+año%100+((año%100)/4)+5+((año/100)*6))%7;

            if (juliano==0){
                System.out.print("Sabado");
            } else if (juliano==1){
                System.out.print("Domingo");
            } else if (juliano==2){
                System.out.print("Lunes");
            } else if (juliano==3){
                System.out.print("Martes");
            } else if (juliano==4){
                System.out.print("Miercoles");
            } else if (juliano==5){
                System.out.print("Jueves");
            } else if (juliano==6){
                System.out.print("Viernes");
            } 
        }


        




    }
}