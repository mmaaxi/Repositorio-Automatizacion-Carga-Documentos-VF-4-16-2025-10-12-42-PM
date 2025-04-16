package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_009Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page page;

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        page = new tc_009Page(driver);
        page.navigateToUploadPage();
    }

    @When("el usuario carga un documento")
    public void el_usuario_carga_un_documento() {
        page.uploadDocument();
    }

    @Then("el documento se guarda correctamente en el repositorio de almacenamiento")
    public void el_documento_se_guarda_correctamente_en_el_repositorio_de_almacenamiento() {
        Assert.assertTrue(page.isDocumentSavedInStorage());
    }

    @Then("se actualiza la base de datos con la información del documento")
    public void se_actualiza_la_base_de_datos_con_la_información_del_documento() {
        Assert.assertTrue(page.isDatabaseUpdated());
    }
}