package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicHTML {
   // WebDriver driver;

    public BasicHTML(WebDriver driver) {
       // this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement username;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(name = "comments")
    WebElement comment;
    @FindBy(name = "filename")
    WebElement filename;
    @FindBy(xpath = "//h1[text()='Basic HTML Form Example']")
    WebElement String;


    public void Fromfilling() {
        username.sendKeys("test");
        password.sendKeys("test");
        comment.sendKeys("test");
        filename.click();

    }

    public  void Pagevalidation(){
      //System.out.println(String.getText());

        System.out.println("test");



    }


}
