package Se.kth.iv1350.Project1PointOfSale.integration;

        import java.util.ArrayList;
        import java.util.List;

/**
 * This class to handle the customer information.
 */
public class CustomerDTO {
    private String customerID;
    List<CustomerDTO> customers = new ArrayList< >();

    /**
     * Creat a new instance.
     * @param customerID
     */
    public CustomerDTO( String customerID) {

        this.customerID = customerID;
    }

    /**
     * This method to add all customer that are members.
     */
    public CustomerDTO() {
        addCustomer();
    }
    private void  addCustomer() {
        customers.add(new CustomerDTO("1"));
        customers.add(new CustomerDTO("2"));
    }

    /**
     * This method to check if the customer is member by using customer id.
     * @param customerID
     * @return the customer if it exists and if not it returns Not Valid ID.
     */
    public CustomerDTO registerCustomer(String customerID){
        for (CustomerDTO customer : customers)
            if(customer.customerID.equals(customerID))
                return customer;
        {
            System.out.println("Not Valid ID");
            return null;
        }
    }

    /**
     * this new instance to get the customer id.
     * @return
     */

    public String getCustomerID() {
        return customerID;
    }
}
