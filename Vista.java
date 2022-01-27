/**
 * @author Mario Puente
 * @author Manuel Martínez
 * @author Luis Montenegro
 * @version 1.1
 * @since 27/01/2022
 */

import java.util.Scanner;
import java.util.InputMismatchException;
public class Vista {

    private Scanner scan;

    /**
     * Para importar el Scanner al controlador
     */
    public void scanner(){
        scan = new Scanner(System.in);
    }
    /**
     * Para tomar el ingreso del usuario
     * @return int
     */
    public int input(){
        return scan.nextInt();
    }

    /**
     * Para desplegar el menú de opciones y obtener exepciones
     * @return int
     */
    public int menu(){
        System.out.println("\nCalculadora");
        System.out.println("¿Qué operación desea hacer?");
        System.out.println("1 Suma\n2 Resta\n3 Multiplicación\n4 División\n5 Salir");
        try {
            return input();
        } catch (InputMismatchException e) {
            return 0;
        }  
    }

    /**
     * Para que el usuario ingrese la operación que desea realizar
     * @return String 
     */
    public String operation(){
        System.out.println("Ingrese la operación que desea realizar: ");
        return scan.next();
    }

    /**
     * Se despliega en caso el usuario ingrese algo no permitido para el programa
     */
    public void inputError(){
        System.out.println("Por favor ingrese un valor permitido");
    }

    /**
     * Se despliega en caso suceda algún error imprevisto
     */
    public void unexpectedError(){
        System.out.println("Surgió un error imprevisto. Por favor reiniciar el programa");
    }

    public void exit(){
        System.out.println("Ha salido de la calculadora");
    }


}
