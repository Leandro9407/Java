public class Prueba1{
    public static void main(String[] args){

        //Mientras
        int i=0;
        while(i<10){
            System.out.println("Hola Mundo: " + i);

        //contador o incremento
        //  i=i+1;
        //  i+=1;
            i++;
        }

        double c=0;
        while(c<10){
            System.out.println("Hola A Todos: " + c);

            c=c+0.5;
        }

        //////////////////////////////////////////////////////////////////////////////////

        //Para
        for(double f=0; f<10; f+=0.5){
            System.out.println("Hola Mi Gente: " + f);
        }


        //Repetir = do while
        int j=0;
    
        do{
            System.out.println("Hola Hello: " + j);
            j++;

        }while(i<10);



    }
}