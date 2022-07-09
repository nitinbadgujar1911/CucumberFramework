Feature: Login Functionality

Background: 
Given user navigate to url "http://localhost:100"
Then Login page should appear

#Scenario: Valid Login
#When User enters valid login and passward
#Then click in Login Button
#Then user should be landed on Home page
#And click logout link
#And close the browser

Scenario Outline: InValid Login
When User enters invalid login as "<userid>" and passward as "<passward>"
Then click in Login Button
Then verify login error mesg
And close the browser
Examples:
|userid|passward|
|admin123|admin|
|admin456|admin|