Feature:Place order

Background:User Login
Given User is on login Page
When User enters "standard_user" and "secret_sauce"
Then User should be on Home page

Scenario: Add Item to cart
Given  User should be on Home page
When User add item to cart
Then Item must be added

Scenario: Checkout Order
Given User is on cart page
When User do checkout
Then Should navigate to Checkout page