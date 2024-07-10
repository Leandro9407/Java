public class CajeroElectronico{
    int cantidadDineroTotal;
    int cantidadDineroDisponible;

    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;

    String nombreBanco;
    String[] listaTransaccion;
    String usuarioAdmin;
    String claveAdmin;


    public CajeroElectronico(){
        cantidadDineroTotal = 0;
        cantidadDineroDisponible = 0;

        cant_10 = 0;
        cant_20 = 0;
        cant_50 = 0;
        cant_100 = 0;

        nombreBanco = "";
        usuarioAdmin = "";
        claveAdmin = "";
    }

    public void abastecerCajero(String admin, String clave, int billete_10, int billete_20, int billete_50, int billete_100){
        cantidadDineroTotal = 3000000;
        cant_10 = billete_10;
        cant_20 = billete_20;
        cant_50 = billete_50;
        cant_100 = billete_100;
        cantidadDineroDisponible = (cant_10*10000) + (cant_20*20000) + (cant_50*50000) + (cant_100*100000);

        nombreBanco = "Banco de la nacion";
        usuarioAdmin = admin;
        claveAdmin = clave;
    }   

    public void imprimirCajero(){
            System.out.println(nombreBanco);
            System.out.println("Usuario administrador: " + usuarioAdmin);
            System.out.println("Clave: " + claveAdmin);
            System.out.println("Dinero limite: $" + cantidadDineroTotal);
            System.out.println("Dinero disponible: $" + cantidadDineroDisponible);
            System.out.println("Billetes de $10: " + cant_10);
            System.out.println("Billetes de $20: " + cant_20);
            System.out.println("Billetes de $50: " + cant_50);
            System.out.println("Billetes de $100: " + cant_100);
    }


    

    

}    