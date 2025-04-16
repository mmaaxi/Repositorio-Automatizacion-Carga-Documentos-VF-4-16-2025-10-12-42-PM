package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page documentUploadPage = PageFactory.initElements(driver, tc_002Page.class);

    @Given("The user is on the document upload page")
    public void userOnDocumentUploadPage() {
        documentUploadPage.navigateToUploadPage();
        Assert.assertTrue(documentUploadPage.isUploadPageDisplayed());
    }

    @When("The user selects a file with an unsupported format")
    public void userSelectsUnsupportedFile() {
        documentUploadPage.selectUnsupportedFile("path/to/unsupported/file.exe");
    }

    @Then("The system rejects the file and displays an error message")
    public void systemRejectsFileAndDisplaysErrorMessage() {
        Assert.assertTrue(documentUploadPage.isErrorMessageDisplayed());
    }
}