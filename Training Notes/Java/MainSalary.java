import java.util.Scanner;
class Employee {
    String name;
    int age;
    double salary;
	Employee(String name, int age, double basic, double hra, double da, double specialAllowance) {
        this.name = name;
        this.age = age;
        this.salary = calculateSalary(basic, hra, da, specialAllowance);
    }
	Employee(String name, int age, double basic, double hra, double da) {
        this.name = name;
        this.age = age;
        this.salary = calculateSalary(basic, hra, da);
    }
	double calculateSalary(double basic, double hra, double da, double specialAllowance) {
        return basic + hra + da + specialAllowance;
    }
	double calculateSalary(double basic, double hra, double da) {
        return basic + hra + da;
    }
	void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}
	public class MainSalary {
    	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	Employee[] employees = new Employee[5];
	for (int i = 0; i < 1; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
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
            System.out.print("Special Allowance (0 if none): ");
            double specialAllowance = scanner.nextDouble();
		scanner.nextLine();
		if (specialAllowance == 0) {
                employees[i] = new Employee(name, age, basic, hra, da);
            } else {
                employees[i] = new Employee(name, age, basic, hra, da, specialAllowance);
            }
        }
	for (Employee emp : employees) {
            emp.display();
        }
    }
}