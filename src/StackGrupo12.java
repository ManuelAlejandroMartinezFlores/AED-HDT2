import java.util.Vector;

public class StackGrupo12<E> implements Stack<E> {

	Vector<E> data = new Vector<E>();
	
	@Override
	public void add(E item) {
		// TODO Auto-generated method stub
		data.add(item);
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		if (!empty()) {
			return data.remove(size() - 1);
		}
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if (!empty()) {
			return data.elementAt(size() - 1);
		}
		return null;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return data.size();
	}

}
