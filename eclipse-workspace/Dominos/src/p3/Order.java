package p3;

import java.util.Date;
 
public class Order implements Deliverable {
    @SuppressWarnings("unused")
	private int orderNo;
    @SuppressWarnings("unused")
	private Date orderDate;
    @SuppressWarnings("unused")
	private int cost;
    @SuppressWarnings("unused")
	private String custName;
    @SuppressWarnings("unused")
	private String custAddress;
    private int approxDistance;
 
    public Order(int orderNo, Date orderDate, int cost, String custName, String custAddress, int approxDistance) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.cost = cost;
        this.custName = custName;
        this.custAddress = custAddress;
        this.approxDistance = approxDistance;
    }
 
    @Override
    public boolean delivery() {
        if (approxDistance <= deliveryAreaLimit) {
            return true;
        } else {
            System.out.println("Home Delivery not available for this distance.");
            return false;
        }
    }
}
 