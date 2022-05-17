package homework6_1;

public class BinarySearch {
	int BinarySearch(int arr[], int left, int right, int x){
        if (right >= left){
            int mid = left + (right - left) / 2;
 
// Eðer eleman tam ortada ise            
            if (arr[mid] == x){
                return mid;
            }
            
//Öðe ortadan küçükse, yalnýzca sol alt dizide bulunabilir 
            if (arr[mid] > x){
                return BinarySearch(arr, left, mid - 1, x);
            }
            
//Aksi takdirde, öðe yalnýzca sað alt dizide bulunabilir.           
            return BinarySearch(arr, mid + 1, right, x);
        }
 
//Dizide eleman olmadýðýnda buraya ulaþýyoruz.      
        return -1;
    }

}
