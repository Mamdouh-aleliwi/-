import java.util.Scanner;

public class MyClass28 {

	public static void main(String[] args) {
       
		String a[] [] = {
				{"dell","Processor:i5 hard:250GB SSD Ram:4GB"},
				{"hp","Processor:i7 hard:2T HDD Ram:16GB"},
			    {"acer","Processor:i7 hard:1T HDD Ram:12GB"},
				{"samsung","Processor:i3 hard:750GB SSD Ram:4GB"},
				{"macbook","Processor:i5 hard:256GB SSD Ram:8GB"}
		                              };
	
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the laptop :");
		String A = reader.next();		
		 
		for(int i = 0; i < a.length; i++)
			  if(A.equals( a[i][0])) {
			  System.out.println("Specifications :" + a[i][1]);
			  break;
			  }
		
		reader.close();

		
		
		
		
	}

}


