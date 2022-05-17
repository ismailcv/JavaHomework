package homework6_1;

public class BinarySearch {
	int BinarySearch(int arr[], int left, int right, int x){
        if (right >= left){
            int mid = left + (right - left) / 2;
 
// E�er eleman tam ortada ise            
            if (arr[mid] == x){
                return mid;
            }
            
//��e ortadan k���kse, yaln�zca sol alt dizide bulunabilir 
            if (arr[mid] > x){
                return BinarySearch(arr, left, mid - 1, x);
            }
            
//Aksi takdirde, ��e yaln�zca sa� alt dizide bulunabilir.           
            return BinarySearch(arr, mid + 1, right, x);
        }
 
//Dizide eleman olmad���nda buraya ula��yoruz.      
        return -1;
    }

}
