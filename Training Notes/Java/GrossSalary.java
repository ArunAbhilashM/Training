import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the basic salary for the Employee : ");
        double basicSalary = input.nextDouble();
	double hra = 0;
        double da = 0;
	if (basicSalary >= 1 && basicSalary <= 4000) {
            hra = 0.10 * basicSalary;
            da = 0.50 * basicSalary;
        } 
	else if (basicSalary > 4001 && basicSalary <= 8000) {
            hra = 0.20 * basicSalary;
            da = 0.60 * basicSalary;
        } 
	else if (basicSalary > 8001 && basicSalary <= 12000) {
            hra = 0.25 * basicSalary;
            da = 0.70 * basicSalary;
        } 
	else if (basicSalary > 12000) {
            hra = 0.30 * basicSalary;
            da = 0.80 * basicSalary;
        }
	else{						{
	System.out.println("Enter a Valid Salary");
	}
        double grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary for the Employee is : " + grossSalary);
    }
}
