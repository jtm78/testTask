package core;

import lombok.Getter;

/**
 * All types of drivers which can be created
 */
@Getter
public enum DriverType {
    CHROME("chrome"),
    FIREFOX("firefox");

    private String driverName;

    DriverType(String driverName) {
        this.driverName = driverName;
    }
}
