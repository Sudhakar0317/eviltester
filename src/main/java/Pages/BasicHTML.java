package Pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasicHTML {
    WebDriver driver;

    public BasicHTML(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type= 'text'and @name='username']")
    WebElement username;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(name = "comments")
    WebElement comment;
    @FindBy(xpath = "//input[@type='file' and @name ='filename']")
    WebElement filename;
    @FindBy(xpath = "//h1[text()='Basic HTML Form Example']")
    static
    WebElement String;
    @FindBy(xpath = "//input[@type='checkbox' and @value='cb1']")
    WebElement chkbx1;
    @FindBy(xpath = "//input[@type='checkbox' and @value='cb3']")
    WebElement chkbx3;
    @FindBy(xpath = "//input[@type='radio' and @value='rd1']")
    WebElement rd1;
    @FindBy(xpath = "//input[@type='radio' and @value='rd2']")
    WebElement rd2;
    @FindBy(xpath = "//Select[@name='dropdown']")
    WebElement dropdown2;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement submit;
    @FindBy(xpath = "//div/p[contains(text(),'You submitted a form')]")
    WebElement FormSubmit;
    @FindBy(xpath = "//input[@id='colour-picker']")
    WebElement color;

    @FindBy(xpath = "//input[@id='date-picker']")
    WebElement datepicker;
    @FindBy(xpath = "//input[@id='date-time-picker']")
    WebElement timepicker;
    @FindBy(xpath = "//input[@id='email-field']")
    WebElement email;
    @FindBy(xpath = "//input[@id='month-field']")
    WebElement monthyear;
    @FindBy(xpath = "//input[@id='number-field']")
    WebElement number;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement Submit2;

    public void Fromfilling() {
        username.sendKeys("test");
        password.sendKeys("test");
        comment.clear();
        comment.sendKeys("test");
        Boolean value = filename.isEnabled();
        System.out.println(value);
        try {
            filename.sendKeys("C:/Users/user/Desktop/SQE Test/test.txt");
        } catch (InvalidArgumentException e) {
            System.out.println(" exception caught");
        }

        // scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        // checkboxes
        if (chkbx3.isEnabled()) {
            chkbx3.click();
        } else {
            chkbx3.click();
        }
        if (chkbx1.isEnabled()) {
            chkbx1.click();
        } else {
            chkbx1.click();
        }
        // radiobutton
        if (rd1.isEnabled()) {
            rd1.click();
        } else {
            rd1.click();
        }
        if (rd2.isEnabled()) {
            rd2.click();
        } else {
            rd2.click();
        }
        // dropdown 1
        Select dropdown = new Select(driver.findElement(By.xpath("//Select[@name='multipleselect[]']")));
        dropdown.selectByValue("ms1");
        //dropdown2
        Select drop2 = new Select(dropdown2);
        drop2.selectByValue("dd1");
        // submit
        submit.submit();


    }

    public void Pagevalidation() {
        System.out.println("the Page title" + String.getText());
    }
       public void SubmitFromValidation(){
           String expected = "You submitted a form. The details below show the values you entered for processing.";
           String actual = FormSubmit.getText();
           Assert.assertEquals(expected,actual);
           System.out.println(actual);
           //driver.close();

       }
    //  convert rgb to hex
    public static String RgbtoHex(int r, int g, int b) {
        return java.lang.String.format("#%02x%02x%02x", r, g, b);
    }

    //  RGB Values
    int r = 228;
    int g = 7;
    int b = 7;
    // convert rgb to hex
    String Hexcolor = RgbtoHex(r, g, b);

    public void SecondFormFilling() {
        color.click();
        color.sendKeys(Hexcolor);
        // date picker
        datepicker.click();
//        datepicker.clear();
        datepicker.sendKeys("11");
        datepicker.sendKeys(Keys.TAB);
        datepicker.sendKeys("22");
        datepicker.sendKeys(Keys.TAB);
        datepicker.sendKeys("3333");
        // local time picker
        timepicker.click();timepicker.sendKeys("11");
        timepicker.sendKeys(Keys.TAB);timepicker.sendKeys("22");
        timepicker.sendKeys(Keys.TAB);timepicker.sendKeys("3333");
        timepicker.sendKeys(Keys.TAB);timepicker.sendKeys("01");
        timepicker.sendKeys(Keys.TAB);timepicker.sendKeys("02");
        timepicker.sendKeys(Keys.TAB);timepicker.sendKeys("PM");

        //email
        email.clear();
        email.sendKeys("Test@gmail.com");

        //month year
        monthyear.click();
        monthyear.sendKeys("m");monthyear.sendKeys(Keys.TAB);
        monthyear.sendKeys("2024");

        // number input
        number.clear();
        number.sendKeys("9999");

        // submit the form
        Submit2.submit();






    }


}
