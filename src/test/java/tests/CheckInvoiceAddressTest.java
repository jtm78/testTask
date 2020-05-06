package tests;

import logic.MainPageOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckInvoiceAddressTest extends BaseTest {

    @Test
    public void checkOutInvoiceAddress() {
        String invoiceAddress = new MainPageOperations("146566").getInvoiceAddress();
        Assert.assertEquals(invoiceAddress, "TEST ADDRESS, TEST TOWN, 111111",
                "Addresses does not equals");
    }
}
