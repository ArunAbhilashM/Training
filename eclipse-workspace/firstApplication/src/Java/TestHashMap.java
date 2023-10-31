package Java;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

class Employee{
	private HashMap<String,String> empNames = new HashMap<String,String>();
	public void setNames() {
		empNames.put("106864", "Aamir");
		empNames.put("106872", "Arun");
		empNames.put("106876", "Kishore");
		empNames.put("106888", "Pavan");
		empNames.put("106892", "Shreeman");
	}
//	public void searchName(String name) {
//        if (empNames.containsKey(name)) {
//            String value = empNames.get(name);
//            System.out.println(name + " is in the list with value: " + value);
//        } else {
//            System.out.println(name + " name is not in the list");
//        }
//    }
	public void printNames() {
        for (String key : empNames.keySet()) {
            String value = empNames.get(key);
            System.out.println(key + " : " + value);
        }
    }
	 
	 public void getName(String key) {
	        if (empNames.containsKey(key)) {
	            String value = empNames.get(key);
	            System.out.println("Value for key " + key + ": " + value);
	        } else {
	            System.out.println("Key " + key + " not found in the list");
	        }
	    }
	 public void printNamesKeySet() {
	        Set<String> keys = empNames.keySet();
	        for (String key : keys) {
	            String value = empNames.get(key);
	            System.out.println(key + " : " + value);
	        }
	    }
	 public void printSize() {
	        int size = empNames.size();
	        System.out.println("Size of HashMap: " + size);
	    }
	 public void remove(String key) {
	        if (empNames.containsKey(key)) {
	            empNames.remove(key);
	            System.out.println("Key " + key + " removed from the list");
	        } else {
	            System.out.println("Key " + key + " not found in the list, cannot remove");
	        }
	    }
}


public class TestHashMap {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s=new Employee();
		s.setNames();
		//s.searchName("");
		s.printNames();
		s.getName("106872");
	    s.printNamesKeySet();
	    s.printSize();
	    s.remove("106876");
	    s.printNames();
	}

}
