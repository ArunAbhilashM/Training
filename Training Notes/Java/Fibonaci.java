import java.util.Scanner;
 public class Fibonoci {
  public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int i = 1;
	int n=input.nextInt();
	int firstTerm = 0;
	int secondTerm = 1;
    	System.out.println("Fibonacci Series" + n + " terms:");
	while (i <= n) {
      	System.out.print(firstTerm + ", ");
	int nextTerm = firstTerm + secondTerm;
      	firstTerm = secondTerm;
      	secondTerm = nextTerm;
	i++;
    }
  }
}