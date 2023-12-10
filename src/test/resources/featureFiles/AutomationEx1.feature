@Sanity
Feature: Verification of Automation Exercise in Level_1
Scenario: Title Verification
Given User is at AutomationExercise landing page
Then Title should contains the "Automation"

@Retesting
Scenario: Cart link verification
Given User is at AutomationExercise landing page
Then User should able to see Cart link enabled

@Regression
Scenario: Verify user should able to login Automation Exercise portal
Given User is at AutomationExercise landing page
When User should click on login link
And User should enter username as "ganeshsase2020@gmail.com"
And User should enter password as "123456"
And User should click on Login button
Then User should able to see Features Items
