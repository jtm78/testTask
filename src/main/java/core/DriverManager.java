package core;

import org.openqa.selenium.WebDriver;

/**
 * Class for Driver Operations
 */
public class DriverManager {

    private static ThreadLocal<DriverManager> driverManager = new ThreadLocal<>();

    public static DriverManager getInstance() {
        if (driverManager.get() == null)
            driverManager.set(new DriverManager());
        return driverManager.get();
    }

    private WebDriver driver;

    private DriverManager() {
    }

    /**
     * Get current driver. Create if it is not created yet
     *
     * @return current driver
     */
    public WebDriver getDriver() {
        if (driver == null)
            driver = DriverFactory.getInstance().getDriver();
        return driver;
    }

    /**
     * Close browser
     */
    public void destroy() {
        if (driver != null) {
            getDriver().quit();
            driver = null;
        }
    }
}
