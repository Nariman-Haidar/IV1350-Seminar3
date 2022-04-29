package Se.kth.iv1350.Project1PointOfSale.integration;

/**
 * This class to handle all information about discount.
 */

public class InformationForDiscount {
    private CustomerDTO customerDTO;
    private String customerID;
    private double discount;
    private final double TENPROCENTDISCOUNT = 0.1;
    private final double No_Discount = 0.0;

    /**
     * Creat a new instance of Information For Discount.
     */
    public InformationForDiscount(){

    }

    /**
     * Creat a new instance of Information For Discount.
     * @param customerID
     * @param discount
     */
    public InformationForDiscount(String customerID, double discount){
        this.customerID = customerID;
        this.discount = discount;
    }
    /**
     * This new instance to get the rate of discount to members.
     * @return discount if the customer is member,
     * and if the customer is not member it returns no discount rate.
     */
    public  double discountForMember() {
        double discount = 0.1;
        if (customerDTO.getCustomerID().equals(customerID)) {
            System.out.println("true");
            return discount = discount + TENPROCENTDISCOUNT;
        }

        return  No_Discount ;
    }

    /**
     * This method to get the discount.
     * @return discount.
     */
    public double getDiscount() {
        return this.discount;
    }
}
