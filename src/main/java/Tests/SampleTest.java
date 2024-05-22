package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // Scenario 1
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");


    }
}
