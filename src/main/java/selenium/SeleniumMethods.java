package selenium;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumMethods {
    /**
     * Find element with using regex
     * @param basePath base Locator
     * @param additionalPath additional Locator
     * @param value value for base locator
     * @return Web Element
     */
    public static WebElement findElement(String basePath, String additionalPath, Object... value) {
        By baseLocator = By.xpath(String.format(basePath, value));
        return DriverManager.getInstance()
                .getDriver().findElement(baseLocator)
                .findElement(By.xpath(additionalPath));
    }
}
