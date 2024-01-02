package Basetest;

import java.time.Duration;

import Utilities.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.print.DocFlavor.URL;


public class BaseClass {
	
    public static WebDriver driver;
    public static void launchBrowser() throws Exception{
        String browser = ReadPropertyFile.getProperty1("browser");
        String url = ReadPropertyFile.getProperty1("url");
        if (browser.equalsIgnoreCase("chrome")){
            
            
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            driver=new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        driver.get(url);

    }
}