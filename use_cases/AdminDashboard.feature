Feature: admain dashboard

  Scenario: a Admin add catagory
    Given that the user is an admin
    When  the admin enter  a catagory with name <"dd"> to add it
    Then the catagory  is added


  Scenario: a Admin delete a catagory
    Given that the user is an admin
    When  the admin  enter a catagory with id <4> delete it
    Then the catagory is deleted

 Scenario: a Admin add product
    Given that the user is an admin
    When  the admin enter  a product with name <"f"> and price<500> and catagory number <1> to add it
    Then the product  is added


Scenario: a Admin delete a product
    Given that the user is an admin
    When  the admin  enter a product with name <"f"> delete it
    Then the product is deleted


