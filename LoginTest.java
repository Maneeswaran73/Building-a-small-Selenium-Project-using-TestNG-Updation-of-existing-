package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://leetcode.com/accounts/login/");
    }

    @Test
    public void verifyLogin() {
        loginPage = new LoginPage(driver);
        loginPage.loginToLeetCode("your_email@example.com", "your_password");
        System.out.println("Login test executed successfully");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
