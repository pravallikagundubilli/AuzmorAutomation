import Basetest.BaseClass;
import pageobjects.Userlogin;
import pageobjects.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Paymentprocess extends BaseClass {

    @BeforeMethod
    public void sign() throws Exception {

        launchBrowser();
        //User Login Page
        Userlogin ul=new Userlogin();
        ul.signinpage();
        //UserHomePage
        UserHomePage uhp=new UserHomePage();
        uhp.trainPage();
        //UserTrainingPage
        TrainingPage tp=new TrainingPage();
        tp.selectCourse();
        UserCourseEnroll enrol=new UserCourseEnroll();
        enrol.buycourse();
        //Proceed in cart
        UserConfirmPayment pay=new UserConfirmPayment();
        pay.paymentproceed();
        //SessiomPaymment
        UserSession us=new UserSession();
        us.checkelements();



    }
    @Test
    public void SendInvitationMail()
    {

        System.out.println(driver.getCurrentUrl());
    }


}