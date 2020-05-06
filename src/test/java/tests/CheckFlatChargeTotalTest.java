package tests;

import logic.MainPageOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckFlatChargeTotalTest extends BaseTest {

    @Test
    public void checkOutFlatChargeTotalAmount() {
        String actualFlatAmount = new MainPageOperations("146566").getFlatChargeTotalAmount();
        Assert.assertEquals(actualFlatAmount, "£100.00", "Amounts does not equals");
    }
}
