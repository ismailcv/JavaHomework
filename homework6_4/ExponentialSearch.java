package homework6_4;

import java.util.Arrays;

public class ExponentialSearch {
	static int ExponentialSearch(int arr[],int n, int x){

//arad���m�z de�er 0. indiste ise 0 de�erini d�nd�r�r.
        if (arr[0] == x)
        return 0;

//ikili arama i�in aral��� bulmaya �al����yoruz.
// her defas�nda 2 ye katlan�yor.
        int i = 1;
        while (i < n && arr[i] <= x)
        i = i*2;

// En son bulunan aral�k i�in i�in ikili arama yap�yoruz.
        return Arrays.binarySearch(arr, i/2,
        Math.min(i, n-1), x);

    }
}