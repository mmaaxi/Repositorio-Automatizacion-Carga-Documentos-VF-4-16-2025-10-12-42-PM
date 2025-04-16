import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_006Page;
import static org.junit.Assert.*;

public class tc_006Steps {
    WebDriver driver;
    tc_006Page uploadPage;

    @Given("El usuario está en la página de carga de archivo")
    public void el_usuario_está_en_la_página_de_carga_de_archivo() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("url/to/uploadpage");
        uploadPage = new tc_006Page(driver);
    }

    @When("El usuario intenta cargar sin seleccionar un archivo")
    public void el_usuario_intenta_cargar_sin_seleccionar_un_archivo() {
        uploadPage.clickUploadButton();
    }

    @Then("El sistema muestra un mensaje solicitando seleccionar un archivo")
    public void el_sistema_muestra_un_mensaje_solicitando_seleccionar_un_archivo() {
        String expectedMessage = "Por favor, seleccione un archivo.";
        assertEquals(expectedMessage, uploadPage.getErrorMessage());
        driver.quit();
    }
}