//package steps;
//
//import base.Base;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import pages.OpportunityPage;
//import pages.SalesforceLoginPage;
//
//import java.util.concurrent.TimeUnit;
//
//public class OpportunitySteps extends Base {
//
////    public WebDriver driver;
//    public OpportunityPage op;
//
//    @Before
//    public void setUp() throws InterruptedException {
////        System.out.println(" I am in browserSetUp method @Before");
////        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
////        ChromeOptions option=new ChromeOptions();
////        option.addArguments("--disable-notifications");
////        driver=new ChromeDriver(option);
////        driver.manage().window().maximize();
////        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
////        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
////        driver.get("https://d5g000005ho0veaw.lightning.force.com/lightning/page/home");
////        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kswankhede95-emje@force.com");
////        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Salesforce@19");
////        driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
////        driver.findElement(By.xpath("//input[@id='Login']")).click();
//        browserSetUp();
//        SalesforceLoginPage sf=new SalesforceLoginPage(driver);
//        sf.saleforceLoginPage();
//    }
//
//    @After
//    public void tearDown(){
//        System.out.println("I am in tear down page");
//        driver.close();
//        driver.quit();
//    }
//
//
////    @Given("user login to salesforce")
////    public void user_login_to_salesforce() {
////        System.out.println("In login to salesforce step");
////    }
////
////    @When("user click on Opportunity tab")
////    public void user_click_on_opportunity_tab() throws InterruptedException {
////        op=new OpportunityPage(driver);
//////        op.clickOnOpportunity();
//////        op.clickOnNew();
//////        op.setCloseDate();
//////        op.txtOpportunityName();
//////        op.txtStage();
//////        op.setStageQualification();
//////        op.txtAccountName();
//////        op.clickOnAccountFormDD();
//////        op.clickOnSaveBtn();
////        op.createNewOpportunity();
////        System.out.println("New Opportunity successfully created");
////        Thread.sleep(10000);
////
////
////    }
////    @And("click on New Tab")
////    public void click_on_new_tab() {
////
////    }
////    @Then("user navigate to Opportunity creation page")
////    public void user_navigate_to_opportunity_creation_page() {
////
////    }
//
//
//
//}
