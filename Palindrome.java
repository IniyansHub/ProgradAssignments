import java.util.Scanner;
public class Palindrome {
	
	static void checkPalindrome(String str)
    {
        int len = str.length();
        String duplicate = str;
        String reverse;
        
        for(int i=0;i<len;i++)
        {
            for(int j=i;j>=0;j--)
            {
                duplicate+=str.charAt(j);
            }
            
            reverse = reverse(duplicate);
            
            if(duplicate.equals(reverse))
                System.out.println(duplicate);
            else
                duplicate = str;
        }       
    }
	
	
	static String reverse(String check)
    {
        String rev="";
        int n=check.length()-1;
        
        for(int i=n;i>=0;i--)
        {
            rev=rev+check.charAt(i);
        }
        return rev;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palindrome = sc.nextLine();
		
		checkPalindrome(palindrome);
		
		sc.close();
		
		}

}
