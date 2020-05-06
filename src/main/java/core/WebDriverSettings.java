package core;

import lombok.Getter;
import core.utils.PropertiesLoader;

import java.util.Properties;

/**
 * Class for config loading with properties for driver
 */
@Getter
public class WebDriverSettings {
    private static final String BROWSER_TYPE = "browser";

    private static ThreadLocal<WebDriverSettings> settings = new ThreadLocal<>();

    public static WebDriverSettings getInstance() {
        if (settings.get() == null)
            settings.set(new WebDriverSettings());
        return settings.get();
    }

    private String browser;

    /**
     * Initialize variables
     */
    private WebDriverSettings() {
        Properties properties = new PropertiesLoader().getProperties("config.properties");
        browser = properties.getProperty(BROWSER_TYPE);
    }
}
