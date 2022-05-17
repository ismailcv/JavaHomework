package homework6_3;

public class InterpolationSearch {

	public static int interpolationSearch(int arr[], int lo,
             int hi, int x){
        int pos;

//istenilen de�er dizinin i�indemi diye kontrol ettik.
        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {

//�nterpolasyon search aramas�n�n �al��mas� i�in gerekli form�l� yazd�k.
        pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * 
        		(x - arr[lo]));

//e�er pos de�i�keni x e e�itse pos u d�nd�r�r�z.
        if (arr[pos] == x)
        return pos;

// E�er x de�eri b�y�kse sa� k�s�mda arama yapar.
        if (arr[pos] < x)
        return interpolationSearch(arr, pos + 1, hi,x);

//E�er x de�eri k���kse sol tarafta arama yapar.
        if (arr[pos] > x)
        return interpolationSearch(arr, lo, pos - 1,x);
        }
        return -1;
    }
}
