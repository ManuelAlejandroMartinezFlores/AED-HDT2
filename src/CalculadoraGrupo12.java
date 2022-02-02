/**
 * @author Mario Puente
 * @author Manuel Martínez
 * @author Luis Montenegro
 * @version 1.1
 * @since 27/01/2022
 * 
 * CalculadoraGrupo12.
 * Evalua operaciones en formato POSTFIX.
 */

import java.util.Vector;


public class CalculadoraGrupo12 implements Calculadora {
	
	Stack<Double> stack = new StackGrupo12<Double>();
	
	
	/**
	 * Evalua la operación tipo POSTFIX
	 */
	public double calculate(String operation) {
		try {
			stack = new StackGrupo12<Double>();
			double resultado = 0.0;
			String[] data = operation.split(" ");
			for (String s : data) {
				if (s.equals("+")) {
					suma();
				} else if (s.equals("-")) {
					resta();
				} else if (s.equals("*")) {
					multiplicacion();
				} else if (s.equals("/")) {
					division();
				} else {
					try {
						stack.add(Double.valueOf(s));
					} catch (Exception e) {
						throw new Exception("Caracter invalido");
					}
				}
			}
			
			
			if (stack.size() > 1) {
				throw new Exception("Demasiados operandos");
			}
			return stack.remove();
		} catch (Exception e) {
			return 0;
		}
	}
	
	/**
	 * Suma los dos ultimos elementos del stack
	 * @throws Exception si no hay suficientes operandos
	 */
	private void suma() throws Exception {
		if (stack.size() < 2) {
			throw new Exception("No hay suficientes operandos");
		}
		Double opB = stack.remove();
		Double opA = stack.remove();
		stack.add(opA + opB);
	}
	
	/**
	 * Resta los dos ultimos elementos del stack
	 * @throws Exception si no hay suficientes operandos
	 */
	private void resta() throws Exception {
		if (stack.size() < 2) {
			throw new Exception("No hay suficientes operandos");
		}
		Double opB = stack.remove();
		Double opA = stack.remove();
		stack.add(opA - opB);
	}
	
	/**
	 * Multiplica los dos ultimos elementos del stack
	 * @throws Exception si no hay suficientes operandos
	 */
	private void multiplicacion() throws Exception {
		if (stack.size() < 2) {
			throw new Exception("No hay suficientes operandos");
		}
		Double opB = stack.remove();
		Double opA = stack.remove();
		stack.add(opA * opB);
	}
	
	/**
	 * Divide los dos ultimos elementos del stack
	 * @throws Exception si no hay suficientes operandos o hay division entre 0
	 */
	private void division() throws Exception {
		if (stack.size() < 2) {
			throw new Exception("No hay suficientes operandos");
		}
		Double opB = stack.remove();
		Double opA = stack.remove();
		if (opB == 0) {
			throw new Exception("División entre 0");
		}
		stack.add(opA / opB);
	}
	
	
}
