import java.util.*;

public class SortArr {
    public static void main(String args[]){
    	@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
    	 System.out.println("Enter size of the array:");
  	   int n = s.nextInt();
  	   int arr[] = new int[n];
  	   System.out.println("Enter the numbers:");
  	   for(int i = 0; i < n; i++)
  		   arr[i] = s.nextInt();
  	   SortArr obj = new SortArr();
  	   obj.getData(obj.sortArr(arr, n));
    }
    public int[] sortArr(int arr[], int n){
    	String s = " ";
    	for(int i = 0; i < n; i++) {
    		s = Integer.toString(arr[i]);
    		String p = new StringBuffer(s).reverse().toString();
    		arr[i] = Integer.parseInt(p);
    	}
    	return arr;
    }
    public void getData(int arr[]) {
    	Arrays.sort(arr);
    	System.out.print("sorted Array: ");
    	for(int x: arr) {
    		System.out.print(x+" ");
    	}
    }
}
