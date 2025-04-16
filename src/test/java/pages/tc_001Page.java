package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    WebDriver driver;

    // Locators
    By uploadPageIdentifier = By.id("upload-page");
    By fileInput = By.id("file-input");
    By uploadButton = By.id("upload-button");
    By successMessage = By.id("success-message");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoaded() {
        return driver.findElement(uploadPageIdentifier).isDisplayed();
    }

    public void selectPdfFile(String filePath) {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys(filePath);
    }

    public boolean isFileSelected() {
        return driver.findElement(fileInput).getAttribute("value").contains(".pdf");
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadSuccessful() {
        return driver.findElement(successMessage).isDisplayed();
    }
}