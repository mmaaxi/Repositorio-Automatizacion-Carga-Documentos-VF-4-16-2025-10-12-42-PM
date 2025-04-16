package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    WebDriver driver;

    By fileInput = By.id("file-upload");
    By uploadButton = By.id("upload-button");
    By securityWarning = By.id("security-warning");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadFile(String filename) {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys("/path/to/directory/" + filename);
        driver.findElement(uploadButton).click();
    }

    public boolean isSecurityValidated() {
        return driver.findElement(securityWarning).isDisplayed();
    }

    public boolean isMaliciousCodeExecuted() {
        // Placeholder logic to determine if any malicious code has executed
        return false;
    }
}