Feature: Farnell Login Screen Feature

@LoginTest1
Scenario: User Able To Login From Farnell Login Screen and Login Details Remembered When Check Remember me Box
Given User is on Farnell Login Screen
When User enter username "Username@123456" and password "Password@12345"
And User select Remember me checkbox
And User click on Login button
Then User is able to Login Succesfully 
And Login details remembered on logout


@LoginTest2
Scenario: User Able To Login From Farnell Login Screen and Login Details Not Remembered When UnCheck Remember me Box
Given User is on Farnell Login Screen
When User enter username "Username@123456" and password "Password@12345"
And User Uncheck Remember me checkbox
And User click on Login button
Then User is able to Login Succesfully 
And Login details Not remembered on logout