package Tests;

import Pages.BasicHTML;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicHTMLForm {
    WebDriver driver;

    BasicHTML basicHTML = new BasicHTML(driver);


    @Given("user login the  test url")
    public void user_login_the_test_url() {
        driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        driver.manage().window().maximize();
    }

    @Then("validate the page text")
    public void validate_the_page_text() {
        basicHTML.Pagevalidation();

           }

    @When("user enters the HTML form")
    public void user_enters_the_HTML_form() {
        basicHTML.Fromfilling();

    }

    @And("user validate the successful submit message")
    public void user_validate_the_successful_submit_message() {
        System.out.println("code working successfully");

    }
}
