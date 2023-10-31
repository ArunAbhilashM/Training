package Java;
import java.util.Scanner;
public class Menu {
	private String dish_name;
	private float calories;
	private float cooking_time;
	private float price;
	private float wine;
	public String getDish_name() {
		return dish_name;
	}
	public void setDish_name(String dish_name) {
		this.dish_name = dish_name;
	}
	public float getCalories() {
		return calories;
	}
	public void setCalories(float calories) {
		this.calories = calories;
	}
	public float getCooking_time() {
		return cooking_time;
	}
	public void setCooking_time(float cooking_time) {
		this.cooking_time = cooking_time;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getWine() {
		return wine;
	}
	public void setWine(float wine) {
		this.wine = wine;
	}
	public Menu(String dish_name, float calories, float cooking_time, float price, float wine) {
		super();
		this.dish_name = dish_name;
		this.calories = calories;
		this.cooking_time = cooking_time;
		this.price = price;
		this.wine = wine;
	}
	
	public void printMenu_Details() {
		System.out.println("Menu"+dish_name+"contains"+calories+"calories, comes with"+wine+"bottles and cost price"+price);
	}
	
	
	
}

