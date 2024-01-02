package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainingPage extends BaseClass {

    @FindBy(xpath = "//*[@data-testid='price-tag']")
    WebElement clickcourse;
    public TrainingPage()
    {
        PageFactory.initElements(driver,this);
    }
    public void selectCourse()
    {
    clickcourse.click();
    }
}