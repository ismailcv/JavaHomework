package homework6_3;

public class Main {

	public static void main(String[] args) {

//InterpolationSearch sýnýfýndan nesne oluþturuyoruz.		
		InterpolationSearch iSearch = new InterpolationSearch();
		
//dizilerimizi oluþturuyoruz.
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
	    int arr2[] = {10,12,15,17,25,36,37,38,39,40};
	  
//dizilerin boyutlarýný deðerlere atýyoruz.	 
        int n = arr1.length;
        int m = arr2.length;
 
//dizide arayacaðýmýz deðeri yazýyoruz.
        int x = 3;
        int y = 36;       

//iSeacrh nesnesinden interpolationSearch fonk. ulaþýyoruz ve parametreleri gönderdik.        
        int index1 = iSearch.interpolationSearch(arr1, 0, n - 1, x);
        int index2 = iSearch.interpolationSearch(arr2, 0, m - 1, y);
        
//Fonksiyon dönüþ deðerine baðlý çýktýlarý yazýyoruz.       
        if (index1 != -1)
            System.out.println("Eleman þu indekste bulundu: "+ index1);
        else
            System.out.println("Ýstenilen deðer bulunamadý.");
   
        if (index2 != -1)
            System.out.println("\nEleman þu indekste bulundu: "+ index2);
        else
            System.out.println("\nÝstenilen deðer bulunamadý.");
	}

}
