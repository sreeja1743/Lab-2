import java.util.*;

public class SortArrOfStrings {
	Scanner s = new Scanner(System.in);
	//System.out.println("Enter the size of array:");
	int n = s.nextInt();
    public static void main(String args[]) {
    	@SuppressWarnings("resource")
    	Scanner s = new Scanner(System.in);
    	SortArrOfStrings obj = new SortArrOfStrings();
    	String str[] = new String[obj.n];
    	for(int i = 0; i < obj.n; i++)
    		str[i] = s.next();
    	String temp = " ";
    	for(int i = 0; i < obj.n; i++) {
    		for(int j = i+1; j < obj.n; j++) {
    			if(str[i].compareTo(str[j])>0) {
    				temp = str[i];
    				str[i] = str[j];
    				str[j] = temp;
    			}
    		}
    	}
       
    	obj.getData(obj.changeToUL(str));	
}
    public String[] changeToUL(String s[]) {
    	if(n%2 != 0) {
    	changeToUpC(s, 0, (n/2)+1);
    	changeToLwC(s, (n/2)+1, n);}
    	else {
        	changeToUpC(s, 0, (n/2));
        	changeToLwC(s, (n/2), n);}
    	return s;
    }
     public void changeToUpC(String s[], int i, int n) {
    	   for(int j = i; j < n; j++)
    		   s[j] = s[j].toUpperCase();
     }
     public void changeToLwC(String s[], int i, int n) {
  	   for(int j = i; j < n; j++)
  		   s[j] = s[j].toLowerCase();
  	 
   }
    public void getData(String s[]) {
    	System.out.println("Array of strings");
    	for(int i = 0; i < n; i++)
    		System.out.print(" "+s[i]);
    }
}
 