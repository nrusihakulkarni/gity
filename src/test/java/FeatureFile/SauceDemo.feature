
Feature: Test sause demo 

#Background:
#Given print line 
#Given load url
#Then open hame page 
#And oen to login page
#And print line


@Mobile
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"
   
@WebTest 
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jon" and password "4321"
Then Home page is populated
And Cards displayed are "false"   

@WebTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with with folling details 
| jenny | abcd | john@abcd.com |Australia | 3242353|
Then Home page is populated
And Cards displayed are "false"   


@WebTest 
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with username "<userName>" and password "<password>" 
Then Home page is populated
And Cards displayed are "false" 

Examples:
|userName|password|
|	user1 |	pass1 |
|	user2 |	pass2 |
|	user3 |	pass3 |





