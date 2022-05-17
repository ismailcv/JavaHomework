package homework3_1;


/**
 * @author Ýsmail Can Varlý
 *
 */
/**
 * @author Ýsmail Can Varlý
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
//Burada istenilen listelerin yazdýrýlmasý iþlemi bulunmkatadýr.
//Önce head kýsmý belirliyoruz. Ondan sonra next. diyerek 
//tüm elemanlarý yazdýrmýþ oluyoruz. 
		
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
//Burada l1 ve l2 listesini birbirine ekleme iþlemini yaptýk.
//while döngüsü doðru olduðu müddetçe döngü çalýþýyor.
//l1 listesinin boþ deðer döndürdüðü andan sonra l2 listesini l1
//listesine ekledim. l2 listesinin null döndürdüðü anda ise while	
//döngüsünü bitirdim.		
	
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
//Burada sýralý gelen listeye gelen datayý ekleme iþlemini yapýyoruz.
//Ýþlemide þu þekilde yapýyoruz. Gelen deðerin hangi iki deðer arasýnda olduðunu
//if bloðu içerisinde bulup ondan sonra ikisinin arasýna ekledim.
//else bloðunda ise temp deðerini bir sonraki deðere geçirdim.
//Bu þekilde hem tüm listeyi dolaþmýþ olup. Hemde istenen deðeri sýralý bir
//þekilde eklemiþ oluyoruz.	

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
//Burada eleman sayýsý çift ise bir döngüyü tek ise diðer döngüyü çalýþtýrdým 
//ve bunun sonucunda l3 listesinin medyan deðerini döndürdüm. 

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
					System.out.println("\nMedyan deðeri: " + temp.data);
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
					System.out.println("\nMedyan deðeri: " + (a+b)/2);
				}
    			temp = temp.next;	
			}    		
    	}
    }

//----------------------------------------------------
//burada listeyi terse çevirdik. 
//prev önceki temp baþlangýç noktasýný belirler. temp1 ise baðlangýç düðümü olarak
// aldýk.    
    
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