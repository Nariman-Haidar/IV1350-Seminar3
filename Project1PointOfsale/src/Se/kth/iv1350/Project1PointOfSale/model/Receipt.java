package Se.kth.iv1350.Project1PointOfSale.model;
        import Se.kth.iv1350.Project1PointOfSale.integration.ItemDTO;
        import Se.kth.iv1350.Project1PointOfSale.integration.StorDTO;

        import java.time.LocalDateTime;
        import java.util.ArrayList;
        import java.util.List;

/**
 * This class to creat the receipt.
 * @author narim
 */
public class Receipt {
    private CurrentSale currentSale;
    private StorDTO storDTO;
    private List<ItemDTO> items = new ArrayList<ItemDTO>();
    private double totalPrice;
    public Receipt(CurrentSale currentSale, StorDTO storDTO){
        this.storDTO = storDTO;
        this.items = currentSale.getItems();
        this.currentSale = currentSale;
        this.totalPrice = currentSale.getTotalPrice();
    }

    /**
     *  Creates a new instance.
     * @param currentSale
     */
    public Receipt(CurrentSale currentSale) {
        this.currentSale = currentSale;
    }

    /**
     * Creat a string with the whole content of receipt.
     * @return string of receipt.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("\nReceipt : ");
        addLocalDate(sb);
        sb.append("\n");
        sb.append("Store Name: " +storDTO.getName());
        sb.append("\nItems : ");
        sb.append("\n");
        for(ItemDTO item: items){
            sb.append("ID: " +item.getItemDescription()+ "    ");
            sb.append("Name: " +item.getItemID()+ "    ");
            sb.append("Quantity: " +item.getItemQuantity()+ "    ");
            sb.append("VAT: " +item.getVat()+ "    ");
            sb.append("Price With Vat: " +item.getPrice()+ "    ");
            appendLine(sb,"\n");
        }

        appendLine(sb,"\n");
        sb.append(currentSale.updateTotalPrice()+ "\n");
        sb.append("Discount: " +currentSale.getTotalPriceAfterDiscount()+ "\n");
        sb.append("Change With Price After Discount: " +currentSale.getChange()+ "\n");
        sb.append("Price to pay: " +currentSale.getChange()+ "\n");
        appendLine(sb, "----------END----------");
        return sb.toString();
    }
    private void addLocalDate(StringBuilder builder){
        LocalDateTime saleTime = LocalDateTime.now();
        appendLine(builder, "Sale time: " + saleTime.toLocalDate().toString());
    }
    private void appendLine(StringBuilder builder, String line){
        builder.append(line);
    }
}
