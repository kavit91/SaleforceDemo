package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalesforceLoginPage {
    public WebDriver driver;
    public SalesforceLoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void saleforceLoginPage(){
        System.out.println("Enter in saleforce Login page");
        driver.get("https://login.salesforce.com/?locale=in");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kswankhede95-emje@force.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Salesforce@19");
        driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        System.out.println("SalesforcesLoginPage sucessful");
    }
}
