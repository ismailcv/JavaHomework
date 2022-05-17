package homework6_2;

public class Main {
	public static void main(String[] args) {
	
// LinearSearch sýnýfýndan nesne oluþturuyoruz.       
        LinearSearch linearSearch = new LinearSearch();
		
//dizilerimizi oluþturuyoruz.
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
	    int arr2[] = {10,12,15,17,25,36,37,38,39,40};
 
//dizide arayacaðýmýz deðeri yazýyoruz.		    
	    int x = 7;
        int y = 39;
//linearSearch nesnesinden search fonksiyonuna deðerleri gönderiyoruz.    
        int result1 = linearSearch.search(arr1, x);
        int result2 = linearSearch.search(arr2, y);
        
//Fonksiyon dönüþ deðerine baðlý çýktýlarý yazýyoruz.        
        if (result1 == -1)
            System.out.print(
                "Ýstenilen deðer bulunamadý.");
        else
            System.out.print("Eleman þu indekste bulundu: "
                             + result1);
    
        if (result2 == -1)
            System.out.print(
                "\nÝstenilen deðer bulunamadý.");
        else
            System.out.print("\nEleman þu indekste bulundu: "
                             + result2);
	}
}


