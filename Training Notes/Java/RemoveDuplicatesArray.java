import java.util.*;
public class RemoveDuplicatesArray {
		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n= sc.nextInt();
		System.out.println("Enter the Array values : ");
		int input[]=new int[n];
		for(int i=0; i<n;i++)
		{
			input[i]=sc.nextInt();

		}
		for(int i=0;i<n;i++)
		{
			if(input[i]== -1)
			{
				continue;

			}
			for(int j=i+1;j<n;j++)
			{	
				if(input[i]==input[j])
				input[j]= -1;				

			}

		}
			for(int i=0;i<n;i++)
			{
				if(input[i] != -1)
				System.out.println(input[i]);

			}

			}

		}