package p3;
public class ItalianPizza extends Pizza {
    private int costOfPizza;
	public ItalianPizza(String type, String toppings, String name, float timeForPreparation, String size) {
        super(type, toppings, name, timeForPreparation, 0, size);
    }
    @Override
    public int calculateCost() {
        int baseCost;
        if ("Veg".equalsIgnoreCase(getType())) {
            baseCost = "Small".equalsIgnoreCase(getSize()) ? 200 : 350;
        } else {
            baseCost = "Small".equalsIgnoreCase(getSize()) ? 270 : 420;
        }
        baseCost += 30;
        setCostOfPizza(baseCost);
        return baseCost;
    }
    public String getSize() {
 
		// TODO Auto-generated method stub
 
		return null;
 
	}
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
	private void setCostOfPizza(int baseCost) {
		// TODO Auto-generated method stub
		this.costOfPizza=baseCost;
	}
	@Override
    public String toString() {
        return super.toString() + "\nTotal Cost: " + calculateCost();
    }
}