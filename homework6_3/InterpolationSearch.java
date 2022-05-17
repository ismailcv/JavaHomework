package homework6_3;

public class InterpolationSearch {

	public static int interpolationSearch(int arr[], int lo,
             int hi, int x){
        int pos;

//istenilen deðer dizinin içindemi diye kontrol ettik.
        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {

//Ýnterpolasyon search aramasýnýn çalýþmasý için gerekli formülü yazdýk.
        pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * 
        		(x - arr[lo]));

//eðer pos deðiþkeni x e eþitse pos u döndürürüz.
        if (arr[pos] == x)
        return pos;

// Eðer x deðeri büyükse sað kýsýmda arama yapar.
        if (arr[pos] < x)
        return interpolationSearch(arr, pos + 1, hi,x);

//Eðer x deðeri küçükse sol tarafta arama yapar.
        if (arr[pos] > x)
        return interpolationSearch(arr, lo, pos - 1,x);
        }
        return -1;
    }
}
