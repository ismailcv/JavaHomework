package homework1;

// bubble sort(kabarcýk sýralama) diziyi en küçük deðerden en büyük deðere sýralar.

public class Test {
	public static void main(String[] args) {
	    int gecici;
		
	    int[] dizi = new int [100];
	    
	    for(int i = 0; i <= dizi.length - 1; i++){
		    for(int j = 1; j <= dizi.length - 1; j++){
		        if (dizi[j - 1] > dizi[j]){
		            gecici = dizi[j - 1];
		            dizi[j - 1] = dizi[j];
		            dizi[j] = gecici;
		        }
		    }
		}
	
	
	
	
	}
}
