Feature: Create lead feature in leaftaps application

@createLead @regression
Scenario: create lead scenario with valid test data
Given setup the env
And enter the username as 'demosalesmanager'
And enter the password as 'crmsfa'
When click on the login button
Then verify the login is success
When click on the crmsfa link
And click on the leads tab
And click on the create lead link
Given enter the company name as 'Testleaf' 
And enter the first name as 'Gokul'
And enter the last name as 'Sekar'
And enter the phno as '99'
When click on the submit button
Then verify the leadId


@multiCreadLead
Scenario Outline: create lead scenario with valid test data
Given setup the env
And enter the username as 'demosalesmanager'
And enter the password as 'crmsfa'
When click on the login button
Then verify the login is success
When click on the crmsfa link
And click on the leads tab
And click on the create lead link
Given enter the company name as <cname> 
And enter the first name as <fname>
And enter the last name as <lname>
And enter the phno as <phno>
When click on the submit button
Then verify the leadId

Examples:
|fname|lname|cname|phno|
|'Gokul'|'sekar'|'Testleaf'|'99'|
|'Babu'|'M'|'Qeagle'|'98'|
|'Hari'|'R'|'Testleaf'|'97'|