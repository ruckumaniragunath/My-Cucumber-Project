Feature: Testcases related to ChildSupport home page

	Scenario Outline: Validate ChildSupport header menu options
		
	Given User launch ChildSupport application with url as "<url>"
	When User validate ChildSupport logo in primary menu
	And User validate page title as "<title>"
	And User validate ChildSupport OurAgency in primary menu
	And User validate ChildSupport Services We Offer in primary menu
	And User validate ChildSupport Quick Links in primary menu
	And User validate Stackoverflow How To in primary menu
	And User validate ChildSupport Forms&Info in primary menu
	And User validate ChildSupport Employers in primary menu
	And User validate ChildSupport Search in primary menu
	Then User close ChildSupport application
	Examples:
	|url|title|
	|https://childsupport.ca.gov/|CA Child Support Services|
	
	@smoke
	

	Scenario Outline: Validate ChildSupport header menu4 options
		
	Given User launch ChildSupport application with url as "<url>"
	When User validate ChildSupport logo in primary menu
	And User validate page title as "<title>"
	And User validate ChildSupport OurAgency in primary menu
	And User validate ChildSupport Services We Offer in primary menu
	And User validate ChildSupport Quick Links in primary menu
	And User validate Stackoverflow How To in primary menu
	And User validate ChildSupport Forms&Info in primary menu
	And User validate ChildSupport Employers in primary menu
	And User validate ChildSupport Search in primary menu
	Then User close ChildSupport application
	Examples:
	|url|title|
	|https://childsupport.ca.gov/|CA Child Support Services|
	

	
	
	

