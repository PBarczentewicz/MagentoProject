package drivermenager;

import java.sql.DriverManager;

public class ChromeDriverMenager extends DriverManager {
    @Override
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver", "src/webdriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
    }



}
