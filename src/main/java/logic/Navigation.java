package logic;

import core.DriverManager;
import core.utils.Constants;

/**
 * Class for basic navigation to the modules
 */
public class Navigation {

    public static void toMainPage() {
        toRelative("/Company%20invoices%20-%20Waste%20Logics.mhtml");
    }

    private static void toRelative(String path) {
        String baseUrl = getCommonUrl();
        if (!path.startsWith("/"))
            path = "/" + path;
        DriverManager.getInstance().getDriver().get(baseUrl + path);
    }

    private static String getCommonUrl() {
        return "file://" + Constants.USER_HOME;
    }
}
