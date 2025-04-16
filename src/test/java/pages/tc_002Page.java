package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    private By uploadButton = By.id("upload");
    private By errorMessage = By.id("error_message");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public boolean isUploadPageDisplayed() {
        return driver.findElement(uploadButton).isDisplayed();
    }

    public void selectUnsupportedFile(String filePath) {
        driver.findElement(uploadButton).sendKeys(filePath);
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}