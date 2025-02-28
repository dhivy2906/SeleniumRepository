Feature: Login feature in Leaftaps application

@login @positive @regression
Scenario: Login scenario with valid credentials
Given setup the env
And enter the username
And enter the password
When click on the login button
Then verify the login is success

@negative @login
Scenario: Login scenario with invalid credentials
Given setup the env
And enter the username
And enter the password