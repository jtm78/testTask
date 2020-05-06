package tests;

import logic.MainPageOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckPerToneTotalTest extends BaseTest {

    @Test
    public void checkOutPerToneTotalAmount() {
        String actualPerToneTotalAmount = new MainPageOperations("146566")
                .getPerToneTotalAmount();
        Assert.assertEquals(actualPerToneTotalAmount, "£4.60",
                "Amounts does not equals");

    }
}
