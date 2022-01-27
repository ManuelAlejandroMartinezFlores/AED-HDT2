import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraGrupo12Test {

	@Test
	void testCalculate() {
		Calculadora calc = new CalculadoraGrupo12();
		double resultado = 0;
		try {
			resultado = calc.calculate("1 2 + 4 * 3 +");
		} catch (Exception e) {
			fail("Error inesperado");
		}
		assertEquals(resultado, 15, "Error al evaluar");
		
		try {
			calc.calculate("1 2 3 +");
			fail("Acepta demasiados operandos");
		} catch (Exception e) {}
		
		try {
			calc.calculate("1 2 a");
			fail("Acepta caracteres que no son operandos");
		} catch (Exception e) {}
		
		try {
			calc.calculate("1 2 + *");
			fail("Acepta muy pocos operandos");
		} catch (Exception e) {}
		
		try {
			resultado = 0;
			resultado = calc.calculate("6 2 3 + *");
		} catch (Exception e) {
			System.out.print(e);
			fail("Error inesperado");
		}
		
		assertEquals(resultado, 30, "Error al evaluar");
		
	}

}
