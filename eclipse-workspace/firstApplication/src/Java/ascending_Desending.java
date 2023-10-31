package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ascending_Desending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numbers = new ArrayList<String>();
		numbers.add("Aamir");
		numbers.add("Aamir");
		numbers.add("Arun");
		numbers.add("Arun");
		numbers.add("Angam");
		numbers.add("Pavan");
		numbers.add("Kumar");
		numbers.add("Reddy");
		numbers.add("Shreeman");
		numbers.add("Kishore");
		numbers.add("Yogi");
		List <String> ascending =numbers.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("Ascending Order: "+ascending);
		List<String> descending = numbers.stream().sorted((s1, s2) -> s2.compareTo(s1)).distinct().collect(Collectors.toList());
		System.out.println("Descending Order: "+descending);
	}

}
