@Feature-1
Feature: PP request PHR 

@test0
Scenario: PP Login with valild data
    Given user is in login page
    When title of login page is Log into Patient Portal
    Then user enters username and password from datatable
    |Nkjune@1|Nkjune@1|
    Then user click on login button
    And user is navigated to dashboard 
    Then user click on Request PHR Link 