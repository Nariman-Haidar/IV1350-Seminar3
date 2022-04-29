package Se.kth.iv1350.Project1PointOfSale.integration;

        import Se.kth.iv1350.Project1PointOfSale.model.CurrentSale;
        import java.util.ArrayList;
        import java.time.LocalTime;
        import java.util.List;

/**
 * This class to handle the accounting System.
 * @author narim
 */
public class AccountingSystem {
    private List<CurrentSale> AccountingSystem = new ArrayList<>();
    private LocalTime saleTime;

    /**
     * This method to get the local time of sale.
     */
    public AccountingSystem(){

        saleTime = LocalTime.now();
    }
    public LocalTime getTimeOfSale(){

        return this.saleTime;
    }

    /**
     * This method to update the accounting system after the sale is finished.
     * @param currentSale
     */
    public void updateAccountingSystem(CurrentSale currentSale){
        AccountingSystem.add(currentSale);
    }
}
