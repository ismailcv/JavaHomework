package homework3_1;


/**
 * @author �smail Can Varl�
 *
 */
/**
 * @author �smail Can Varl�
 *
 */
public class BListe {
	Node head = null;

//------------------------------------------------------------------
	
	/**
	 * @param data
	 */
	public void initialize(int data) {
		head = new Node();
		head.data = data;
		head.next = null;
	}

	/**
	 * @param data
	 */
	public void addElementLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
//---------------------------------------------------------------------	
//Burada istenilen listelerin yazd�r�lmas� i�lemi bulunmkatad�r.
//�nce head k�sm� belirliyoruz. Ondan sonra next. diyerek 
//t�m elemanlar� yazd�rm�� oluyoruz. 
		
	/**
	 * 
	 */
	public void printLinkedList() {
		Node temp = head;
			
		while (temp != null) {
			System.out.print(temp.data + " => ");
			temp = temp.next;
		}
		System.out.println("Null");	
	}	
//----------------------------------------------------------------------	
//Burada l1 ve l2 listesini birbirine ekleme i�lemini yapt�k.
//while d�ng�s� do�ru oldu�u m�ddet�e d�ng� �al���yor.
//l1 listesinin bo� de�er d�nd�rd��� andan sonra l2 listesini l1
//listesine ekledim. l2 listesinin null d�nd�rd��� anda ise while	
//d�ng�s�n� bitirdim.		
	
	/**
	 * @param l2
	 */
	public void concetenate( BListe l2) {
		
		Node temp = head;
        Node temp1 = l2.head;
		
		while (true) {

			if (temp.next == null ) {
				temp.next = temp1;
				temp1 = temp1.next;
			}
			
			else if (temp1.next == null) {
				break;
			}
			
			else {
				temp = temp.next;
			}	
		}
	}

//-------------------------------------------------------------------------	
//Burada s�ral� gelen listeye gelen datay� ekleme i�lemini yap�yoruz.
//��lemide �u �ekilde yap�yoruz. Gelen de�erin hangi iki de�er aras�nda oldu�unu
//if blo�u i�erisinde bulup ondan sonra ikisinin aras�na ekledim.
//else blo�unda ise temp de�erini bir sonraki de�ere ge�irdim.
//Bu �ekilde hem t�m listeyi dola�m�� olup. Hemde istenen de�eri s�ral� bir
//�ekilde eklemi� oluyoruz.	

	/**
	 * @param data
	 */
	public void sort(int data) { 
		Node newNode = new Node(); 
		newNode.data = data; 
		Node temp = head; 
		Node temp1 = null; 

		while (temp.next != temp1) { 
			
			if ((temp.data < newNode.data) && (newNode.data < temp.next.data)) {
				newNode.next = temp.next; 
				temp.next = newNode;
			}

			else {
				temp = temp.next;
			}
		}
	}

//----------------------------------------------------------------------
//Burada eleman say�s� �ift ise bir d�ng�y� tek ise di�er d�ng�y� �al��t�rd�m 
//ve bunun sonucunda l3 listesinin medyan de�erini d�nd�rd�m. 

    /**
     * 
     */
    public void medyan(){
    	
    	Node newNode = new Node();  
		Node temp = head; 
		Node temp1 = null;
    	int counter = 0;
		
    	while(temp != null){
    		counter ++;
    		temp = temp.next; 
    	}
        
    	if((counter%2)==1){
    		temp = head;
    		for (int i = 0; i < (counter/2)+1; i++) {
    			if (i==2) {
					System.out.println("\nMedyan de�eri: " + temp.data);
				}
    			temp = temp.next;	
			}	
    	}
         
    	else if((counter%2)==0){
    		temp = head;
    		int a,b;
    		for (int i = 0; i < (counter/2); i++) {
    			if (i==2) {
					a = temp.data;
					b = temp.next.data;
					System.out.println("\nMedyan de�eri: " + (a+b)/2);
				}
    			temp = temp.next;	
			}    		
    	}
    }

//----------------------------------------------------
//burada listeyi terse �evirdik. 
//prev �nceki temp ba�lang�� noktas�n� belirler. temp1 ise ba�lang�� d���m� olarak
// ald�k.    
    
   /**
 * 
 */
public void reverse(){
	   Node temp = head;
	   Node temp1 = null;
	   Node prev = null;
	   
	   while(temp != null){
		   temp1 = temp.next;
		   temp.next = prev;
		   prev = temp;
		   temp = temp1;
	   } 
	   head = prev;   	   
   }   
}