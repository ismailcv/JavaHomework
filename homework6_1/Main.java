package homework6_1;

public class Main {
	public static void main(String[] args) {
// BinarySearch s�n�f�ndan nesne olu�turuyoruz.		
		BinarySearch ob = new BinarySearch();
		
//dizilerimizi olu�turuyoruz.		
	    int arr1[] = {1,2,3,4,5,6,7,8,9,10};
	    int arr2[] = {10,12,15,17,25,36,37,38,39,40};
	    
//dizilerin boyutlar�n� de�erlere at�yoruz.	    
	    int n = arr1.length;
	    int m = arr2.length;
	    
//dizide arayaca��m�z de�eri yaz�yoruz.	    
	    int x = 10;
	    int y = 25;
	    
//ob nesnesinden BinarySearch fonk. ula��yoruz ve parametrelerig�nderdik.
	    int result1 = ob.BinarySearch(arr1, 0, n-1, x);
	    int result2 = ob.BinarySearch(arr2, 0, m-1, y);		

//Fonksiyon d�n�� de�erine ba�l� ��kt�lar� yaz�yoruz.	    
	    if (result1 == -1){
	        System.out.println("�stenilen de�er bulunamad�.");
	    }
	    else{
	        System.out.println("Eleman �u indekste bulundu: "+ result1);    
	    } 
		
	    if (result2 == -1){
	        System.out.println("�stenilen de�er bulunamad�.");
	    }
	    else{
	        System.out.println("Eleman �u indekste bulundu: "+ result2);	       
	    }
	}
}


