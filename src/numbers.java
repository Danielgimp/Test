import java.util.Scanner;
public class numbers {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner keyboard = new Scanner(System.in);
		int n=keyboard.nextInt();
		keyboard.close();
		int even[]=new int [n];
		int odd[]=new int [n];
		for(int i=0;i<n;i++)
		{
			if (i%2==0) even[i]=i;
			else odd[i]=i;
			
		}
		System.out.println("Even numbers are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(","+even[i]);
		}
		System.out.println("");
		System.out.println("Odd numbers are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(","+odd[i]);
		}
		
		
	}

}
