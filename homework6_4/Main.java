package homework6_4;

public class Main {
	public static void main(String[] args) {
//ExponentialSearch s�n�f�ndan nesne olu�turuyoruz.		
		ExponentialSearch eSearch = new ExponentialSearch();

//dizilerimizi olu�turuyoruz.		
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
	    int arr2[] = {10,12,15,17,25,36,37,38,39,40};
	 
//dizide arayaca��m�z de�eri yaz�yoruz.	        
	    int x = 4;
        int y = 38;
//eSearch nesnesinden ExponentialSearch fonk. ula��yoruz ve parametrelerig�nderdik.        
	    int result1 = eSearch.ExponentialSearch(arr1,arr1.length, x);
	    int result2 = eSearch.ExponentialSearch(arr2,arr2.length, y);

//Fonksiyon d�n�� de�erine ba�l� ��kt�lar� yaz�yoruz.	    
        System.out.println((result1 < 0) ?
        		"�stenilen de�er bulunamad�." :
                "Eleman �u indekste bulundu: " + result1);
    
        System.out.println((result2 < 0) ?
        		"�stenilen de�er bulunamad�." :
                "Eleman �u indekste bulundu: " + result2);
	
	}
}

