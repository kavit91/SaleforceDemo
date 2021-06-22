Feature: Moving an Opportunity through the Sales Process

  Scenario: Check Default stage of Opportunity
    Given user login to salesforce
    When user create new Opportunity
    Then Default stage of Opportunity will be Qualification

  Scenario: Check Opportunity move form Qualification stage to MeetingScheduled Stage
    Given user login to salesforce
    When user create new Opportunity
    And user move opportunity form Qualification stage to MeetingScheduled Stage
    Then Current stage of Opportunity will be MeetingScheduled

  Scenario: Check Opportunity move form MeetingScheduled Stage to ProposalPriceQuote Stage
    Given user login to salesforce
    When user create new Opportunity
    And user move opportunity form MeetingScheduled stage to ProposalPriceQuote Stage
    Then Current stage of Opportunity will be ProposalPriceQuote

  Scenario: Check Opportunity move form ProposalPriceQuote stage to NegotiationReview Stage
    Given user login to salesforce
    When user create new Opportunity
    And user move opportunity form ProposalPriceQuote stage to NegotiationReview Stage
    Then Current stage of Opportunity will be NegotiationReview

  Scenario: Check Opportunity move form NegotiationReview stage to closedWon Stage
    Given user login to salesforce
    When user create new Opportunity
    And user move opportunity form NegotiationReview stage to closedWon Stage
    Then Current stage of Opportunity will be ClosedWon Stage

  Scenario: Check Opportunity move form NegotiationReview stage to closedWon Stage
    Given user login to salesforce
    When user create new Opportunity
    And user move opportunity form NegotiationReview stage to ClosedLoss Stage
    Then Current stage of Opportunity will be ClosedLoss Stage






