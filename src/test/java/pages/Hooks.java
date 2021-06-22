//package pages;
//
//import base.Base;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//public class Hooks extends Base {
//
//    @Before
//    public void setUp() throws InterruptedException {
//        browserSetUp();
//        SalesforceLoginPage sf=new SalesforceLoginPage(driver);
//        sf.saleforceLoginPage();
//    }
//
//    @After
//    public void tearDown(){
//        driver.close();
//        driver.quit();
//    }
//}
