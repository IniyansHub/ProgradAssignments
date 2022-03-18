import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentRecord {

	 static Scanner sc = new Scanner(System.in);
	   
	   static File stuRecord = new File("student.txt");
	   
	   
	   static void createFile(){
	      try{
	         
	         if(!stuRecord.createNewFile()){
	            System.out.println("File named "+stuRecord.getName()+" created successfully\n");
	         }else{
	            System.out.println("File already exists!");
	         }
	         
	         
	      }catch (IOException e) {
	         
	         System.out.println("An error occurred.");
	         e.printStackTrace();
	         
	      }
	   }
	   
	   static void addRecord(){
	      
	      System.out.println("Enter Student Name:");
	      String name = sc.next();
	      System.out.println("Enter Register Number:");
	      int regNumber = sc.nextInt();
	      System.out.println("Enter Department Name:");
	      String deptName = sc.next();
	      
	      try{
	         
	         FileWriter writer = new FileWriter(stuRecord.getName(),true);
	         writer.write(name+" "+regNumber+" "+deptName+"\n");
	         System.out.println("New record added successfully!!");
	         writer.close();
	      
	      }catch(IOException e){
	         
	         System.out.println("An error occurred.");
	         e.printStackTrace();
	         
	      }

	   }
	   
	   static void displayDetails(){
	      
	      System.out.println("------------------------------------------");
	      
	       try {
	         Scanner myReader = new Scanner(stuRecord);
	         while (myReader.hasNextLine()) {
	            String data = myReader.nextLine();
	            System.out.println(data);
	         }
	         myReader.close();
	      } catch (FileNotFoundException e) {
	       
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	      
	      }
	   }
	   
	   public static void main(String[] args){
	      
	      
	      int input;
	      do{
	         System.out.println("1.Create a File\n2.Add a Student Reocord\n3.Display the Student Details\n4.Exit");
	         input = sc.nextInt();
	         
	         switch(input){
	            
	            case 1: 
	               createFile();
	               break;
	            case 2:
	               addRecord();
	               break;
	            case 3:
	               displayDetails();
	               break;
	            case 4:
	               System.out.println("See you again!");
	               break;
	         }
	         
	      }while(input!=4);
	   }

}
