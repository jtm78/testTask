package tests;

import core.DriverManager;
import logic.Navigation;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        DriverManager.getInstance().getDriver().get("http://google.com");
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        DriverManager.getInstance().destroy();
    }
}
