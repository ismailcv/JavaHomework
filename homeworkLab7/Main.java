package homeworkLab7;

public class Main {
	public static void main(String[] args) {
		
		HashTable01 <String> test;
        test = new HashTable01<> (20);
        test.ekle("ahmet", "05317312193");
        test.ekle("barıs", "05317312193");
        test.ekle("cemre", "05317312193");
        test.ekle("deniz", "05317312193");
        test.ekle("elif", "05317312193");
        test.ekle("faruk", "05317312193");
        test.ekle("gamze", "05317312193");
        test.ekle("hasan", "05317312193");
        test.ekle("ismail", "05317312193");
        test.ekle("jale", "05317312193");
        test.ekle("kadir", "05317312193");
        test.ekle("leyla", "05317312193");
        test.ekle("memet", "05317312193");
        test.ekle("nalan", "05317312193");
        test.ekle("rıfkı", "05317312193"); 
        test.ekle("sezen", "05317312193"); 
        test.ekle("şakir", "05317312193");
        test.ekle("utku", "05317312193");
        test.ekle("yavuz", "05317312193");
        test.ekle("zeynep", "05317312193");
                     
                    
                   

        
        
        System.out.println("2. indisteki eleman yazdırlıyor: " + test.get(2));
        System.out.println("2. indisteki eleman yazdırlıyor:" + test.get(19));
        
        System.out.println("19. indisteki eleman siliniyor.");
        test.delete(19);
        System.out.println("Silindikten sonra 19. indisteki eleman: ");
        System.out.println(test.get(19));
	
	
	}
}
