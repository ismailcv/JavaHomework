package homework6_2;

public class LinearSearch {
	public static int search(int arr[], int x)
    {
//dizinin boyutunu n de�erine atad�k.        
		int n = arr.length;
		
//0. indisten n. indise kadar tek tek kar��la�t�rma yapt�k.        
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

}
