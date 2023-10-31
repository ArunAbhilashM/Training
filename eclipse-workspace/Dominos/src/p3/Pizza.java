package p3;

public abstract class Pizza {
    protected String type;
    private String toppings;
    private String name;
    private float timeForPreparation;
    private int costOfPizza;
    private String size;
 
    public Pizza(String type, String toppings, String name, float timeForPreparation, int costOfPizza, String size) {
    	 this.type = type;
         this.toppings = toppings;
         this.name = name;
         this.timeForPreparation = timeForPreparation;
         this.costOfPizza = costOfPizza;
         this.size = size;
    }
         public abstract int calculateCost();
         
         @Override
         public String toString() {
             return "Pizza Details: \n" +
                     "Type: " + type + "\n" +
                     "Toppings: " + toppings + "\n" +
                     "Name: " + name + "\n" +
                     "Time for Preparation: " + timeForPreparation + " minutes\n" +
                     "Cost of Pizza: $" + costOfPizza + "\n" +
                     "Size: " + size + "\n" +
                     "Total Cost: $" + calculateCost();
         }
 
       
    }
 

 
