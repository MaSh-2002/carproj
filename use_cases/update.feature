Feature: Update Tenant Information
    As a tenant
    I want to be able to update my personal information
    So that my details are up to date

   

Scenario: Update Phone Number
    When I inter <1> to update my phone Number
    Then my phone number should be updated to <"1234567890">

Scenario: Update Bank Card
    When I inter <2> to update my bank card number
    Then my bank card number should be updated to <"1234567812345678">

Scenario: Update Email
    When I inter <3> to update my email address
    Then my email address should be updated to <"newemail@example.com">

Scenario: Update Password
    When I inter <4> to update my password  
    Then my password should be updated to <"newPassword123">
