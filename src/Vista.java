/**
 * @author Mario Puente
 * @author Manuel Martínez
 * @author Luis Montenegro
 * @version 1.1
 * @since 27/01/2022
 * 
 * Vista.
 * Interactua con el usuario.
 */

public class Vista {
	
	/**
	 * Muestra un mensaje en caso de excepcion
	 */
	public void mostrarEx() {
		System.out.println("Favor ingrese un valor válido");
	}
	
	/**
	 * Muestra el resultado de la operacion
	 * @param operacion a resolver
	 * @param resultado de la operacion
	 */
	public void mostrarResultado(String operacion, String resultado) {
		System.out.println(operacion + " = " + resultado);
	}
}
