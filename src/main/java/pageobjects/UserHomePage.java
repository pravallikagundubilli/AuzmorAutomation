package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage extends BaseClass {
    @FindBy(xpath = "//*[@data-testid='trainings-menu']")
    WebElement training;

    public UserHomePage()
    {
        PageFactory.initElements(driver,this);
    }
    public void trainPage()
    {

        training.click();
    }

}
