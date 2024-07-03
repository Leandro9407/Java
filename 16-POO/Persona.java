public class Persona{

    //se definen atributos. Nunca inicializar el contructor aca, es decir no darle valor inicial a las variables
    int cedula;
    String nombre;
    String apellido;
    double peso;
    double altura;
    double nivel_energia;

    //se definen metodos (contructor). El contructor es una valor inicial
    public Persona(){
        cedula = 0;
        nombre = "";
        apellido = "";
        peso = 0;
        altura = 0;
        nivel_energia = 0;
    }

    //contructor
    public Persona(int dato1, String dato2, String dato3, double dato4, double dato5, int dato6){
        cedula = dato1;
        nombre = dato2;
        apellido = dato3;
        peso = dato4;
        altura = dato5;
        nivel_energia = dato6;
    }

    public void imprimirDatos(){
        System.out.println("|-----------------------------|");
        System.out.println("  - Cedula: " + cedula);
        System.out.println("  - Nombre: " + nombre + " " + apellido);
        System.out.println("  - Peso: " + peso + " Kg");
        System.out.println("  - Altura: " + altura + " Mt");
        System.out.println("  - Nivel de energia: " + nivel_energia + "%");
        System.out.println("|-----------------------------|");
    }    

    public void comer(double calorias){
        if (calorias>=1 && calorias<=2000){
            peso = peso + (calorias * 0.0005);
            nivel_energia += 5;
        }

        if (calorias>2000){
            peso = peso + (calorias * 0.0015);
            nivel_energia -= 15;
        }
    }

    public void dormir(int horas_sueño){
        if (horas_sueño>7){
            nivel_energia = nivel_energia + (nivel_energia*0.10);
        }

        if (horas_sueño<7){
            nivel_energia = nivel_energia - (nivel_energia*0.15);    
        }

    }


}