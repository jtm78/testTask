package tests;

import core.DriverManager;
import logic.Navigation;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void openBrowser() {
        Navigation.toMainPage();
    }

    @AfterMethod
    public void closeBrowser(){
        DriverManager.getInstance().destroy();
    }
}
