package base;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import page.CommonPage;
import page.HomePage;

import java.sql.DriverManager;
import java.time.Duration;



public class BaseTest {

    protected WebDriver driver;
    DriverManager driverManager;
    protected CommonPage commonPage;
    protected HomePage homePage;

    @BeforeEach
    protected void setUp() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://automationintesting.online/#/admin");
        navigateToCommonPage();
    }


    @AfterEach
    public void tearDown() {
        driverManager.quitDriver();
    }

    protected CommonPage navigateToCommonPage() {
        commonPage = PageFactory.initElements(driver, CommonPage.class);
        return commonPage;
    }

    protected HomePage navigateToHomePage() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        return homePage;
    }

    protected HomePagePrzemek navigateToHomePagePrzemek() {
        homePagePrzemek = PageFactory.initElements(driver, HomePagePrzemek.class);
        return homePagePrzemek;
    }


}
