/**
 * @author Mario Puente
 * @author Manuel Martínez
 * @author Luis Montenegro
 * @version 1.1
 * @since 27/01/2022
 */


public class Controlador{

    public static void main(String[] args){
        boolean bucle = false;
        int opcion = 0;
        Vista vista = new Vista();
        String operacion = null;

        while(!bucle){
            try {
                vista.scanner();
                opcion = vista.menu();
                switch(opcion){
                    /********************/
                    /**Suma             */
                    /********************/
                    case 1:
                    operacion = vista.operation();
                    break;
                    /********************/
                    /**Resta            */
                    /********************/
                    case 2:
                    operacion = vista.operation();
                    break;
                    /********************/
                    /**Multiplicación   */
                    /********************/
                    case 3:
                    operacion = vista.operation();
                    break;
                    /********************/
                    /**División         */
                    /********************/
                    case 4:
                    operacion = vista.operation();
                    break;
                    /********************/
                    /**Salir            */
                    /********************/
                    case 5:
                    vista.exit();
                    bucle = true;
                    break;
                    default:
                    vista.inputError();
                    break;
                } 
            } 
            //Por cualquier error que salga en el programa
            catch (Exception e) {
                vista.unexpectedError();
            }
            
        }
    }
}