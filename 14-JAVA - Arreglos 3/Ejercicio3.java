import java.util.Scanner;

public class Ejercicio3{
    public static void main (String[] args){

        Scanner teclado_numero = new Scanner (System.in);
        Scanner texto = new Scanner (System.in);

        String nombres[] = new String[100];

        int cont=0;
        int memoria=100;
        boolean haciendo=false;

        while (haciendo==false){

            System.out.println("|-------------- MENU ---------------|");
            System.out.println("| 1: Registrar cliente              |");
            System.out.println("| 2: Ver lista de clientes          |");
            System.out.println("| 3: Editar clientes                |");
            System.out.println("| 4: Eliminar clientes              |");
            System.out.println("| 5: Salir                          |");
            System.out.println("|                                   |");
            System.out.println("| Memoria disponible: " + memoria + "           |");
            System.out.println("|-----------------------------------|");
            System.out.print("Opcion: ");
            int op = teclado_numero.nextInt();

            if (op==1){
                System.out.println("------ Registrar cliente ------");
                System.out.print("Digite nombre: ");
                String cliente = texto.nextLine();

                int temporal=0;

                for (int i=0; i<nombres.length; i++){
                    if (cliente.equals(nombres[i])){
                        temporal++;
                    }   
                }    
                    
                    if (temporal==1){
                        System.out.println("El nombre ya se encuentra, use otro");
                        
                    } else if (temporal==0) {   
                        nombres[cont] = cliente;
                        cont++;
                        memoria--;
                        System.out.println("Guardado");
                    }   

            } else if (op==2){
                System.out.println("------- Lista de clientes ------");
                for (int j=0; j<cont; j++){
                    System.out.println("Nombre " + j + ": " + nombres[j]);
                }
                System.out.println("--------------------------------");

            } else if (op==3){
                System.out.println("------ Editar clientes ------");
                System.out.print("Digite nombre a editar: ");
                String comprobar = texto.nextLine();

                int temporal_2=0;
                int posicion=0;

                    for (int i=0; i<cont; i++){
                        if (comprobar.equals(nombres[i])){
                            temporal_2++;
                            posicion=i;
                        }    
                    }     
                    
                    if (temporal_2==1){  
                        System.out.print("Ingrese nuevo nombre: ");
                        String editar = texto.nextLine();
                        nombres[posicion]=editar;
                        System.out.println("Nombre de cliente editado");
                    } else if (temporal_2==0) {
                            System.out.println("Cliente no encontrado");
                    }
                    

            } else if (op==4){
                System.out.println("------ Eliminar clientes ------");
                System.out.print("Digite cliente a eliminar: ");
                String eliminar = texto.nextLine();

                int temporal_3=0;
                int otra_posicion=0;

                    for (int i=0; i<cont; i++){
                        if (eliminar.equals(nombres[i])){
                            temporal_3++;
                            otra_posicion=i;
                        }    
                    }      
                        if (temporal_3==1){
                            nombres[otra_posicion]="";

                            for (int i=otra_posicion; i<cont; i++){
                                nombres[otra_posicion]=nombres[cont+1];
                                System.out.println("Nombre de cliente editado");
                            }

                        } else if (temporal_3==0){
                            System.out.println("Cliente no encontrado");
                        }
                    

            } else if (op==5){
                haciendo=true;
                System.out.println("Buen dia");
            }

            

        }



    }
}
