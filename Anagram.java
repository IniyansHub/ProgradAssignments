import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

	public static void main(String args[]) {
	      
	    Scanner sc = new Scanner(System.in);

	    String str1 = sc.next();
	    String str2 = sc.next();
	    
	    HashMap < Character, Integer > hashmap1 = new HashMap < Character, Integer > ();
	    HashMap < Character, Integer > hashmap2 = new HashMap < Character, Integer > ();
	    
	    char arr1[] = str1.toCharArray();
	    char arr2[] = str2.toCharArray();

	    for (int i = 0; i < arr1.length; i++) {

	      if (hashmap1.get(arr1[i]) == null) {

	        hashmap1.put(arr1[i], 1);
	      } else {
	        Integer c = (int) hashmap1.get(arr1[i]);
	        hashmap1.put(arr1[i], ++c);
	      }
	    }

	    for (int j = 0; j < arr2.length; j++) {

	      if (hashmap2.get(arr2[j]) == null)
	        hashmap2.put(arr2[j], 1);
	      else {

	        Integer d = (int) hashmap2.get(arr2[j]);
	        hashmap2.put(arr2[j], ++d);
	      }
	    }

	    System.out.println(hashmap1.equals(hashmap2));
	    
	    sc.close();

	  }

}
