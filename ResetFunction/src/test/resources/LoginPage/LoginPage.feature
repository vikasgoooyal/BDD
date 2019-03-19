#Author: vikas goyal
@LoginPage
Feature: Login


Background: User is already at login page and navigated to loginPage.



Scenario: failure login if user wrong data.
Given user is on login page
When User enter invalid data.
Then alert message

Scenario: Failure in hotel Booking on leaving the userName blank

Given user is on login page
When User leaves user blank
And Clicks the button
Then alert username message

Scenario: Failure in hotel Booking on leaving the Password blank
Given user is on login page
When User leaves Password blank and clicks the button
Then alert password message

Scenario: Success login if user valid data.
Given user is on login page
When User enter all valid data
Then navigate to other page.
