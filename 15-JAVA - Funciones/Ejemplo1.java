public class Ejemplo1{

    public static void main (String[] args){

        String nombre="PERRAS";
        saludarPersona(nombre);
    System.out.println("--------------------------------------");
        mostrarResta(8, 3);
        mostrarResta(3, 8);
    System.out.println("--------------------------------------");
        int valor = suma(1,2,3);
        System.out.println("Valor suma: " + valor);

    }

    public static int suma (int num1, int num2, int num3){
        int respuesta = num1+num2+num3;
        return respuesta;
    }

    //Funcion sin valor devuelto y con datos de entrada
    public static void mostrarResta(int num1, int num2){
        int resta = num1 - num2;
        System.out.println("El resultado de la resta es: " + resta);
    }

    //Funcion sin valor devuelto y sin datos de entrada
    public static void saludar(){
        System.out.println("|-----------------------|");
        System.out.println("|      HOLA MUNDO       |");
        System.out.println("|-----------------------|");
    }

    //Funcion sin valor devuelto y sin datos de entrada
    public static void saludarPersona(String nombre){
        System.out.println("|-----------------------|");
        System.out.println("|      HOLA " + nombre   );
        System.out.println("|-----------------------|");
    }

}