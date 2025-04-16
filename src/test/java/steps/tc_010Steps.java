package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_010Page;

public class tc_010Steps {

    WebDriver driver;
    tc_010Page uploadPage;

    public tc_010Steps() {
        this.driver = Hooks.driver;
        uploadPage = new tc_010Page(driver);
    }

    @Given("I navigate to the upload page")
    public void i_navigate_to_the_upload_page() {
        uploadPage.openUploadPage();
    }

    @When("I upload a document with {string} as the filename")
    public void i_upload_a_document_with_evil_script_txt_as_the_filename(String filename) {
        uploadPage.uploadFile(filename);
    }

    @Then("The system should validate the security")
    public void the_system_should_validate_the_security() {
        Assert.assertTrue(uploadPage.isSecurityValidated());
    }

    @Then("It should not allow execution of any potentially harmful code")
    public void it_should_not_allow_execution_of_any_potentially_harmful_code() {
        Assert.assertFalse(uploadPage.isMaliciousCodeExecuted());
    }
}