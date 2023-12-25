Feature: Notifications

Scenario: Customer receives an email confirmation after placing an order
    Given the Customer is on the products page
    When the Customer places an order
    Then an email confirmation should be sent to the Customer
    Scenario: Installer receives an email notification when a customer places an order
    When a Customer places an order
    Then an email notification should be sent to the Installer
    
    