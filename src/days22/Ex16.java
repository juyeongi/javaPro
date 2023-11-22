package days22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;

public class Ex16 {

	public static void main(String[] args) {
		
		LinkedHashSet lotto = new 	LinkedHashSet();
		fillLotto(lotto);
		dispLotto(lotto);
		
	}

	private static void fillLotto(HashSet lotto) {
		Random rnd =new Random();
		while (lotto.size()<6) {
			int n= rnd.nextInt(45)+1;
			lotto.add(n);
		}
		
	}

	private static void dispLotto(HashSet lotto) {
		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			int n = (int) ir.next();
			System.out.printf("[%d]",n);
		}
		System.out.println();
	}

} // class
