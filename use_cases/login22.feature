Feature: login
  
	Background:
		Given the login page is open

	Scenario: Successful Admin Login
		When I submit user name "shahd" and password "258" and should enter to admin page
		Then I should be logged in to admin page

	Scenario: Successful Installer Login
		When I submit user name "Majd" and password "m" and should enter to installer page
		Then I should be logged in to installer page

	Scenario: Successful Tenant Login
		When I submit user name "maha" and password "000" and should enter to tenant page
		Then I should be logged in to tenant page
