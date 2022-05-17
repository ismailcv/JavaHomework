package homework3_1;

/**
 * @author Ýsmail Can Varlý
 *
 */
public class Main {
	
	public static void main(String[] args) {
	
//Mainde ise çok bir olay yok sadece listeleri oluþturudk 
//ve yazdýðýmýz fonksiyonlarý çalýþtýrdýk.		
		BListe l1 = new BListe();
		BListe l2 = new BListe();
		BListe l3 = new BListe();
		
		
		l1.initialize(2);
		l1.addElementLast(3);
		l1.addElementLast(1);
		
		System.out.println("L1 listesi yazdýrýlýyor.");
		l1.printLinkedList();
		
		l2.initialize(4);
		l2.addElementLast(5);
		
		System.out.println("\nL2 lsitesi yazdýrýlýyor.");
		l2.printLinkedList();
		
		l3.initialize(10);
		l3.addElementLast(20);
		l3.addElementLast(40);
		l3.addElementLast(50);
		
		System.out.println("\nL3 listesi yazdýrýlýyor.");
	    l3.printLinkedList();
	    
	    l1.concetenate(l2);
		System.out.println("\nBaðlý L1 yazdýrýlýyor.");
		l1.printLinkedList();
	    
	    l3.sort(30);
	    System.out.println("\nEklenip sýralandýktan sonraki liste yazdýrýlýyor.");
	    l3.printLinkedList();
		
		
		System.out.println("\nL3 listesi yazdýrýlýyor.");
//		l3.addElementLast(60); bunu eklersek fonksiyon çifte göre iþlem yapar.
		l3.printLinkedList();
		l3.medyan();
		
		System.out.println("\nL1 listesi yazdýrýlýyor.");
		l1.printLinkedList();
		l1.reverse();
		System.out.println("\nL1 listesinin ters çevirilmiþ hali yazdýrýlýyor.");
		l1.printLinkedList();
		
		
		
	}
}
