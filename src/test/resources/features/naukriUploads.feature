Feature: Validate the naukri profiles

  @smoke
  Scenario Outline: Validate the naukri features
    Given Login to naukri with below user "<UserName>"
    Then landing page is got as "naukri8999"
    Then Logout the page
    Examples:
    |UserName|
    |radha.janagouda@gmail.com|

  @sSmoke
  Scenario Outline: Validate the naukri features
    Given Login to naukri with below user "<UserName>"
    Then landing page is got as "nsf"
    Then Logout the page
    Examples:
      |UserName|
      |radha.bgm@gmail.com|


