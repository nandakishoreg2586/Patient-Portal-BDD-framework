$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "PP Login with DBB",
  "description": "",
  "id": "pp-login-with-dbb",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Feature-3"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#@test0"
    },
    {
      "line": 5,
      "value": "#Scenario: PP Login with valild data"
    },
    {
      "line": 6,
      "value": "#    Given user is in login page"
    },
    {
      "line": 7,
      "value": "#    When title of login page is Log into Patient Portal"
    },
    {
      "line": 8,
      "value": "#    Then user enters username and password"
    },
    {
      "line": 9,
      "value": "#    Then user click on login button"
    },
    {
      "line": 10,
      "value": "#    And user is navigated to dashboard"
    }
  ],
  "line": 13,
  "name": "PP Login with invalild data",
  "description": "",
  "id": "pp-login-with-dbb;pp-login-with-invalild-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "title of login page is Log into Patient Portal",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters invalid username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user is displayed with error message",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefi.user_in_login_page()"
});
formatter.result({
  "duration": 9207125400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefi.title_of_login_page_is_Log_into_Patient_Portal()"
});
formatter.result({
  "duration": 11821662,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefi.user_enters_invalid_username_and_password()"
});
formatter.result({
  "duration": 170155032,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefi.user_click_on_login_button()"
});
formatter.result({
  "duration": 890861121,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefi.user_is_displayed_with_error_message()"
});
formatter.result({
  "duration": 651229450,
  "status": "passed"
});
});