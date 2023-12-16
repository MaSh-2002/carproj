Feature: Installation Services

Scenario: User requests installation services for a product
Given the user in  the product details page 
When the user selects a specific product "Covers" for installation
And the user provides installation details for example "car_model" and "preferred date"
Then the system should confirm the request and provide information about the scheduled installation


Scenario: User checks installer availability
Given the user is on the installation services page
When the user selects a product for installation
Then the system should display available installation dates and times


Scenario: User schedules an installation appointment
Given the user is on the installation services page
When the user selects a product for installation
And the user chooses an available date and time
Then the system should confirm the appointment and provide relevant details
