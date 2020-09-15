package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatepickerPage {
    WebDriver driver;

    //*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[7]/a
    @FindBy(id="datepicker")
    private WebElement datepickerWebElement;

    public WebElement getDatepickerWebElement(){
        return datepickerWebElement;
    }
    public void setDatepicker(String text){
        datepickerWebElement.sendKeys(text);
    }

    public DatepickerPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
