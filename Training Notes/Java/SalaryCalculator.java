import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private double basic;
    private double hra;
    private double da;
    private double specialAllowance;
    private double salary;

    // Constructor for initializing employee objects
    public Employee(String name, int age, double basic, double hra, double da, double specialAllowance) {
        this.name = name;
        this.age = age;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.specialAllowance = specialAllowance;
    }

    // Destructor
    protected void finalize() {
        System.out.println(name + " is being deleted.");
    }

    // Method to calculate salary with special allowance
    public void calculateSalary() {
        salary = basic + hra + da + specialAllowance;
    }

    // Method to calculate salary without special allowance
    public void calculateSalary(double basic, double hra, double da) {
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.specialAllowance = 0;
        calculateSalary();
    }

    // Display employee details and salary
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Special Allowance: " + specialAllowance);
        System.out.println("Total Salary: " + salary);
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Basic Salary: ");
            double basic = scanner.nextDouble();
            System.out.print("HRA: ");
            double hra = scanner.nextDouble();
            System.out.print("DA: ");
            double da = scanner.nextDouble();
            System.out.print("Special Allowance: ");
            double specialAllowance = scanner.nextDouble();

            employees[i] = new Employee(name, age, basic, hra, da, specialAllowance);
            employees[i].calculateSalary();
            scanner.nextLine(); // Consume the newline character

            System.out.println("Employee " + (i + 1) + " details:");
            employees[i].displayDetails();
        }

        scanner.close();
    }
}
