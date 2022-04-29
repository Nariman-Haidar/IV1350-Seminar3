package Se.kth.iv1350.Project1PointOfSale.startup;

        import Se.kth.iv1350.Project1PointOfSale.integration.Creator;
        import Se.kth.iv1350.Project1PointOfSale.controller.Controller;
        import Se.kth.iv1350.Project1PointOfSale.integration.Printer;
        import Se.kth.iv1350.Project1PointOfSale.integration.StorDTO;
        import Se.kth.iv1350.Project1PointOfSale.view.View;

/**
 * Start the entrie application,
 * contain the main method used to start the application.
 * @author narim
 */
public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator ();
        Printer printer = new Printer();
        StorDTO storDTO = new StorDTO("Hem affär ");
        Controller controller = new Controller(creator,printer,storDTO);
        View view = new View(controller);
        view.fakeExecution();

    }
}
