/**
 * @author Mario Puente
 * @author Manuel Martínez
 * @author Luis Montenegro
 * @version 1.1
 * @since 27/01/2022
 * 
 * Controlador.
 */

import java.util.ArrayList;

public class Controlador {

	public static void main(String[] args) {
		
		Vista vista = new Vista();
		Calculadora calc = new CalculadoraGrupo12();
		ArrayList<String> data = new ArrayList<String>();
		boolean exito = false;
		while (!exito) {
			try {
				String path = vista.getPath();
				data = Archivos.leer(path);
				exito = true;
			} catch (Exception e) {
				vista.mostrarEx();
			}
		}
		
		String resultado;
		for (String operacion : data) {
			try {
				resultado = String.valueOf(calc.calculate(operacion));
			} catch (Exception e) {
				resultado = e.getMessage();
			}
			
			vista.mostrarResultado(operacion, resultado);
		}
		
		vista.cerrar();
	}
	
}
