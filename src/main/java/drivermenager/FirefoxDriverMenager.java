package drivermenager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverMenager extends DriverMenager {

    @Override
    public void createDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("test-type");
        driver = new FirefoxDriver();
    }
}
