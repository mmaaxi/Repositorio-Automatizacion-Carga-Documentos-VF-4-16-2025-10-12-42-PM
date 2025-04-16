import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {
    WebDriver driver;

    // Locators
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}