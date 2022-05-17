package homework6_2;

public class LinearSearch {
	public static int search(int arr[], int x)
    {
//dizinin boyutunu n değerine atadık.        
		int n = arr.length;
		
//0. indisten n. indise kadar tek tek karşılaştırma yaptık.        
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

}
