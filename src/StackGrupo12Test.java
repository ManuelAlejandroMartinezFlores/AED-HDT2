import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackGrupo12Test {

	@Test
	void testAdd() {
		Stack<Integer> stack = new StackGrupo12<Integer>();
		stack.add(1);
		assertEquals(1, stack.size(), "No agrega correctamente");
		
		for (int i=0; i<100; i++) {
			stack.add(i);
		}
		assertEquals(101, stack.size(), "No agrega correctamente");
	}

	@Test
	void testRemove() {
		Stack<Integer> stack = new StackGrupo12<Integer>();
		stack.add(1);
		for (int i=0; i<100; i++) {
			stack.add(i);
		}
		int rmv = stack.remove();
		assertEquals(rmv, 99, "Error en peek");
	}

	@Test
	void testPeek() {
		Stack<Integer> stack = new StackGrupo12<Integer>();
		assertEquals(null, stack.peek(), "Error en stack vacio");
		
		stack.add(1);
		for (int i=0; i<100; i++) {
			stack.add(i);
		}
		int peek = stack.peek();
		assertEquals(peek, 99, "Error en peek");
	}

	@Test
	void testEmpty() {
		Stack<Integer> stack = new StackGrupo12<Integer>();
		assertEquals(true, stack.empty(), "Error en empty");
		stack.add(1);
		assertEquals(false, stack.empty(), "Error en empty");
		stack.remove();
		assertEquals(true, stack.empty(), "Error en empty");
		
	}

	@Test
	void testSize() {
		Stack<Integer> stack = new StackGrupo12<Integer>();
		assertEquals(0, stack.size(), "Error en size");
		for (int i=0; i<100; i++) {
			stack.add(i);
		}
		assertEquals(100, stack.size(), "Error en size");
	}

}
