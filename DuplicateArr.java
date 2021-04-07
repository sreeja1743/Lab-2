import java.util.*;

public class DuplicateArr {
    public static void main(String args[]) {
    	Scanner s = new Scanner(System.in);
    	 System.out.println("Enter size of the array:");
    	   int n = s.nextInt();
    	   int arr[] = new int[n];
    	   System.out.println("Enter the numbers:");
    	   for(int i = 0; i < n; i++)
    		   arr[i] = s.nextInt();
    	   DuplicateArr obj = new DuplicateArr();
    	   obj.duplicateArr(arr, n);
    }
    public void duplicateArr(int arr[], int n) {
    	LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
    	for(int i = 0; i < n; i++) {
    		s.add(arr[i]);
    	}
    	List<Integer> l = new ArrayList<>(s);
    	Collections.reverse(l);
         for(int i:l)
        	 System.out.print(i+" ");
    }
    
}