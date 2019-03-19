#Author: vikas goyal
Feature: Reset functionality on login page of application
Scenario Outline: Verfication of reset button with numbers of credential

Given Open the firefox and lauch the application
When Enter the UserName<username> and Password<password>
Then Reset the credential 

Examples:
|username |password		|
|"username1"|"password1"		|
|"username2"|"password2"		|
|"username3"|"password3"		|

