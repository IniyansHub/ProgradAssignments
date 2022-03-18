import java.util.Scanner;

import java.util.regex.*;

public class UniqueDateCount {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	
	    String str = sc.nextLine();
		
		String unique="";
		
		int count =0;
		
		Matcher m = Pattern.compile("(\\d{1,2}-\\d{1,2}-\\d{4}|\\d{1,2}-\\d{1,2})", Pattern.CASE_INSENSITIVE).matcher(str);
        
        while (m.find()) {
          
          String date[]=(m.group(1)).split("-");
          
          if(!unique.contains(date[2])){
              unique+=date[2];
              count++;
          }
          
          
        }
        
        System.out.println(count);
        
        sc.close();
		
	}

}
