package p3;

import java.text.ParseException;
 
import java.text.SimpleDateFormat;
 
import java.util.Date;
 
import java.util.Scanner;
 
 
public class Reception {
 
    @SuppressWarnings("resource")
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
 
        System.out.print("Enter order number: ");
 
        int orderNo = scanner.nextInt();
 
        scanner.nextLine();
 
 
        System.out.print("Enter order date (DD/MM/YYYY): ");
 
        String orderDateString = scanner.nextLine();
 
        Date orderDate = parseDate(orderDateString);
 
 
        System.out.print("Enter order cost: ");
 
        int cost = scanner.nextInt();
 
        scanner.nextLine();
 
 
        System.out.print("Enter customer name: ");
 
        String custName = scanner.nextLine();
 
        System.out.print("Enter customer address: ");
 
        String custAddress = scanner.nextLine();
 
        System.out.print("Enter approximate distance (in km): ");
 
        int approxDistance = scanner.nextInt();
 
 
        Order order = new Order(orderNo, orderDate, cost, custName, custAddress, approxDistance);
 
 
        System.out.println("Delivery status: " + (order.delivery() ? "Deliverable" : "Not deliverable"));
 
    }
 
 
    private static Date parseDate(String dateString) {
 
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
 
        try {
 
            return dateFormat.parse(dateString);
 
        } catch (ParseException e) {
 
            System.out.println("Invalid date format. Please use DD/MM/YYYY.");
 
            return null;
 
        }
 
    }
 
}