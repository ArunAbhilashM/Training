package project;

class CustomerReport {
    private Customer[] custList;
 
     public CustomerReport(int size) {
         custList = new Customer[size];
     }
 
     public void addCustomer(Customer customer) {
         for (int i = 0; i < custList.length; i++) {
             if (custList[i] == null) {
                 custList[i] = customer;
                 break;
             }
         }
     }
    
 
     public void printList() {
         for (Customer customer : custList) {
             if (customer != null) {
                 customer.display();
             }
         }
     }
 
}