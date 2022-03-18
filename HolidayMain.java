
public class HolidayMain {

public static void main(String[] args) {
		
		Holiday h1 = new Holiday("Tamizh New year",14,"April");
		Holiday h2 = new Holiday("Ambedkar Jayanti",14,"April");
		Holiday h3 = new Holiday("Independence Day",15,"August");
		Holiday h4 = new Holiday("Republic day",26,"January");
		
		Holiday[] arr = {h1,h2,h3,h4};
		
		System.out.println(Holiday.inSameMonth(h1,h2));
		
		System.out.println(Holiday.avgDate(arr));
		
		
		
	}
}

class Holiday{
    
    private String name;
    private int day;
    private String month;
    
   Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }
    
    static boolean inSameMonth(Holiday obj1, Holiday obj2){
            if(obj1.month.equals(obj2.month))return true;
            else return false;
        }
        
    static double avgDate(Holiday arr[]) {
        int sum_=0;
        for(int i=0;i<arr.length;i++)
            sum_+=arr[i].day;
        return sum_/arr.length;
    }

}
