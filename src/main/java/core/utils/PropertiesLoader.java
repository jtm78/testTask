package core.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * It's a helper for properties manipulations
 */
public class PropertiesLoader {

    /**
     * Load properties from config
     *
     * @param configName
     * @return loaded properties
     */
    public Properties getProperties(String configName) {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(Constants.RESOUCES + configName)) {
            properties.load(input);
            return properties;
        } catch (IOException e) {
            throw new RuntimeException("Unable to find " + e);
        }
    }
}
