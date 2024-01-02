package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

import static Basetest.BaseClass.driver;

public class Invitation  {
    @FindBy(xpath="//input[@placeholder='Full Name']")
    WebElement txt_name;
    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    WebElement txt_mail;
    @FindBy(xpath = "//input[@placeholder='Search here...']")
    List<WebElement>  dd_rolemanager;
    @FindBy(xpath = "//*[@data-testid='icon']")
    WebElement click_downarrow;
    @FindBy(xpath = "//button[@data-testid='normal-btn']")
    WebElement add_person;
    @FindBy(xpath ="//*[@data-testid='invite-people-send-btn']")
    WebElement invite;
    public Invitation()
    {
        PageFactory.initElements(driver,this );
    }
    public  void Filldetails()
    {
        txt_name.sendKeys("Gundubilli Pravallika");
        txt_mail.sendKeys("gundubillipravallika@gmail.com");
        add_person.click();
        invite.click();



    }
}