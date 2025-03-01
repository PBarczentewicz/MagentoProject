package drivermenager;

import org.openqa.selenium.WebDriver;

public abstract class DriverMenager {

    protected WebDriver driver;
    protected abstract void createDriver();

    public void quitDriver() {
        if (null != driver) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        if (null == driver) {
            createDriver();
        }
        return driver;
    }
}
