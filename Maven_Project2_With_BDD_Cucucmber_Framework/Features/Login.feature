Feature: Verify login functionality
Scenario: Successful Login with valid credentials
Given User Launch Chrome Browser
When User opens URL "https://m.facebook.com"
And User enters Email as "tejasvinishastre@gmail.com" and password as "smrutii"
And Click on Login
Then page tittle should be "https://m.facebook.com/checkpoint/?__req=5"
And close brower