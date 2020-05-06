package tests;

import logic.MainPageOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckGradeNameTest extends BaseTest {

    @Test
    public void checkOutGradeName() {
        String actualGradeName = new MainPageOperations("146566").getGradeName();
        Assert.assertEquals(actualGradeName, "Mixed Municipal Waste",
                "Grades does not equals");
    }
}
