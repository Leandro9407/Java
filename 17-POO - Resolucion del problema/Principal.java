public class Principal{
    public static void main(String[] args){

        //Instancia                                                    Contructor
        CajeroElectronico cajero01 = new CajeroElectronico(500000000, 0, 0, 0, 0, "Banco de la republica", "Leandro", 59684);
        CajeroElectronico cajero02 = new CajeroElectronico(180000000, 1000, 1000, 1000, 1000, "Banpolombia", "Uribe",  66999);

        cajero01.imprimirDetalle();
        //cajero02.imprimirDetalle();

        cajero01.abastecerCajero("Leandro", 59684, 5000, 5000, 5000, 5000);
        cajero01.abastecerCajero("Edison", 59684, 5000, 5000, 5000, 5000);
        cajero01.abastecerCajero("Leandro", 4568, 5000, 5000, 5000, 5000);
        cajero01.abastecerCajero("Leandro", 59684, 50, 50, 50, 50);

        cajero01.verHistorialCajero("Leandro", 59684);

        cajero01.imprimirDetalle();


    }
}