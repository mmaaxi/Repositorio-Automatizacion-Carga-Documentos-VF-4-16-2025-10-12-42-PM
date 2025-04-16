package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {
    WebDriver driver;
    By seleccionarArchivoBtn = By.id("seleccionarArchivo");
    By cancelarBtn = By.id("cancelarCarga");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAlSitioDeCarga() {
        driver.get("https://www.example.com/carga");
    }

    public void seleccionarArchivoParaCargar(String filePath) {
        driver.findElement(seleccionarArchivoBtn).sendKeys(filePath);
    }

    public void cancelarCarga() {
        driver.findElement(cancelarBtn).click();
    }

    public void verificarCancelacionDeCarga() {
        // Add assertions here to verify that the file was not uploaded
    }
}