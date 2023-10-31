package Java;

import java.util.ArrayList;
import java.util.List;

public class max_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(49);
		numbers.add(59);
		numbers.add(69);
		numbers.add(80);
		numbers.add(89);
		numbers.add(99);
		Integer Max=numbers.stream().max(Integer::compare).get();
		System.out.println("Max List: "+Max);
		int min = numbers.stream().min(Integer::compare).get();
		System.out.println("Min List: "+min);
	}

}
