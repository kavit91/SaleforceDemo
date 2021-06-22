package steps;

import base.Base;
import io.cucumber.core.backend.BackendProviderService;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.OpportunityPage;
import pages.OpportunityStagesPage;
import pages.SalesforceLoginPage;

public class OpportunityStages extends Base {
    OpportunityPage op;
    OpportunityStagesPage os;

    @Before
    public void setUp() throws InterruptedException {
        browserSetUp();
        SalesforceLoginPage sf=new SalesforceLoginPage(driver);
        sf.saleforceLoginPage();
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
    @Given("^user login to salesforce$")
    public void user_login_to_salesforce() throws Throwable {
//        browserSetUp();
//        SalesforceLoginPage lp=new SalesforceLoginPage(driver);
//        lp.saleforceLoginPage();
    }

    @When("^user create new Opportunity$")
    public void user_create_new_opportunity() throws Throwable {
        op=new OpportunityPage(driver);
        op.createNewOpportunity();
    }

    @Then("^Default stage of Opportunity will be Qualification$")
    public void default_stage_of_opportunity_will_be_qualification() throws Throwable {
//        String text=driver.findElement(By.xpath("(//*[text()='Qualification'])[11]")).getText();
//        Assert.assertEquals("Qualification", text);
//        System.out.println(text+" we got this text");
//        op.verifyDefaultStage();
        Assert.assertEquals("Qualification", op.verifyDefaultStage());
    }

    @And("^user move opportunity form Qualification stage to MeetingScheduled Stage$")
    public void user_move_opportunity_form_qualification_stage_to_meetingscheduled_stage() throws Throwable {
        os=new OpportunityStagesPage(driver);
        os.clickOnMarkStageAsComplete();
        os.clickOnMeeting();
        os.clickOnMarkStageAsComplete();
    }
    @Then("^Current stage of Opportunity will be MeetingScheduled$")
    public void current_stage_of_opportunity_will_be_meetingscheduled() throws Throwable {
//        op.verifyDefaultStage("Meeting Scheduled");
        Assert.assertEquals("Meeting Scheduled", op.verifyDefaultStage());
    }

    @And("^user move opportunity form MeetingScheduled stage to ProposalPriceQuote Stage$")
    public void user_move_opportunity_form_meetingscheduled_stage_to_proposalpricequote_stage() throws Throwable {
        os=new OpportunityStagesPage(driver);
        os.clickOnProposal();
        os.clickOnChangeMarkAsCurrentStage();
        os.clickOnMarkStageAsComplete();
    }
    @Then("^Current stage of Opportunity will be ProposalPriceQuote$")
    public void current_stage_of_opportunity_will_be_proposalpricequote() throws Throwable {
//        op.verifyDefaultStage("Proposal/Price Quote");
        Assert.assertEquals("Proposal/Price Quote", op.verifyDefaultStage());
    }

    @And("^user move opportunity form ProposalPriceQuote stage to NegotiationReview Stage$")
    public void user_move_opportunity_form_proposalpricequote_stage_to_negotiationreview_stage() throws Throwable {
        os=new OpportunityStagesPage(driver);
        os.clickOnNegociation();
        os.clickOnChangeMarkAsCurrentStage();
        os.clickOnMarkStageAsComplete();
    }
    @Then("^Current stage of Opportunity will be NegotiationReview$")
    public void current_stage_of_opportunity_will_be_negotiationreview() throws Throwable {
//        op.verifyDefaultStage("Negotiation/Review");
        Assert.assertEquals("Negotiation/Review", op.verifyDefaultStage());
    }




    @And("^user move opportunity form NegotiationReview stage to closedWon Stage$")
    public void user_move_opportunity_form_negotiationreview_stage_to_closedwon_stage() throws Throwable {
        os=new OpportunityStagesPage(driver);
        os.clickOnClosed();
        os.dropDownCloseWonStage();
        os.clickOnSaveBtn();
        Thread.sleep(3000);

    }
    @Then("^Current stage of Opportunity will be ClosedWon Stage$")
    public void current_stage_of_opportunity_will_be_closedwon_stage() throws Throwable {
//        op.verifyDefaultStage("Closed Won");
        Assert.assertEquals("Closed Won", op.verifyDefaultStage());
    }



    @And("^user move opportunity form NegotiationReview stage to ClosedLoss Stage$")
    public void user_move_opportunity_form_negotiationreview_stage_to_closedloss_stage() throws Throwable {

    }
    @Then("^Current stage of Opportunity will be ClosedLoss Stage$")
    public void current_stage_of_opportunity_will_be_closedloss_stage() throws Throwable {


    }





}
