package drivermenager;

import java.sql.DriverManager;


import static drivermenager.DriverType.DriverType.CHROME;
import static drivermenager.DriverType.DriverType.FIREFOX;

public class DriverMenagerFactory {

    public static DriverManager getManager(DriverType type)  {

        DriverManager driverManager;

        switch (type) {
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;

    }
}
