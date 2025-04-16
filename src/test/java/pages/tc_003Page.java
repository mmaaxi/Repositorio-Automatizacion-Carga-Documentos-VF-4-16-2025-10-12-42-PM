package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_003Page {
    WebDriver driver;

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "fileUpload")
    WebElement inputArchivo;

    @FindBy(id = "uploadButton")
    WebElement botonCargar;

    @FindBy(id = "errorMessage")
    WebElement mensajeError;

    public void seleccionarArchivoCorrupto() {
        inputArchivo.sendKeys("/path/to/corrupt/file.pdf");
    }

    public void clickBotonCargar() {
        botonCargar.click();
    }

    public boolean esMensajeErrorMostrado() {
        return mensajeError.isDisplayed() && mensajeError.getText().contains("archivo está dañado");
    }
}