package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page page;

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        driver = new ChromeDriver();
        page = new tc_001Page(driver);
        driver.get("http://example.com/upload");
        Assert.assertTrue(page.isPageLoaded());
    }

    @When("el usuario selecciona un archivo PDF válido desde el sistema")
    public void el_usuario_selecciona_un_archivo_pdf_válido_desde_el_sistema() {
        page.selectPdfFile("C:\\path\\to\\valid\\document.pdf");
        Assert.assertTrue(page.isFileSelected());
    }

    @When("hace clic en el botón 'Cargar'")
    public void hace_clic_en_el_boton_cargar() {
        page.clickUploadButton();
    }

    @Then("el documento se carga exitosamente y se muestra mensaje de confirmación")
    public void el_documento_se_carga_exitosamente_y_se_muestra_mensaje_de_confirmación() {
        Assert.assertTrue(page.isUploadSuccessful());
        driver.quit();
    }
}