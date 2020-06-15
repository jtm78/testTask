package core.utils;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Constants {
    public static final Path BASE_PATH = Paths.get(System.getProperty("user.dir"));
    public static final String USER_HOME = System.getProperty("user.home");
    public static final String RESOUCES = BASE_PATH.toString() + "/src/main/resources/";
    public static final String CHROMEDRIVER_PATH = BASE_PATH.toString() + "/src/main/resources/drivers/chromedriver.exe";
}
