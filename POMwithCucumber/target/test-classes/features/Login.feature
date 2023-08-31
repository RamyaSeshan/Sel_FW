Feature: POM with Cucumber

Scenario Outline: Login Functionality

And Enter the username as <username>
And Enter the password as <password>
When Click on the loginButton

Examples:
|username|password|
|DemoCsr|crmsfa|
|demosalesManager|crmsfa|