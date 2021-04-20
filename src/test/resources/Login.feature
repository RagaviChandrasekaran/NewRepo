Feature: CRM login feature

Scenario: Valid Login scenario

Given User is already login page
When user enterlogin crede
	|username|password|
	|corpdevops@gmail.com|CrmPro123|
Then Close the browser


#Scenario: Valid Login scenario
#Given: User is already login page
#When user enterlogin crede
#Then user is in home page
#Then Close the browser

#Scenario Outline:Valid login scenario
#Given: User is already login page
#When user enterlogin crede as "<username>"and "<password>"
#Then Close the browser
#Examples:
#|username|password|
#|corpdevops@gmail.com|CrmPro123|
#|user|welcome|
