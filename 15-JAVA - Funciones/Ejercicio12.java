public class Ejercicio12 {
    
    public static void main (String[] args){

       boolean primo_1 = primo(20);
       System.out.println("Numero 20: " + primo_1);

       boolean primo_2 = primo(5);
       System.out.println("Numero 5: " + primo_2);

       boolean primo_3 = primo(35);
       System.out.println("Numero 35: " + primo_3);
        
       boolean primo_4 = primo(41);
       System.out.println("Numero 41: " + primo_4);

       boolean primo_5 = primo(9);
       System.out.println("Numero 9: " + primo_5);


    }

    public static boolean primo(int num1){

        int cont = 0;

        for (int i=1; i<=num1; i++){

            if (num1%i==0){
                cont++;
            }
        }

        if (cont==2){
            return true;
        } else {
            return false;
        }
    }


}
