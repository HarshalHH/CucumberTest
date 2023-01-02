@CreditLogin
Feature: Login and Bulk Upload functionality for Credit Manager
  Verify if Credit Manager is able to Login in to the site

  Scenario: Login as Credit Manager user
    Given Credit Manager is on home page
    When Credit Manager navigates to Login Page
    Then success message is displayed