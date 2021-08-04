package VISUAL;
//import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Clase correspondiente a la parte del Visor.
 * Corresponde al menu principal del programa
 * Mediante el cual el usuario interactuara con el programa.
 * @Jose Toro
*/
public class Menu {
    //Atributos
    //se tiene atributo un controlador para acceder a sus metodos

    //Constructor
    /**
     * Crea un menu, usando el controlador.
     * @param controller Instancia del controlador.
     */
    public Menu(){

    }

    //Getter
    //Metodos

    /**
     * Inicia el menú, entonces el programa inicia su ejecución.
     */
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cerrarMenu = false;
        int opcion;
        /* 
         String username;
         String password;
        */
        while(!cerrarMenu){
        
           if(2!=2){//reviso online para que se registre o se logee
                System.out.println("### nombre RS ###");
                System.out.println("Escoja la opción que desea realizar: ");
                System.out.println("1. LOGEARSE");
                System.out.println("2. REGISTRARSE");
                System.out.println("3. SALIR");
            
                try {
                    System.out.println("Eliga una opcion ");
                    opcion = input.nextInt();
                    switch (opcion){
                        case 1:
                            break;

                        case 2:
                            break;

                        case 3: //Salir del programa
                            System.out.println("saliendo");
                            cerrarMenu = true;
                            break;
                        default:
                            System.out.println("opcion no valida");
                            break;
                    }
                } catch (InputMismatchException e){
                    System.out.println("Solo se admiten numeros dentro del menu");
                    input.next();
                }
            } else {
                System.out.println("### NOMBRE RS###");//agregar nombre de la RS
                System.out.println("## Registrado como: "+ "falta nick  A "+ " ##");//CAMBIAR A por el selector del user online (solo username)
                System.out.println("Escoja la opción que desea realizar: ");
                System.out.println("1. Realizar publicación");
                System.out.println("2. Seguir a un usuario");
                System.out.println("3. Compartir publicación");
                System.out.println("4. Visualizar red social");
                System.out.println("5. Cerrar sesión");
                System.out.println("6. Salir del programa");

                try {
                    System.out.println("Introduzca su opción: ");
                    opcion = input.nextInt();
                    switch (opcion){
                        case 1: //publicar-> post
                        //
                            break;
                        case 2://seguir -> follow
                        //
                            break;
                        case 3://compartir-share
                        //
                            break;
                        case 4://visualuzar ->visualize
                        //
                            break;
                        case 5://cerrar sesion ->logout
                            System.out.println("Sesion cerrada.");
                            //Logout
                           //llamar a log out
                            break;
                        case 6://salir del programa ->cerrar menu 
                            System.out.println("Elegiste salir del programa");
                            cerrarMenu = true;
                            break;
                        default:
                            System.out.println("opcion no valida");
                            break;
                    }
                } catch (InputMismatchException e){
                    System.out.println("Solo se admiten numeros dentro del menu");
                    input.next();
                }
            }
        }
    }
}
