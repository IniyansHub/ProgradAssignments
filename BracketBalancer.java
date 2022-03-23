import java.util.*;
public class BracketBalancer
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    String str = sc.next ();

      Stack < Character > s = new Stack <> ();

    for (char ch:str.toCharArray ())
      {
	if (ch == '{' || ch == '[' || ch == '(')
	  {
	    s.push (ch);
	  }
      }

    String output = "";

    while (!(s.empty ()))
      {
	char popped = s.pop ();
	if (popped == '(')
	  {
	    output = popped + output + (char) (popped + 1);// ( =>28 )=>29  
	  }
	else
	  {
	    output = popped + output + (char) (popped + 2);// [ => 91 ]=>93 , { => 123 }=>125
	  }

      }

    System.out.println (output);


  }
}


