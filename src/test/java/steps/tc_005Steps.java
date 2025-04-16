package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_005Page;
import static org.junit.Assert.assertTrue;

public class tc_005Steps {
    WebDriver driver;
    WebDriverWait wait;
    tc_005Page uploadPage;

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        driver = // initialize your WebDriver
        wait = new WebDriverWait(driver, 10);
        uploadPage = new tc_005Page(driver);
        driver.get("http://www.example.com/upload");
    }

    @When("el usuario carga el documento {string}")
    public void el_usuario_carga_el_documento(String documentName) {
        uploadPage.uploadDocument(documentName);
    }

    @Then("el sistema notifica al usuario que la carga fue exitosa")
    public void el_sistema_notifica_al_usuario_que_la_carga_fue_exitosa() {
        assertTrue(uploadPage.isUploadSuccessful());
    }
}