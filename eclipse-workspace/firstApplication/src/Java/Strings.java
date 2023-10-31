package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		List<String> strings=new ArrayList<String>();
		        {
		        strings.add("Kishore");
		        strings.add("Shreeman");
		        }
		        
		 
		        List<String> upperCaseStrings = strings.stream()
		                .map(String::toUpperCase)
		                .collect(Collectors.toList());
		 
		        System.out.println("Uppercase: " + upperCaseStrings);
		 
		        List<String> lowerCaseStrings = strings.stream()
		                .map(String::toLowerCase)
		                .collect(Collectors.toList());
		 
		        System.out.println("Lowercase: " + lowerCaseStrings);
		    }
}