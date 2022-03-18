import java.util.Scanner;

public class PR {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    String str =sc.next();
	    
	    str = str.toLowerCase();
	    
	    boolean isPerfect = true;
	    
	    for(int i=0;i<str.length();i++){
	  
	        if(i!=str.length()-1){
	            
	            if(str.charAt(i)=='p' && str.charAt(i+1)=='r')continue;
	            
	            else if (str.charAt(i)=='r' && str.charAt(i+1)=='p')continue;
	            
	            else{
	                
	                isPerfect=false;
	                
	                break;
	            }
	            
	       }else if(str.charAt(i-1)=='p' && str.charAt(i)=='r'|| str.charAt(i-1)=='r' && str.charAt(i)=='p'){
	           continue;
	       }else{
	           isPerfect=false;
	           break;
	       }
	    }
	    
	    if(isPerfect){
	        System.out.println("Perfect");
	    }else{
	        System.out.println("Imperfect");
	    }
	    
	    sc.close();
	    
	}

}
