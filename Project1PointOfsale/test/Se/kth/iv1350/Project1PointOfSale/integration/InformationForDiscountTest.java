package Se.kth.iv1350.Project1PointOfSale.integration;

import Se.kth.iv1350.Project1PointOfSale.model.CurrentSale;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InformationForDiscountTest {
    private CustomerDTO customerExesist;
    private String customerID="1";
    private InformationForDiscount instance;
    private CurrentSale currentSale;
    private ByteArrayOutputStream printout;
    private PrintStream originalSysOut;


    @Before
    public void setUp() throws Exception {
        originalSysOut = System.out;
        printout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printout));
        instance = new InformationForDiscount();
        customerExesist = new CustomerDTO();
        currentSale= new CurrentSale();
    }

    @After
    public void tearDown() throws Exception {
        printout  = null;
        System.setOut(originalSysOut);
        instance = null;
        customerExesist = null;
        currentSale = null;
    }

    @Test
    public void discountForMember() {
        currentSale.getTotalPriceAfterDiscount();
        double discount = instance.getDiscount();
        String expOutput = "discount: "+((int)discount)+"%\n";
        String actualOutput = printout.toString();
        assertTrue(expOutput, actualOutput,"Wrong printout of discount.");
    }

    private void assertTrue(String expResult, String actualResult, String s) {
    }
}