@FunctionalTest
Feature: SampleTwo Feture

Scenario: Valid logiin
Given user logged in successfuly

Scenario: Invalid Login
Given user unable to login

@SmokeTest
Scenario: Create Task
Given user is on task page
@RegressionTest	
Scenario: Create contact
Given user is on contact page

@RegressionTest @SmokeTest
Scenario: Update task
Given user is on Task edit page

@SmokeTest
Scenario: Update contact
Given user is on contact page




