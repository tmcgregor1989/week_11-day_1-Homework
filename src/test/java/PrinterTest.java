import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){ printer = new Printer(100, 10);}

    @Test
    public void hasPaper(){
        assertEquals(100, printer.countPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(10, printer.checkToner());
    }

    @Test
    public void canPrint(){
        assertEquals("Printed up nicely", printer.print(9, 10));
        assertEquals(10, printer.countPaper());
        assertEquals(9, printer.checkToner());
    }

    @Test
    public void cannotPrint(){
        assertEquals("Insufficient paper", printer.print(90, 10));
        assertEquals(100, printer.countPaper());
        assertEquals(10, printer.checkToner());
    }
}
