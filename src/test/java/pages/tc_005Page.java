package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {
    WebDriver driver;

    By uploadInputField = By.id("uploadInput");
    By uploadButton = By.id("uploadButton");
    By successMessage = By.id("successMessage");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadDocument(String documentName) {
        WebElement uploadInput = driver.findElement(uploadInputField);
        uploadInput.sendKeys(documentName);
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.click();
    }

    public boolean isUploadSuccessful() {
        WebElement message = driver.findElement(successMessage);
        return message.isDisplayed() && message.getText().contains("subida exitosa");
    }
}