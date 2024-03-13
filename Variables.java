public class Variables{
    public static void main(String[] args){

        /*Variables de tipo primitivo

            Enteros
                byte: 8 bits: hasta 127
                short: 16 bits: hasta 32.767
                int: 32 bits: hasta 2.147.483.647 
                long: 64 bits: hasta 9 trillones

            Decimales o flotantes
                float: 32 bits
                double: 64 bits

            Boleanos
                boolean: verdadero - falso

            Caracteres
                char: 16 bits: letras

        */

       //Dato no primitivo inician en mayuscula

       String nombre="Leandro Arroyave";
     //Scanner entrada;
     //Math matematica;

       //____________________________________________

       byte edad=18;
       short turno=250;
       int cedula=1088315438;
       long telefono=3218224040l;      //para que el long sirve con un numero largo se le agrega la L al final de valor xxxxxL
       float nota=4.5f;         //para que el float sirva con un numero flotante se le agrega la f al final de valor xxxxxF
       double latitud=-29.456218643;
       boolean estado= true;
       char simbolo='@';

       System.out.println("Edad: " + edad);
       System.out.println("Turno: " + turno);
       System.out.println("Cedula: " + cedula);
       System.out.println("Telefono:: " + telefono);
       System.out.println("Nota: " + nota);
       System.out.println("Latitud: " + latitud);
       System.out.println("Estado :" + estado);
       System.out.println("Simbolo: " + simbolo);
       System.out.println("Nombre: " + nombre);



    }
}