package homework6_3;

public class Main {

	public static void main(String[] args) {

//InterpolationSearch s�n�f�ndan nesne olu�turuyoruz.		
		InterpolationSearch iSearch = new InterpolationSearch();
		
//dizilerimizi olu�turuyoruz.
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
	    int arr2[] = {10,12,15,17,25,36,37,38,39,40};
	  
//dizilerin boyutlar�n� de�erlere at�yoruz.	 
        int n = arr1.length;
        int m = arr2.length;
 
//dizide arayaca��m�z de�eri yaz�yoruz.
        int x = 3;
        int y = 36;       

//iSeacrh nesnesinden interpolationSearch fonk. ula��yoruz ve parametreleri g�nderdik.        
        int index1 = iSearch.interpolationSearch(arr1, 0, n - 1, x);
        int index2 = iSearch.interpolationSearch(arr2, 0, m - 1, y);
        
//Fonksiyon d�n�� de�erine ba�l� ��kt�lar� yaz�yoruz.       
        if (index1 != -1)
            System.out.println("Eleman �u indekste bulundu: "+ index1);
        else
            System.out.println("�stenilen de�er bulunamad�.");
   
        if (index2 != -1)
            System.out.println("\nEleman �u indekste bulundu: "+ index2);
        else
            System.out.println("\n�stenilen de�er bulunamad�.");
	}

}
