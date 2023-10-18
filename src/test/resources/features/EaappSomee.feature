@ee
Feature:Login to eaapSomee Application

  Scenario: TC_01 Login ,Create and Delete the employee List on the EaapSomee Application

    Given Navigate to eaapSomee Application
    Then Login as admin
    And Go to Employee List page
    Then Create a new employee
    And Verify the new employee info in Employee List page
    Then Delete the new employee
    Then Verify the new employee deleted in Employee List page



