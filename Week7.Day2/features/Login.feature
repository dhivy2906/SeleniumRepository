Feature: Login feature in Leaftaps application

#Background:
#Given setup the env // instead of this, hooks annotations are performed @beforemethod and @aftermethod in base

@login @postivie @regression
Scenario: Login scenario with valid credentials
Given enter the username as 'demosalesmanager'
And enter the password as 'crmsfa'
When click on the login button
Then verify the login is success

@negative @login
Scenario: Login scenario with invalid credentials
Given enter the username as 'demo'
And enter the password as 'csr123'
When click on the login button
But verify the login is success