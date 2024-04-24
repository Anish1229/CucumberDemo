package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Enter username
    public void enterUsername(String username) {
        driver.findElement(By.id("username")).sendKeys(username);
    }

    // Enter password
    public void enterPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    // Click on login button
    public void clickLoginButton() {
        driver.findElement(By.id("submit")).click();
    }

    // Get success message
    public String getSuccessMessage() {
        return driver.findElement(By.xpath("//h1[@class='post-title']")).getText();
    }
    public By getSucessMessageLocator() {
         return By.xpath("//h1[@class='post-title']");
}
}

