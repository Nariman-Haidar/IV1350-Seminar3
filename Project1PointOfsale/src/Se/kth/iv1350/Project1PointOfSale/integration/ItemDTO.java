package Se.kth.iv1350.Project1PointOfSale.integration;

/**
 * This class to handle item DTO that have all information about items.
 */
public class ItemDTO {
    private final String itemID;
    private String itemDescription;
    private  int itemQuantity;
    private final double price;
    private final double vat;
    private int quantity;

    /**
     *
     * @param itemDescription for the item.
     * @param itemID the id of item.
     * @param itemQuantity the quantity of item.
     * @param price the price of item.
     * @param vat the vat of item.
     */
    public ItemDTO(String itemDescription,String itemID, int itemQuantity, double price, double vat) {
        this.itemDescription= itemDescription;
        this.itemID = itemID;
        this.itemQuantity = itemQuantity;
        this.price = price;
        this.vat = vat;
    }
    /**
     * Returns the quantity of the item
     * @return
     */
    public int getItemQuantity() {
        return itemQuantity;
    }
    public void setQuantity(int quantity){

        this.quantity = quantity;
    }

    /**
     *
     * @return the value of price of the item.
     */

    public double getPrice() {
        return price;
    }

    /**
     * Returns the VAT of the item.
     * @return
     */

    public  double getVat() {
        return vat;
    }

    /**
     * Returns the id of the item
     * @return
     */

    public String getItemID() {

        return itemID;
    }

    /**
     * This instance to plus another quantity.
     * @param moreQuantity
     */
    public  void increaseQuantity(int moreQuantity){
        this.quantity = this.quantity+ (moreQuantity);
    }

    /**
     * This instance to minus another quantity.
     * @param moreQuantity
     */
    public void decreaseQuantity(int moreQuantity){
        this.quantity = this.quantity-(moreQuantity);
    }


    /**
     * Returns the Description of the item.
     * @return
     */

    public String getItemDescription() {

        return itemDescription;
    }



}

