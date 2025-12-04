Feature: Validate the naukri profiles

  @smoke
  Scenario: Validate google
    Given Login to other website of google "www.google.com"
      |www.google.com|new files|
      |www.facebook.com|older files|
      |www.facebook.com|newer files|


  @smoke
  Scenario: Validate the naukri features2
    Given Login to naukri with below user "<UserName>"



