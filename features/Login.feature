@Feature-3
Feature: PP Login with DBB

#@test0
#Scenario: PP Login with valild data
#    Given user is in login page
#    When title of login page is Log into Patient Portal
#    Then user enters username and password
#    Then user click on login button
#    And user is navigated to dashboard 
 
 @test1
 Scenario: PP Login with invalild data
    Given user is in login page 
    When title of login page is Log into Patient Portal
    Then user enters invalid username and password
    Then user click on login button
    And user is displayed with error message 

# same function can be used for different key words given and then in one scenario can be and in another scenario 
 
# @test2
# Scenario: PP Login with invalild data
#    Given user is in login page 
#    And title of login page is Log into Patient Portal
#    And  user enters invalid username and password
#    Then user click on login button
#    And user is displayed with error message 
#    And user is not displayed with error message
 
 
    
    
# @test2
# Scenario: PP Login with invalild data with data driven from script
#    Given user is in login page
#    When title of login page is Log into Patient Portal
#    Then user enters username "Nkjune@100" and password "Nkjune@100" from script
#    Then user click on login button
#    And user is displayed with error message 
    
# @test3
# Scenario Outline: PP Login with valild data with data driven from Exapmles keyword
#    Given user is in login page
#    When title of login page is Log into Patient Portal
#    Then user enters username "<Username>" and password "<Password>" from script
#    Then user click on login button
# 	And user is navigated to dashboard 
# 	
# 	Examples: 
# 				| Username |Password |
# 			  | Nkjune@1 |Nkjune@1 |
# 			  | Nkjune@20 |Nkjune@20 |