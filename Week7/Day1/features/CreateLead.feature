Feature: Create lead feature in leaftaps application

@createLead @regression
Scenario: create lead scenario with valid test data

Given setup the env
And enter the username
And enter the password
When click on the login button
Then verify the login is success
When click on the crmsfa link
And click on the leads tab
And click on the create lead link
Given enter the company name
And enter the first name
And enter the last name
#And enter the phno
When click on the submit button
#Then verify the leadId