package homework6_1;

public class Main {
	public static void main(String[] args) {
// BinarySearch sýnýfýndan nesne oluþturuyoruz.		
		BinarySearch ob = new BinarySearch();
		
//dizilerimizi oluþturuyoruz.		
	    int arr1[] = {1,2,3,4,5,6,7,8,9,10};
	    int arr2[] = {10,12,15,17,25,36,37,38,39,40};
	    
//dizilerin boyutlarýný deðerlere atýyoruz.	    
	    int n = arr1.length;
	    int m = arr2.length;
	    
//dizide arayacaðýmýz deðeri yazýyoruz.	    
	    int x = 10;
	    int y = 25;
	    
//ob nesnesinden BinarySearch fonk. ulaþýyoruz ve parametrelerigönderdik.
	    int result1 = ob.BinarySearch(arr1, 0, n-1, x);
	    int result2 = ob.BinarySearch(arr2, 0, m-1, y);		

//Fonksiyon dönüþ deðerine baðlý çýktýlarý yazýyoruz.	    
	    if (result1 == -1){
	        System.out.println("Ýstenilen deðer bulunamadý.");
	    }
	    else{
	        System.out.println("Eleman þu indekste bulundu: "+ result1);    
	    } 
		
	    if (result2 == -1){
	        System.out.println("Ýstenilen deðer bulunamadý.");
	    }
	    else{
	        System.out.println("Eleman þu indekste bulundu: "+ result2);	       
	    }
	}
}


