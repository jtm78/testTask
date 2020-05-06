package tests;

import logic.MainPageOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckWeightTest extends BaseTest {

    @Test
    public void checkOutWeightTest() {
        String actualWeight = new MainPageOperations("146566").getWeight();
        Assert.assertEquals(actualWeight, "0.460 T",
                "Weights does not equals");
    }
}
