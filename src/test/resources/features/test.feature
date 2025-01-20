Feature: search

  Scenario: Search in linkedin
  Given Go to url
    When Login in linkedin
    And Sharing post to linkedin
   Then Quit linkedin
