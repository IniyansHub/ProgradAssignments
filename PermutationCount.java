import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PermutationCount {

	static int factorial(int num)
    {
        if(num==0 || num==1)return num;
        return num*factorial(num-1);
    }
    
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int len = word.length();
		HashMap <Character,Integer> charCount = new HashMap <Character,Integer> ();
		for(int i=0;i<len;i++)
		{
		    charCount.put(word.charAt(i), (charCount.getOrDefault(word.charAt(i), 0) +1));
		}
		int num = factorial(len);
		int den = 1;
		for(Map.Entry<Character,Integer> entry: charCount.entrySet())
		{
		    den = den * factorial(entry.getValue());
		}
		int output = num/den;
		System.out.println(output);
		sc.close();
	}

}
