package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_007Page;

public class tc_007Steps {
    WebDriver driver;
    tc_007Page page;

    @Given("que un usuario ha seleccionado un archivo para cargar")
    public void usuarioSeleccionaArchivoParaCargar() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        page = new tc_007Page(driver);
        page.navegarAlSitioDeCarga();
        page.seleccionarArchivoParaCargar("ruta/del/archivo");
    }

    @When("el usuario cancela la acción de carga")
    public void usuarioCancelaLaAccionDeCarga() {
        page.cancelarCarga();
    }

    @Then("el sistema debería cancelar la acción y no realizar la carga")
    public void sistemaCancelaAccionYNoCarga() {
        page.verificarCancelacionDeCarga();
        driver.quit();
    }
}