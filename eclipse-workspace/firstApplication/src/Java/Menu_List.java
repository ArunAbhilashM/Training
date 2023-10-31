package Java;

import java.util.Scanner;

public class Menu_List {
	public static void main(String[] args) {
		Menu[] menu_list=new Menu[5];
		for(int i=0;i<5;i++)
		{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String dish_name=input.nextLine();
		System.out.println("amount of calorie in that dish: ");
		float calories=input.nextFloat();
		System.out.println("Cooking time taken for completion of dish: ");
		float cooking_time=input.nextFloat();
		System.out.println("Price for that dish: ");
		int price=input.nextInt();
		System.out.println("No of wine bottles: ");
		int wine=input.nextInt();
		menu_list[i]=new Menu(dish_name,calories,cooking_time,price,wine);
		}
		
	}

}
