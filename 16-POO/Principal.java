public class Principal{
    public static void main (String[] args){

    //instancia de clase  |  NOTA: Persona es un objeto

        Persona per01 = new Persona(108864, "Oscar", "Loaiza", 130.6, 1.88, 80);
        Persona per02 = new Persona(108831, "Leandro", "Arroyave", 66.8, 1.75, 90);

        per01.imprimirDatos();
        per02.imprimirDatos();

        per01.comer(1300);
        per02.comer(2500);

        per01.imprimirDatos();
        per02.imprimirDatos();

        per01.dormir(8);
        per02.dormir(4);

        per01.imprimirDatos();
        per02.imprimirDatos();

        

    }
}