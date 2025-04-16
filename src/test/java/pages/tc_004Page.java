package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.WebDriverManager;

public class tc_004Page {

    WebDriver driver = WebDriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    By fileInput = By.id("file-upload");
    By uploadButton = By.id("upload-button");
    By errorMessage = By.id("error-message");

    public void navigateToFileUploadPage() {
        driver.get("http://example.com/file-upload");
    }

    public void uploadLargeFile() {
        WebElement uploadElement = wait.until(ExpectedConditions.visibilityOfElementLocated(fileInput));
        uploadElement.sendKeys("/path/to/large/file");
        driver.findElement(uploadButton).click();
    }

    public boolean isFileUploadRejected() {
        return wait.until(ExpectedConditions.textToBePresentInElementLocated(errorMessage, "El archivo excede el tamaño máximo permitido"));
    }

    public boolean isSizeLimitNotificationDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}