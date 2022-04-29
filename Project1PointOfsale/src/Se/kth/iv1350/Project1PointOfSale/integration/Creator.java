package Se.kth.iv1350.Project1PointOfSale.integration;

/**
 * This class to creat all systems that needed in the application
 * @author narim
 */
public class Creator {

    private AccountingSystem accountingSystem;
    private InventorySystem inventorySystem;
    private InformationForDiscount informationForDiscount;

    /**
     * Creator return an object av accountingSystem,inventorySystem,
     * informationForDiscount.
     */

    public Creator() {

        accountingSystem = new AccountingSystem();
        inventorySystem = new InventorySystem();
        //informationForDiscount = new InformationForDiscount();


    }

    /**
     *
     * @return get an object of AccountingSystem.
     */


    public AccountingSystem getAccountingSystem() {

        return accountingSystem;
    }

    /**
     * get an object of InventorySystem
     * @return get an object of InventorySystem.
     */

    public InventorySystem getInventorySystem() {

        return inventorySystem;
    }

    /**
     *
     * @return get an object of InformationForDiscount.
     */
    public InformationForDiscount getInformationForDiscount() {

        return informationForDiscount;
    }

}