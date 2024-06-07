Feature: Swarovski signup


@signup
Scenario: Create a new account
  Given customer at Swarovski Homepage
  And customer clicks on Register button
  And customer enter their email
  And customer enter their password
  And customer agrees with terms and conditions
  Then customer click on Join the Club button
