package homework3_1;

/**
 * @author �smail Can Varl�
 *
 */
public class Main {
	
	public static void main(String[] args) {
	
//Mainde ise �ok bir olay yok sadece listeleri olu�turudk 
//ve yazd���m�z fonksiyonlar� �al��t�rd�k.		
		BListe l1 = new BListe();
		BListe l2 = new BListe();
		BListe l3 = new BListe();
		
		
		l1.initialize(2);
		l1.addElementLast(3);
		l1.addElementLast(1);
		
		System.out.println("L1 listesi yazd�r�l�yor.");
		l1.printLinkedList();
		
		l2.initialize(4);
		l2.addElementLast(5);
		
		System.out.println("\nL2 lsitesi yazd�r�l�yor.");
		l2.printLinkedList();
		
		l3.initialize(10);
		l3.addElementLast(20);
		l3.addElementLast(40);
		l3.addElementLast(50);
		
		System.out.println("\nL3 listesi yazd�r�l�yor.");
	    l3.printLinkedList();
	    
	    l1.concetenate(l2);
		System.out.println("\nBa�l� L1 yazd�r�l�yor.");
		l1.printLinkedList();
	    
	    l3.sort(30);
	    System.out.println("\nEklenip s�raland�ktan sonraki liste yazd�r�l�yor.");
	    l3.printLinkedList();
		
		
		System.out.println("\nL3 listesi yazd�r�l�yor.");
//		l3.addElementLast(60); bunu eklersek fonksiyon �ifte g�re i�lem yapar.
		l3.printLinkedList();
		l3.medyan();
		
		System.out.println("\nL1 listesi yazd�r�l�yor.");
		l1.printLinkedList();
		l1.reverse();
		System.out.println("\nL1 listesinin ters �evirilmi� hali yazd�r�l�yor.");
		l1.printLinkedList();
		
		
		
	}
}
