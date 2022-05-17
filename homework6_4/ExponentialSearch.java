package homework6_4;

import java.util.Arrays;

public class ExponentialSearch {
	static int ExponentialSearch(int arr[],int n, int x){

//aradýðýmýz deðer 0. indiste ise 0 deðerini döndürür.
        if (arr[0] == x)
        return 0;

//ikili arama için aralýðý bulmaya çalþýþýyoruz.
// her defasýnda 2 ye katlanýyor.
        int i = 1;
        while (i < n && arr[i] <= x)
        i = i*2;

// En son bulunan aralýk için için ikili arama yapýyoruz.
        return Arrays.binarySearch(arr, i/2,
        Math.min(i, n-1), x);

    }
}