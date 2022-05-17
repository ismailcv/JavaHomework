package homework3;

/**
 * Date: 08.03.2022 HW 3.1
 * 
 * @author Ýsmail Can Varlý
 * @version 1.0
 *
 *
 *
 */

public class Test {

	/**
	 * Bu main metod
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BListe bl = new BListe();

		bl.initialize(23);
		bl.addElementLast(15);
		bl.addElementLast(48);
		bl.addElementLast(57);

		bl.printLinkedList();
		bl.getFirst();

		bl.set(2, 218);
		bl.printLinkedList();

		bl.contains(48);

	}
}
