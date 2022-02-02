/**
 * @author Mario Puente
 * @author Manuel Martínez
 * @author Luis Montenegro
 * @version 1.1
 * @since 27/01/2022
 * 
 * CalculadoraGrupo12Test.
 * Pruebas unitarias para evaluar la efectividad del método del ADT.
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraGrupo12Test {

	/**
	 * Evalua si la calculadora evalua las expresiones correctamente y lanza excepciones cuando sea necesario
	 */
	@Test
	void testCalculate() {
		Calculadora calc = new CalculadoraGrupo12();
		double resultado = 0;
		resultado = calc.calculate("1 2 + 4 * 3 +");
		assertEquals(resultado, 15, 0.01, "Error al evaluar");
		
		resultado = calc.calculate("1 2 3 +");
		assertEquals(resultado, 0, 0.01, "Acepta demasiados operandos");
		
		resultado = calc.calculate("1 2 a");
		assertEquals(resultado, 0, 0.01, "Acepta operandos no válidos");
		
		resultado = calc.calculate("1 2 + *");
		assertEquals(resultado, 0, 0.01, "Acepta demasiados operadores");
		
		resultado = calc.calculate("1 0 /");
		assertEquals(resultado, 0, 0.01, "Acepta división entre 0");
		
		resultado = calc.calculate("6 2 3 + *");
		assertEquals(resultado, 30, 0.01, "Error al evaluar");
	}

}
