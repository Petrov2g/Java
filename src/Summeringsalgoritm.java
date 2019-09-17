import java.util.Scanner;

public class Summeringsalgoritm
{
    public static void main(String[] args) 
    {
   
    	Scanner scan = new Scanner(System.in); 
    	int number;
    	int sum = 0;
    	
    	System.out.println("No of arrays");
    	number = scan.nextInt();
    	
    	int a[] = new int[number];
    	System.out.println("Numbers...");
    	
    	for(int i = 0; i < number; i++) {
    		a[i] = scan.nextInt();
    		sum = sum + a[i]; 
    	}
    	
    	System.out.println("Sum = " + sum);
    	
    }
    
}



