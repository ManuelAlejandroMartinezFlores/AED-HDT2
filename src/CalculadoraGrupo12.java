import java.util.Vector;


public class CalculadoraGrupo12 implements Calculadora {
	
	Stack<Double> stack = new StackGrupo12<Double>();
	
	public double calculate(String operation) throws Exception {
		stack = new StackGrupo12<Double>();
		double resultado = 0.0;
		String[] data = operation.split(" ");
		for (String s : data) {
			if (s.equals("+")) {
				resultado = suma();
			} else if (s.equals("-")) {
				resultado = resta();
			} else if (s.equals("*")) {
				resultado = multiplicacion();
			} else if (s.equals("/")) {
				resultado = division();
			} else {
			stack.add(Double.valueOf(s));
			}
		}
		
		
		if (stack.size() > 1) {
			throw new Exception("Demasiados operandos");
		}
		return resultado;
	}
	
	
	private double suma() throws Exception {
		if (stack.size() < 2) {
			throw new Exception("No hay suficientes operandos");
		}
		Double op1 = stack.remove();
		Double op2 = stack.remove();
		stack.add(op1 + op2);
		return op1 + op2;
	}
	
	private double resta() throws Exception {
		if (stack.size() < 2) {
			throw new Exception("No hay suficientes operandos");
		}
		Double op1 = stack.remove();
		Double op2 = stack.remove();
		stack.add(op1 - op2);
		return op1 - op2;
	}
	
	private double multiplicacion() throws Exception {
		if (stack.size() < 2) {
			throw new Exception("No hay suficientes operandos");
		}
		Double op1 = stack.remove();
		Double op2 = stack.remove();
		stack.add(op1 * op2);
		return op1 * op2;
	}
	
	private double division() throws Exception {
		if (stack.size() < 2) {
			throw new Exception("No hay suficientes operandos");
		}
		Double op1 = stack.remove();
		Double op2 = stack.remove();
		stack.add(op1 / op2);
		return op1 / op2;
	}
	
	
}
