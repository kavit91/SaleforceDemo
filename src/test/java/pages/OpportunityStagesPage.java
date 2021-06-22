package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpportunityStagesPage {
    JavascriptExecutor js;
    WebDriver driver;
    public OpportunityStagesPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    private @FindBy(xpath = "(//*[text()='nik002'])[1]")
    WebElement accountLinkInOpp;

    private @FindBy(xpath = "(//a[@class='tabHeader slds-path__link'])[1]")
    WebElement qualification;
    private @FindBy(xpath = "(//a[@class='tabHeader slds-path__link'])[2]")
    WebElement meeting;
    private @FindBy(xpath = "(//a[@class='tabHeader slds-path__link'])[3]")
    WebElement proposal;
    private @FindBy(xpath = "(//a[@class='tabHeader slds-path__link'])[4]")
    WebElement negociation;

    private @FindBy(xpath = "(//a[@class='tabHeader slds-path__link'])[5]")
    WebElement closed;
    private @FindBy(xpath = "//*[text()='Select Closed Stage']")
    WebElement selectClosedStage;
    private @FindBy(xpath = "(//*[text()='Stage'])[2]//following::select")
    WebElement dropDownClosed;
    //(//*[text()='Save'])[2]
    private @FindBy(xpath = "(//*[text()='Save'])[2]")
    WebElement saveBtn;


    private @FindBy(xpath = "//*[text()='Mark Stage as Complete']")
    WebElement markStagAsComplete;
    private @FindBy(xpath = "//*[text()='Mark as Current Stage']")
    WebElement markAsCurrentStage;

    public void getAccountLinkInOpp(){
        accountLinkInOpp.click();
    }

    public void clickoOnQualification(){
        qualification.click();
    }
    public void clickOnMeeting(){
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", meeting);
//        meeting.click();
    }
    public void clickOnProposal(){
//        proposal.click();
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", proposal);
    }
    public void clickOnNegociation(){
//        negociation.click();
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", negociation);
    }
    public void clickOnClosed(){
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closed);

    }
    public void clickOnMarkStageAsComplete(){
//        markStagAsComplete.click();
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", markStagAsComplete);
    }
    public void clickOnChangeMarkAsCurrentStage(){
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", markAsCurrentStage);
//        markAsCurrentStage.click();
    }
    public void clickOnClosedStage(){
//        changeCloseStage.click();
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closed);
    }

//    public void clickOnSelectClosedStage(){
////        changeCloseStage.click();
//        js=(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click();", selectClosedStage);
//    }

    public void dropDownCloseWonStage(){
//        changeCloseStage.click();
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", selectClosedStage);
        js.executeScript("arguments[0].click();", dropDownClosed);
        Select select=new Select(dropDownClosed);
        select.selectByVisibleText("Closed Won");
    }
    public void dropDownCloseLostStage(){
//        changeCloseStage.click();
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", selectClosedStage);
        js.executeScript("arguments[0].click();", dropDownClosed);
        Select select=new Select(dropDownClosed);
        select.selectByVisibleText("Closed Lost");
    }

    public void clickOnSaveBtn(){
        saveBtn.click();
    }
}
