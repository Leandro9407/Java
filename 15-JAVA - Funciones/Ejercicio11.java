public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        factorial(5);
        factorial(7);
        factorial(9);
        factorial(12);
        factorial(14);
    }

    public static void factorial(int longitud){
        long cont=1;
        long variable_m=1;
        long variable_r=0;

        for (int i=0; i<longitud-1; i++){
           cont++;
           variable_m = (cont*variable_m);
           variable_r = variable_m; 
           variable_m = variable_r;
        }
        
        System.out.println("Factorial: " + variable_r);
    }
}
