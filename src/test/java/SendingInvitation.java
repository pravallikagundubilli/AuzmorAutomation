import Basetest.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.Company;
import pageobjects.Homepage;
import pageobjects.Invitation;
import pageobjects.login;

public class SendingInvitation extends BaseClass {

    @BeforeMethod
    public void sign() throws Exception {
        launchBrowser();
        login obj=new login();
        obj.signIn();
        Homepage hp=new Homepage();
        hp.CompanyHover();
        Company cp=new Company();
        cp.click_add();
        Invitation invite=new Invitation();
        invite.Filldetails();
    }
    @Test
    public void SendInvitationMail()
    {

        System.out.println(driver.getCurrentUrl());
    }


}