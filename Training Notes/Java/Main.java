public class Main {

 

	public static void main(String[] args) {

		int num=Integer.parseInt(args[0]);

		int reversed=0;

		if(num<0)

			  System.out.println("Invalid");

		  else {

		

		  for(;num != 0; num /= 10) {

		      int digit = num % 10;

		      reversed = reversed * 10 + digit;

		    }

		while(reversed>0)

		{

			int var=reversed%10;

			switch(var)

			{

			case 0:System.out.print("zero ");break;

			case 1:System.out.print("one ");break;

			case 2:System.out.print("two ");break;

			case 3:System.out.print("three ");break;

			case 4:System.out.print("four ");break;

			case 5:System.out.print("five ");break;

			case 6:System.out.print("six ");break;

			case 7:System.out.print("seven ");break;

			case 8:System.out.print("eight ");break;

			case 9:System.out.print("nine ");break;

			}

			reversed=reversed/10;

		}

		  }

 

	}

 

}