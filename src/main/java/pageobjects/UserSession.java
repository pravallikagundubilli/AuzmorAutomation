package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSession extends BaseClass {


    @FindBy(xpath = "//*[@id='line1']")
    WebElement address;

    @FindBy(xpath = "//*[@id='postal_code']")
    WebElement addzipcode;
    @FindBy(xpath = "//*[@placeholder='Add country']")
    WebElement addcountry;
    @FindBy(xpath = "//*[@id='city']")
    WebElement addcity;
    @FindBy(xpath = "//*[@id='state']")
    WebElement addstate;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[3]/div/div/div/div/form/fieldset[2]/div/div/div/iframe")
    WebElement i_Frame;
    @FindBy(xpath = "//*[@id='root']/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")
    WebElement enter_cardnumber;
    @FindBy(xpath = "//*[@id='root']/form/div/div[2]/span[2]/span[1]/span/span/input")
    WebElement enter_mmyy;

    @FindBy(xpath = "//*[@id='root']/form/div/div[2]/span[2]/span[2]/span/span/input")
    WebElement enter_cvc;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[3]/div/div/div/div/form/button")
    WebElement click_pay;

    public UserSession()
    {
        PageFactory.initElements(driver,this);
    }
    public void checkelements()
    {
        address.clear();
      address.sendKeys("20A St.Lawrence Toronto");
        addzipcode.clear();
        addzipcode.sendKeys("5334");
        addcountry.clear();
        addcountry.sendKeys("India");
        addcity.clear();
        addcity.sendKeys("Hyderabad");
        addstate.clear();
        addstate.sendKeys("Andhra");
        driver.switchTo().frame(i_Frame);
        enter_cardnumber.sendKeys("4242 4242 4242 4242");
        enter_mmyy.sendKeys("02/24");
        enter_cvc.sendKeys("123");
        driver.switchTo().defaultContent();
        click_pay.click();


    }
}