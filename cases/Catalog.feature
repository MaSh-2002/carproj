Feature: catalog
    
Scenario: User browses products by category
Given the user is on the product catalog page
When the user selects a category (e.g., Interior)
Then the system should display a list of products in that category

Scenario: User views detailed product information
Given the user is on the product details page
When the user selects a specific product 
Then the system should display detailed information including description, images, price, and availability status

//Scenario: User searches for a specific product
//Given the user is on the product catalog page
//When the user enters a search query (e.g., "seat covers")
//And clicks on the search button
//Then the system should display relevant products matching the search query  
      
