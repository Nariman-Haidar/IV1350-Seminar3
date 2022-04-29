package Se.kth.iv1350.Project1PointOfSale.startup;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {
    private Main instanceTest;
    private ByteArrayOutputStream printout;
    private PrintStream originalSysOut;


    @Before
    public void setUp() {
        instanceTest = new Main();
        originalSysOut = System.out;
        printout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printout));
    }

    @After
    public void tearDown() throws Exception {
        printout = null;
        instanceTest = null;
        System.setOut(originalSysOut);
    }

    @Test
    public void main() {
        String [] args = null;
        instanceTest.main(args);
        String expOutput = "Start New Sale.";
        String mainResult = printout.toString();
        assertTrue(mainResult.contains(expOutput),"UI did not start correctly.");
    }
    private void assertTrue(boolean contains, String acual) {
    }
}