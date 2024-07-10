public class Banco{
    public static void main (String [] args){

        CajeroElectronico cajero = new CajeroElectronico();

        cajero.abastecerCajero("Leandro", "entrarAlAdmin", 20, 15, 10, 8);
        cajero.imprimirCajero();




    }
}