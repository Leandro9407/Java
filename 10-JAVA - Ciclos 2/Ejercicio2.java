import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){


        int dia=0;
        int mes=0;
        int ano=0;

        for (int i=0; i<31; i++){
            int uno=(int)(Math.random()*31+1);
            dia=uno;
   
        }

        for (int i=0; i<12; i++){
            int dos=(int)(Math.random()*12+1);
            mes=dos;
  
        }

        for (int i=0; i<2024; i++){
            int tres=(int)(Math.random()*2024+1);
            ano=tres;

            
        }

        System.out.print("Fecha generada: ");

        if (dia<10){
            System.out.print("0" + dia);
        } else{
            System.out.print(dia);
        }


        if (mes<10){
            System.out.print("0" + mes);

        } else{
            System.out.print(mes);
        }


        if (ano<1000){
            System.out.print("0"+ ano);

        } else{    
            System.out.print(ano);
        }




    }
    
    }

