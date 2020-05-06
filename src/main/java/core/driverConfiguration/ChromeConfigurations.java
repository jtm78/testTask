package core.driverConfiguration;

import core.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeConfigurations implements IDriverConfiguration {

    public WebDriver getDriver() {
        WebDriver driver = new ChromeDriver(getOptions());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    private ChromeOptions getOptions() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
        options.addArguments("start-maximized");
        options.addArguments("--disable-infobars");
        return options;
    }
}
