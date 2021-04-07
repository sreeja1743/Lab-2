import java.util.*;

public class SecSmallestArr {
   public static void main(String args[]){
	   @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	   System.out.println("Enter size of the array:");
	   int n = s.nextInt();
	   int arr[] = new int[n];
	   System.out.println("Enter the numbers:");
	   for(int i = 0; i < n; i++)
		   arr[i] = s.nextInt();
	   SecSmallestArr obj = new SecSmallestArr();
	   obj.getData(obj.secSmallestNum(arr, n));
   }
   public int secSmallestNum(int arr[], int n) {
	   Arrays.sort(arr);
	   return arr[1];
   }
   public void getData(int n) {
	   System.out.println("Second smallest number n the array:"+ n);
   }
}
