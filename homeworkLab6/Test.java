package homeworkLab6;

import java.util.PriorityQueue;

import Week6Exapmle.Book;

public class Test {
	public static void main(String[] args) {
		
		PriorityQueue<Patient> queue=new PriorityQueue<Patient>();
		
		Patient patient1 = new Patient("mahmut",20);
		Patient patient2 = new Patient("selin",15);
		Patient patient3 = new Patient("hasan",55);
		Patient patient4 = new Patient("osman",67);
		Patient patient5 = new Patient("kadir",20);
		
		
		queue.add(patient1);  
	    queue.add(patient2);  
	    queue.add(patient3);
	    
	    System.out.println("S�radaki ki�iler yazd�r�l�yor...\n");
	    
	    for(Patient o:queue){  
		    System.out.println(o.name + " ya�:" + o.age);  
		    }
		
	    if(patient4.compareTo(patient4) == 0){
	    	queue.add(patient4);
	    }
	    else {
			queue.offer(patient4);
		}
	   
	    queue.remove(); 
		System.out.println("\nS�radan 1 ki�i ��k�ktan sonra s�ra yazd�r�l�yor...");  
		for(Patient o:queue){  
		    System.out.println(o.name + " ya�:" + o.age);  
		}
	    
        //Kuyruktaki bir sonraki eleman�n yerine ula��yor.  
	    System.out.println(queue.peek());  
		
		//listenin ba��ndaki ki�iyi listeden ��kart�r.
		queue.poll();
		System.out.println("\nPoll metodundan sonra sonu�: ");  
		for(Patient o:queue){  
		   System.out.println(o.name + " ya�:" + o.age);
		}	
	    
		//verilen eleman� kuyru�a ekler.
	    queue.offer(patient5);
	    System.out.println("\nOffer metodundan sonra sonu�: ");  
		for(Patient o:queue){  
		   System.out.println(o.name + " ya�:" + o.age);
		}
	
	
	
	
	
	
	}
}
