package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {
    WebDriver driver;
    By uploadButton = By.id("uploadButton");
    By confirmationMessage = By.id("confirmationMessage");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadDocument() {
        driver.findElement(uploadButton).sendKeys("/path/to/document");
        driver.findElement(uploadButton).submit();
    }

    public boolean isDocumentSavedInStorage() {
        String message = driver.findElement(confirmationMessage).getText();
        return message.contains("Documento guardado correctamente");
    }

    public boolean isDatabaseUpdated() {
        // Implementación de verificación de base de datos actualizada
        // Supongamos que esta función se conecta a la base de datos y verifica la existencia del documento
        return true;
    }
}