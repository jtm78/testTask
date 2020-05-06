package tests;

import logic.MainPageOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckItemLineTotalTest extends BaseTest {

    @Test
    public void checkOutItemLineTotalAmount() {
        String actualItemLineTotalAmount = new MainPageOperations("146566")
                .getItemLineTotalAmount();
        Assert.assertEquals(actualItemLineTotalAmount, "£110.10",
                "Amounts does not equal");
    }
}
