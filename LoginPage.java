package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Locators
    By emailField = By.id("id_login");
    By passwordField = By.id("id_password");
    By signInButton = By.xpath("//button[text()='Sign In']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }

    public void loginToLeetCode(String email, String password) {
        setEmail(email);
        setPassword(password);
        clickSignIn();
    }
}
