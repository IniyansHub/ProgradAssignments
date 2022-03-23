import java.util.Scanner;
public class ProductPairs {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
  
	int n=sc.nextInt();
  
	int arr[]=new int[n];
	
  for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	}
	
  int Product;
  
  Product=sc.nextInt();
	
  sc.close();
  
  int count=0;
	
  Arrays.sort(arr);
  
  for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			int result=arr[i]*arr[j];
			if(result==Product) {
				count++;
			}
		}
	
	}
	System.out.println(count);
}
}
