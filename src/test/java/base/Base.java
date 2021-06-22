package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.OpportunityPage;
import pages.SalesforceLoginPage;

import java.util.concurrent.TimeUnit;

public class Base {
    public WebDriver driver;
//    public JavascriptExecutor js;
//    public OpportunityPage op;
    public void browserSetUp(){
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--disable-notifications");
        driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        System.out.println("base class browserSetUpa successful");
    }
}
