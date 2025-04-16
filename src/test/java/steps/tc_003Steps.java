package steps;

import pages.tc_003Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("el usuario ha seleccionado un archivo PDF corrupto")
    public void elUsuarioHaSeleccionadoUnArchivoPDFCorrupto() {
        page.seleccionarArchivoCorrupto();
    }

    @When("el usuario hace clic en el botón \"Cargar\"")
    public void elUsuarioHaceClicEnElBotonCargar() {
        page.clickBotonCargar();
    }

    @Then("el sistema muestra un mensaje de error indicando que el archivo está dañado")
    public void elSistemaMuestraUnMensajeDeError() {
        assertTrue(page.esMensajeErrorMostrado());
    }
}