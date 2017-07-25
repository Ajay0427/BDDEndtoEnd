Feature: Facebook Login funtionality 

Background: 
	Given User is on login Page 
	
Scenario Outline: Login with Valid credentials 

	When user enters "<username>" 
	And user enters "<password>" 
	And user clicks on sign in button 
	Then User logged in successfully 
	
	Examples: wor cmfd s - 
		| username  | password  | 
		| ajay0427@gmail.com | ididit | 
		| jaiswalajay0427@gmail.com | password2 |
		
		
