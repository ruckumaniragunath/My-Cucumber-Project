Feature: Testcases related to Stackoverflow home page

Background:
Given Create driver instance and launch the url


@smoke @e2e
	Scenario: Validate Stackoverflow header menu options
		
	Given User launch Stackoverflow application
	When User validate Stackoverflow logo in primary menu
	And User validate Stackoverflow About in primary menu
	And User validate Stackoverflow Products in primary menu
	And User validate Stackoverflow For Teams in primary menu
	And User validate Stackoverflow Search box in primary menu
	And User validate Stackoverflow Log in in primary menu
	And User validate Stackoverflow Sign up in primary menu
	Then User close the application

@regression
	Scenario: Validate Stackoverflow header menu1 options
		
	Given User launch Stackoverflow application
	When User validate Stackoverflow logo in primary menu
	And User validate Stackoverflow About in primary menu
	And User validate Stackoverflow Products in primary menu
	And User validate Stackoverflow For Teams in primary menu
	And User validate Stackoverflow Search box in primary menu
	And User validate Stackoverflow Log in in primary menu
	And User validate Stackoverflow Sign up in primary menu
	Then User close the application
	
	
	@e2e
	Scenario: Validate Stackoverflow header menu2 options
		
	Given User launch Stackoverflow application
	When User validate Stackoverflow logo in primary menu
	And User validate Stackoverflow About in primary menu
	And User validate Stackoverflow Products in primary menu
	And User validate Stackoverflow For Teams in primary menu
	And User validate Stackoverflow Search box in primary menu
	And User validate Stackoverflow Log in in primary menu
	And User validate Stackoverflow Sign up in primary menu
	Then User close the application

@smoke
	Scenario: Validate Stackoverflow header men3 options
		
	Given User launch Stackoverflow application
	When User validate Stackoverflow logo in primary menu
	And User validate Stackoverflow About in primary menu
	And User validate Stackoverflow Products in primary menu
	And User validate Stackoverflow For Teams in primary menu
	And User validate Stackoverflow Search box in primary menu
	And User validate Stackoverflow Log in in primary menu
	And User validate Stackoverflow Sign up in primary menu
	Then User close the application
