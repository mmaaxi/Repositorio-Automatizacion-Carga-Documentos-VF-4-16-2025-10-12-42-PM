import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_008Page;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page page;
    WebDriverWait wait;

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        driver.get("http://example.com/document-upload");
        page = new tc_008Page(driver);
    }

    @When("el usuario carga un documento grande dentro del límite permitido")
    public void el_usuario_carga_un_documento_grande_dentro_del_limite_permitido() {
        page.uploadLargeDocument();
    }

    @Then("el sistema procesa la carga en un tiempo razonable")
    public void el_sistema_procesa_la_carga_en_un_tiempo_razonable() {
        assert page.isProcessTimeReasonable();
    }

    @Then("el sistema muestra una barra de progreso")
    public void el_sistema_muestra_una_barra_de_progreso() {
        assert page.isProgressBarDisplayed();
    }
}