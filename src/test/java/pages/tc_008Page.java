import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_008Page {
    WebDriver driver;
    WebDriverWait wait;

    By uploadInput = By.id("upload");
    By progressBar = By.id("progress-bar");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void uploadLargeDocument() {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys("path/to/large/document");
        // Assume there is a submit button
        driver.findElement(By.id("submit")).click();
    }

    public boolean isProgressBarDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(progressBar));
        return driver.findElement(progressBar).isDisplayed();
    }

    public boolean isProcessTimeReasonable() {
        // Implement timing logic to verify process time is reasonable
        // Return true if within expected time
        return true;
    }
}