package homework6_2;

public class Main {
	public static void main(String[] args) {
	
// LinearSearch s�n�f�ndan nesne olu�turuyoruz.       
        LinearSearch linearSearch = new LinearSearch();
		
//dizilerimizi olu�turuyoruz.
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
	    int arr2[] = {10,12,15,17,25,36,37,38,39,40};
 
//dizide arayaca��m�z de�eri yaz�yoruz.		    
	    int x = 7;
        int y = 39;
//linearSearch nesnesinden search fonksiyonuna de�erleri g�nderiyoruz.    
        int result1 = linearSearch.search(arr1, x);
        int result2 = linearSearch.search(arr2, y);
        
//Fonksiyon d�n�� de�erine ba�l� ��kt�lar� yaz�yoruz.        
        if (result1 == -1)
            System.out.print(
                "�stenilen de�er bulunamad�.");
        else
            System.out.print("Eleman �u indekste bulundu: "
                             + result1);
    
        if (result2 == -1)
            System.out.print(
                "\n�stenilen de�er bulunamad�.");
        else
            System.out.print("\nEleman �u indekste bulundu: "
                             + result2);
	}
}


