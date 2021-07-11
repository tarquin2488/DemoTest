Feature: Farnell Register Screen Feature

@RegisterTest1
Scenario: New User Able To Register From Farnell Register Screen and Login Details Remembered When Check Remember me Box
Given User is on Farnell Register Screen
When User enter all the details Correctly
And User select Remember me checkbox
And User click on Register button
Then User is able to Register 
And Login details remembered on logout

@RegisterTest2
Scenario: New User Able To Register From Farnell Register Screen and Login Details Not Remembered When UnCheck Remember me Box
Given User is on Farnell Register Screen
When User enter all the details Correctly
And User UnCheck Remember me checkbox
And User click on Register button
Then User is able to Register 
And Login details Not remembered on logout
