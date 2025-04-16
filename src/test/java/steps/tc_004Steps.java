package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page fileUploadPage = new tc_004Page();

    @Given("El usuario está en la página de carga de archivos")
    public void usuario_en_pagina_de_carga() {
        fileUploadPage.navigateToFileUploadPage();
    }

    @When("El usuario intenta cargar un archivo que supera el tamaño máximo permitido")
    public void usuario_intenta_cargar_archivo_grande() {
        fileUploadPage.uploadLargeFile();
    }

    @Then("El sistema rechaza la carga del archivo")
    public void sistema_rechaza_carga_archivo() {
        Assert.assertTrue(fileUploadPage.isFileUploadRejected());
    }

    @Then("El sistema notifica al usuario sobre el límite de tamaño")
    public void sistema_notifica_limite_tamaño() {
        Assert.assertTrue(fileUploadPage.isSizeLimitNotificationDisplayed());
    }
}