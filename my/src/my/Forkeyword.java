package my;
import java.util.*;
public class Forkeyword {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number ");
		int a= sc.nextInt();  
		
		for(int i=1;i<=a;i++) {
			
			sum=sum+i;
		}
		System.out.println("Sum of first n no. is "+sum);
		
	}
	

}
