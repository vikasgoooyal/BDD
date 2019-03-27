#Author: your.email@your.domain.com

@Conference
Feature: Conferencebooking

Background: User is on conference registration page.

Scenario: check the title
Given User is on conference booking page
Then check the title of the page

Scenario: Failure in conference Booking on leaving the first Name empty 
Given User is on conference booking page
When user leaves first Name blank
And clicks the button
Then display alert msg


Scenario: Failure in conference Booking on leaving the last Name blank
Given User is on conference booking page
When user leaves last Name blank and clicks the button
Then display alert msg


Scenario: Failure in conference Booking on incorrect email format 
Given User is on conference booking page
When user enters incorrect email format and clicks the button
Then display alert msg


Scenario: Failure in conference Booking on leaving the contactNo blank 
Given User is on conference booking page
When user leaves contactNo blank and clicks the button
Then display alert msg

Scenario: Failure in conference Booking on incorrect mobileNo format 
Given User is on conference booking page
When user enters incorrect mobileNo format and clicks the button


Scenario: Failure in conference Booking on not selecting the NoOfPeople
Given User is on conference booking page
When user doesnot select NoOfPeople
Then display alert msg


Scenario: Failure in conference Booking on leaving the Building name and Room no blank
Given User is on conference booking page
When user leaves Building and room no blank and clicks the button
Then display alert msg


Scenario: Failure in conference Booking on leaving the area blank 
Given User is on conference booking page
When user leaves area name blank and clicks the button
Then display alert msg


Scenario: Failure in conference Booking on not selecting the city 
Given User is on conference booking page
When user doesnot select city
Then display alert msg

Scenario: Failure in conference Booking on not selecting the state 
Given User is on conference booking page
When user doesnot select state
Then display alert msg

Scenario: Failure in conference Booking on not selecting membership.
Given User is on conference booking page
When user doesnot select membership type.
Then display alert msg

Scenario: Successful conference booking with all valid data
Given User is on conference booking page
When user enters all valid data 
Then navigate to payment page 

Scenario: check the title
Given User is on personal detail page
Then check the title of the page

Scenario: Failure in payment on leaving the CardHolderName blank 
Given User is on personal detail page
When user leaves CardHolderName blank and clicks the button
Then display alert msg

Scenario: Failure in payment on leaving the DebitcardNumber blank 
Given User is on personal detail page
When user leaves DebitcardNumber blank and clicks the button
Then display alert msg


Scenario: Failure in payment on leaving the ExpirationMonth blank 
Given User is on personal detail page
When user leaves ExpirationMonth blank and clicks the button
Then display alert msg

Scenario: Failure in payment on leaving the ExpirationYear blank 
Given User is on personal detail page
When user leaves ExpirationYear blank and clicks the button
Then display alert msg

Scenario: Sucess on conference Room booking 
Given User is on personal detail page
When User enter all persona; detail correct
Then display alert msg




































