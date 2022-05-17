package homework6_4;

public class Main {
	public static void main(String[] args) {
//ExponentialSearch sýnýfýndan nesne oluþturuyoruz.		
		ExponentialSearch eSearch = new ExponentialSearch();

//dizilerimizi oluþturuyoruz.		
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
	    int arr2[] = {10,12,15,17,25,36,37,38,39,40};
	 
//dizide arayacaðýmýz deðeri yazýyoruz.	        
	    int x = 4;
        int y = 38;
//eSearch nesnesinden ExponentialSearch fonk. ulaþýyoruz ve parametrelerigönderdik.        
	    int result1 = eSearch.ExponentialSearch(arr1,arr1.length, x);
	    int result2 = eSearch.ExponentialSearch(arr2,arr2.length, y);

//Fonksiyon dönüþ deðerine baðlý çýktýlarý yazýyoruz.	    
        System.out.println((result1 < 0) ?
        		"Ýstenilen deðer bulunamadý." :
                "Eleman þu indekste bulundu: " + result1);
    
        System.out.println((result2 < 0) ?
        		"Ýstenilen deðer bulunamadý." :
                "Eleman þu indekste bulundu: " + result2);
	
	}
}

