package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCourseEnroll extends BaseClass {

    @FindBy(xpath = "//*[@data-testid='buy-now']")
    WebElement buy;

    @FindBy(xpath = "//*[@data-testid='checkout-btn']")
    WebElement checkout;

    public UserCourseEnroll()
    {
        PageFactory.initElements(driver,this);
    }
    public void buycourse()
    {
    buy.click();
    checkout.click();
    }
}