package tests;

import logic.MainPageOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckCompanyNameTest extends BaseTest {

    @Test
    public void checkOutCompanyName() {
        String actualCompanyName = new MainPageOperations("146566").getCompanyName();
        Assert.assertEquals(actualCompanyName, "TEST CUSTOMER",
                "Company names does not the same");

    }
}
