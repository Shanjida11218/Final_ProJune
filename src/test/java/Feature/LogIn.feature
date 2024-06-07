Feature: Swarovski Login
  Background:
    Given customer at Swarovski Homepage

  @login
  Scenario: Customer Login to their account successfully
    And customer clicks on Login button
    And customer enter their email
    And customer enter their password
    Then customer click on login button

 @Adding_to_cart
    Scenario: Customer add Jewelery to cart
      And Customer navigate to Jewelry button
      And Customer click on their desired product
      Then Customer click on Add To cart button
@Checkout
   Scenario: Customer checkout the product successfully
     And Customer click on the Cart icon
     And Customer click on Checkout button
     And Customer enter their First name
     And Customer enter their Last name
     And Customer enter their Telephone Number
     And Customer enter the first line of their address
     Then Customer click on continue Button