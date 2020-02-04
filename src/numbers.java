import java.util.Scanner;
public class numbers {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n=keyboard.nextInt();
		keyboard.close();
		int even[]=new int [n];
		int odd[]=new int [n];
		for(int i=0;i<n;i++)
		{
			if (i%2==0) even[i]=i;
			odd[i]=i;
			
		}
		System.out.println("Even numbers are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(","+even[i]);
		}
		
	}

}
