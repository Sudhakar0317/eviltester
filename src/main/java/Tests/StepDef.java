package Tests;

import Pages.BasicHTML;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef {
    public static  WebDriver driver = new ChromeDriver() ;


//    @Before
//            public void BeforeScenario(){
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//    @After
//            public void AfterScenario(){
//        driver.manage().window().minimize();
//        driver.close();
//    }

    BasicHTML basicHTML = new BasicHTML(driver);
    //HTML5page html5page = new HTML5page(driver);


    @Given("user login the  test url")
    public void user_login_the_test_url() {
        //driver = new ChromeDriver();
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
    public void user_validate_the_successful_submit_message() throws InterruptedException {
        basicHTML.SubmitFromValidation();
    }

    @Given("User navigate to HTML Form")
    public void user_navigate_to_html_form() {
        driver.get("https://testpages.eviltester.com/styled/html5-form-test.html");
        driver.manage().window().maximize();

            }
    @Then("User fill the html form")
    public void user_fill_the_html_form() {
        basicHTML.SecondFormFilling();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }





}
