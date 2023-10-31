Feature: login  
  
	Background:
		Given inter user name and password

	Scenario: find  admin name by user name
		When I submit user name <"shahd"> and password <"963"> and should enter to admin page
		Then I should be logged in to admin page for username <"ahmad"> and password <"789">

	Scenario: find owner name by user name
		When I submit user name <"Majd"> and password <"123"> and should enter to installer page
		Then I should be logged in to installer page

	Scenario: find  user name by user name
		When I submit user name <"haya"> and password <"159"> and should enter to tenant page
		Then I should be logged in to tenant page