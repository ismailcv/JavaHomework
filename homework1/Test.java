package homework1;

// bubble sort(kabarc�k s�ralama) diziyi en k���k de�erden en b�y�k de�ere s�ralar.

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
