import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class SwapAdjacent {

	static void swapAlternate (ArrayList < Integer > list)
	  {


	    int size = list.size ();

	    for (int i = 0; i < size; i = i + 2)
	      {
		if (i != size - 1)
		  {
		    Collections.swap (list, i, i + 1);
		  }
	      }

	    System.out.println ();

	  }

	  public static void main (String[]args)
	  {

	    Scanner sc = new Scanner (System.in);

	    int n = sc.nextInt ();
	    ArrayList < Integer > list = new ArrayList < Integer > ();
	    for (int i = 0; i < n; i++)
	      {
		int value = sc.nextInt ();
		list.add (value);
	      }


	    swapAlternate (list);

	    Iterator < Integer > iter = list.iterator ();

	    while (iter.hasNext ())
	      {
		System.out.print (iter.next () + " ");
	      }

	    sc.close();
	  }

}
