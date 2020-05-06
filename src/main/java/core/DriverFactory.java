package core;

import core.driverConfiguration.ChromeConfigurations;
import core.driverConfiguration.IDriverConfiguration;
import org.openqa.selenium.WebDriver;

/**
 * Class for Driver creation
 */
public class DriverFactory {

    private static ThreadLocal<DriverFactory> driver = new ThreadLocal<>();

    public static DriverFactory getInstance() {
        if (driver.get() == null)
            driver.set(new DriverFactory());
        return driver.get();
    }

    private DriverFactory() {
    }

    /**
     * Get driver according to WebDriverSettings
     *
     * @return instance of a driver
     */
    public WebDriver getDriver() {
        WebDriver driver;
        String driverName = WebDriverSettings.getInstance().getBrowser();
        IDriverConfiguration browserConfiguration = createDriverConfiguration(driverName);
        driver = browserConfiguration.getDriver();
        return driver;

    }

    /**
     * Create driver configuration according to driver name
     *
     * @param driverName name from config
     * @return instance of DriverConfiguration
     */
    private IDriverConfiguration createDriverConfiguration(String driverName) {
        driverName = driverName.toLowerCase();
        IDriverConfiguration driver = null;
        if (driverName.equals(DriverType.CHROME.getDriverName()))
            driver = new ChromeConfigurations();
        return driver;
    }

}
