package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.GenericMethods;

public class OpportunityPage {
    JavascriptExecutor js;
    GenericMethods gm=new GenericMethods();
    WebDriver driver;
    public OpportunityPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    private @FindBy(xpath = "//span[@class='slds-truncate'][text()='Opportunities']")
    WebElement opportunityLink;

    private @FindBy(xpath = "//div[@title='New']")
    WebElement newLink;
    private @FindBy(xpath = "(//*[text()='Close Date'])[2]//following::div/input[@name='CloseDate']")
    WebElement closeDate;
    private @FindBy(xpath = "((//*[text()='Opportunity Name'])[2]//following::div/input[contains(@id,'input-')])[1]")
    WebElement opportunityName;
    private @FindBy(xpath = "((//*[text()='Opportunity Name'])[2]//following::div/input[contains(@id,'input-')])[2]")
    WebElement stage;
    private @FindBy(xpath = "(((//*[text()='Opportunity Name'])[2]//following::div/input[contains(@id,'input-')])[2]//following::div/lightning-base-combobox-item)[2]")
    WebElement stageQualification;
    private @FindBy(xpath = "((//*[text()='Opportunity Name'])[2]//following::div/input[contains(@id,'input-')])[3]")
    WebElement accountName;
    private @FindBy(xpath = "(//*[text()='Account Name'])[2]//following::div/div/lightning-base-combobox/div/div/ul")
    WebElement getAccountNameLink;
    private @FindBy(xpath = "//button[text()='Save']")
    WebElement saveBtn;
//-------------------------------------------------------------------


    //.................................................................................
    private @FindBy(xpath = "//slot/force-record-layout-row[2]/slot/force-record-layout-item[2]/div/div/div[2]/span/slot/slot/lightning-formatted-text")
    WebElement defaultStage;

    public void clickOnOpportunity(){
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", opportunityLink);
    }

    public void clickOnNew(){
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", newLink);

    }
    public void setCloseDate(){
        closeDate.sendKeys("6/9/2021");
    }
    public void txtOpportunityName(){
        opportunityName.sendKeys(gm.randomString());
    }
    public void txtStage(){
        stage.click();
    }
    public void setStageQualification(){
        stageQualification.click();
    }
    public void txtAccountName(){
        accountName.sendKeys("DemoAcc001");
    }
    public void clickOnAccountFormDD(){
        getAccountNameLink.click();
    }
    public void clickOnSaveBtn(){
        saveBtn.click();
    }


    public void createNewOpportunity(){
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", opportunityLink);
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", newLink);
        closeDate.sendKeys("6/9/2021");
        opportunityName.sendKeys(gm.randomString());
        stage.click();
        stageQualification.click();
        accountName.sendKeys("DemoAcc001");
        getAccountNameLink.click();
        saveBtn.click();

    }
        //@@@@@@@
    // @@@@@@@@@@@@    Do not write Assertion in Page Class   @@@@@@@@@@@@@@@@@@@@
    public String verifyDefaultStage(){
        String dStage= defaultStage.getText();
//        Assert.assertEquals(stages, defaultStage.getText());
        System.out.println(defaultStage.getText());
        return dStage;
    }



}
