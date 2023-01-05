/**
 * 
 */
package examen2223ETU;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author z21206029
 *
 */
public class PileLIFOArray<E> implements PileLIFO<E> {
	private final ArrayList<Object> pilefifo = new ArrayList<>();

	/**
	 * 
	 */
	public PileLIFOArray() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void empiler(Object elem) {
		pilefifo.add(0,elem);
		
	}

	@Override
	public E depiler() {
		Object top = pilefifo.remove(pilefifo.size() - 1);
		return null;
	}

	@Override
	public E sommet() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean estVide() {
		if(this.estVide()) 
		return true;
		else
		return false;

	}

	@Override
	public List<E> asList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void vider() {
		pilefifo.clear();
		
	}

}
