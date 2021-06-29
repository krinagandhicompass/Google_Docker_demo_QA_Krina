Feature: Google login feature 

@P1
Scenario Outline: Check user login and signout functionality with valid login credentials 
	Given Google login page URL passed 
	When user enter "<username>" and "<password>" 
	And click on next button 
	Then correct "<username>" should able to login 
	When User is on home page
	Then user should be able to signout
	
	Examples: 
		|username|password|
		|krinag73|krina@123|

@P2				
Scenario Outline: Check validation for invalid login 
	Given Google login page URL passed 
	When user enter "<username>" and "<password>" 
	And click on next button 
	Then correct "<username>" should able to login 
	
	Examples: 
		|username|password|
		|krinag73|krina@12|