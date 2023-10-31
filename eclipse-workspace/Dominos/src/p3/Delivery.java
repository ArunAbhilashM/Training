package p3;
import java.util.Date;
import java.util.Scanner;
 
@SuppressWarnings("unused")
public class Delivery {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter pizza details:");
        System.out.print("Pizza Type (Veg/Non-Veg): ");
        String type = scanner.nextLine();
 
 
        System.out.print("Pizza Toppings: ");
        String toppings = scanner.nextLine();
 
 
        System.out.print("Pizza Name: ");
        String name = scanner.nextLine();
        System.out.print("Time for Preparation: ");
        float preparationTime = scanner.nextFloat();
        scanner.nextLine(); // consume newline
        System.out.print("Pizza Size (Small/Medium): ");
        String size = scanner.nextLine();
        System.out.println("-----------------------------------------------");
        ItalianPizza italianPizza = new ItalianPizza(type, toppings, name, preparationTime, size);
        System.out.println(italianPizza.toString());
 
        System.out.println("-----------------------------------------------");
        scanner.close();
    }
}