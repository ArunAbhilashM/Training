package Java;

import java.util.ArrayList;
import java.util.List;
 
public class odd_Even {
 
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		{
			numbers.add(49);
			numbers.add(59);
			numbers.add(69);
			numbers.add(80);
			numbers.add(89);
			numbers.add(99);
			int evenSum = numbers.stream()
					.filter(number -> number%2 == 0)
					.mapToInt(Integer::intValue)
					.sum();
			int oddSum = numbers.stream()
					.filter(number -> number%2 != 0)
					.mapToInt(Integer::intValue)
					.sum();
			System.out.println("Sum of Even Numbers : " +evenSum);
			System.out.println("Sum of Odd Numbers : " +oddSum);
 
			
		}
 
	}
 
}