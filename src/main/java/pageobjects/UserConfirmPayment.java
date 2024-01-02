package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserConfirmPayment extends BaseClass {

    @FindBy(xpath = "//*[@name='Contact Number']")
    WebElement enter_phonenumber;
    @FindBy(xpath = "//*[@data-testid='confirm-payment-btn']")
    WebElement proceed;
    @FindBy(xpath = "//*[@data-testid='confirm-payment-btn']")
    WebElement Confirmpay10;
    public UserConfirmPayment()
    {

        PageFactory.initElements(driver,this);
    }

    public void paymentproceed()
    {
        proceed.click();
        Confirmpay10.click();
    }
}