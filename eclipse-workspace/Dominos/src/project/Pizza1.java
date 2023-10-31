package project;

public abstract class Pizza1 {
	private String type;
	private String Toppings;
	private String name;
	private float timeForPreparation;
	private int costOfPizza;
	private String size;
	
	public Pizza1(String type,String Toppings,String name,float timeForPreparation,int costOfPizza,String size){
		if (!isValidPizzaType(type)) {
            System.out.println("Invalid type. Only Veg and Non-Veg types are allowed.");
            return;
        }

        if (!isValidPizzaSize(size)) {
            System.out.println("Invalid size. Only small and medium sizes are available.");
            return;
        }
		
		this.type="Veg/Non-Veg";
		this.Toppings="null";
		this.name="Pizza";
		this.timeForPreparation=20;
		this.costOfPizza=79;
		this.size="CustomerChoice";
		
	}
	private boolean isValidPizzaType(String type) {
        return type.equals("Veg") || type.equals("Non-Veg");
    }

    private boolean isValidPizzaSize(String size) {
        return size.equals("small") || size.equals("medium");
    }

    public abstract int calculateCost();
    
    class ItalianPizza extends Pizza {
        public ItalianPizza(String type, String[] toppings, String name, float timeForPreparation, String size) {
            super(type, toppings, name, timeForPreparation);
        }

        @Override
        public int calculateCost() {
            int baseCost = 0;

            if (type.equals("veg") && size.equals("small")) {
                baseCost = 200;
            } else if (type.equals("veg") && size.equals("medium")) {
                baseCost = 350;
            } else if (type.equals("non-veg") && size.equals("small")) {
                baseCost = 270;
            } else if (type.equals("non-veg") && size.equals("medium")) {
                baseCost = 420;
            }

            int toppingsCost = toppings.length() * 30;

            return baseCost + toppingsCost;
        }

        @Override
        public String toString() {
            int totalCost = calculateCost();
            return "Italian " + super.toString() + "\nTotal Cost: $" + totalCost;
        }
    }

	
	}

