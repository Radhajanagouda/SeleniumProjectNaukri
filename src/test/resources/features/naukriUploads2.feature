Feature: Validate the naukri profiles

  @smoke
  Scenario: Validate google
    Given Login to other website of google "www.google.com"
    And Login to other website of google "newFile"
      |www.google.com|


  @smoke
  Scenario: Validate the naukri features2
    Given Login to naukri with below user "<UserName>"



