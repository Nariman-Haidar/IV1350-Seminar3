package Se.kth.iv1350.Project1PointOfSale.view;
        import Se.kth.iv1350.Project1PointOfSale.controller.Controller;

/**
 * This is a placeholder for real view.
 * It contains a hard coded execution with calls to all systems operations in the controller.
 * @author narim
 */
public class View {
    private Controller controller;
    /**
     * Creat a new instance that uses the specified controller for all calls to other layer.
     * @param controller
     */
    public View(Controller controller) {
        this.controller = controller;
    }

    /**
     * Perform a sale fake by calling all systems operations in the controller.
     */
    public void fakeExecution(){
        System.out.println("Cashier starts new sale");
        controller.startNewSale();
        System.out.println("Cashier enter items:");
        controller.scanItem("Chips", 1);
        controller.scanItem("Sallad", 1);
        controller.scanItem("Candy", 1);
        controller.scanItem("Cola", 1);
        controller.scanItem("Juce", 1);
        controller.printOutTheReceipt();

    }



}
