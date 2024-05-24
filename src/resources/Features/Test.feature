Feature: Create a test and select / set any values.(Use Excel / Json / XML / Properties file for test data)

  Scenario: first Basic HTML Code
    Given user login the  test url
    Then  validate the page text
    When  user enters the HTML form
    And   user validate the successful submit message


  Scenario: HTML5 Form Elements Examples
    Given User navigate to HTML Form
    Then User fill the html form
    And user validate the successful submit message


