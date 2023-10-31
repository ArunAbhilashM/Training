package Java;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet {

    public static void main(String[] args) {
        TreeSet productSet = new TreeSet<>();

        // Adding product names to the TreeSet
        productSet.add("Product1");
        productSet.add("Product2");
        productSet.add("Product3");
        productSet.add("Product4");

        // Trying to add a duplicate product name
        productSet.add("Product2");

        // Printing all product names using an iterator
        System.out.println("All product names in the TreeSet:");
        Iterator<String> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Printing the first and last product names
        System.out.println("First product: " + productSet.first());
        System.out.println("Last product: " + productSet.last());

        // Printing the size of the TreeSet
        System.out.println("Size of TreeSet: " + productSet.size());

        // Removing a particular product from TreeSet
        String productToRemove = "Product3";
        if (productSet.contains(productToRemove)) {
            productSet.remove(productToRemove);
            System.out.println(productToRemove + " removed from the TreeSet");
        } else {
            System.out.println(productToRemove + " not found in the TreeSet, cannot remove");
        }

        // Verifying the size of the TreeSet after removal
        System.out.println("Size of TreeSet after removal: " + productSet.size());
    }
}
