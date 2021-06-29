$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Google login feature",
  "description": "",
  "id": "google-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Check user login and signout functionality with valid login credentials",
  "description": "",
  "id": "google-login-feature;check-user-login-and-signout-functionality-with-valid-login-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@P1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Google login page URL passed",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "correct \"\u003cusername\u003e\" should able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User is on home page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user should be able to signout",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "google-login-feature;check-user-login-and-signout-functionality-with-valid-login-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "google-login-feature;check-user-login-and-signout-functionality-with-valid-login-credentials;;1"
    },
    {
      "cells": [
        "krina54312",
        "Krina@123"
      ],
      "line": 14,
      "id": "google-login-feature;check-user-login-and-signout-functionality-with-valid-login-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1574569662,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Check user login and signout functionality with valid login credentials",
  "description": "",
  "id": "google-login-feature;check-user-login-and-signout-functionality-with-valid-login-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@P1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Google login page URL passed",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter \"krina54312\" and \"Krina@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "correct \"krina54312\" should able to login",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User is on home page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user should be able to signout",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDef.google_login_page_URL_passed()"
});
formatter.result({
  "duration": 1015843096,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "krina54312",
      "offset": 12
    },
    {
      "val": "Krina@123",
      "offset": 29
    }
  ],
  "location": "loginStepDef.user_enter_and(String,String)"
});
formatter.result({
  "duration": 2113012679,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.click_on_next_button()"
});
formatter.result({
  "duration": 189466645,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "krina54312",
      "offset": 9
    }
  ],
  "location": "loginStepDef.correct_should_able_to_login(String)"
});
formatter.result({
  "duration": 2792437006,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 111149549,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDef.user_should_be_able_to_signout()"
});
formatter.result({
  "duration": 1855500630,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 211609037,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Check validation for invalid login",
  "description": "",
  "id": "google-login-feature;check-validation-for-invalid-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@P2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Google login page URL passed",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "correct \"\u003cusername\u003e\" should able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User is on home page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User should be able to search with \"\u003csearchstring\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user should be able to signout",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "google-login-feature;check-validation-for-invalid-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "searchstring"
      ],
      "line": 26,
      "id": "google-login-feature;check-validation-for-invalid-login;;1"
    },
    {
      "cells": [
        "krina54312",
        "Krina@123",
        "Hello"
      ],
      "line": 27,
      "id": "google-login-feature;check-validation-for-invalid-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 674997821,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Check validation for invalid login",
  "description": "",
  "id": "google-login-feature;check-validation-for-invalid-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@P2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Google login page URL passed",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user enter \"krina54312\" and \"Krina@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "correct \"krina54312\" should able to login",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User is on home page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User should be able to search with \"Hello\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user should be able to signout",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDef.google_login_page_URL_passed()"
});
formatter.result({
  "duration": 957627138,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "krina54312",
      "offset": 12
    },
    {
      "val": "Krina@123",
      "offset": 29
    }
  ],
  "location": "loginStepDef.user_enter_and(String,String)"
});
formatter.result({
  "duration": 1997713113,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.click_on_next_button()"
});
formatter.result({
  "duration": 185186886,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "krina54312",
      "offset": 9
    }
  ],
  "location": "loginStepDef.correct_should_able_to_login(String)"
});
formatter.result({
  "duration": 2839754882,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 114395272,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello",
      "offset": 36
    }
  ],
  "location": "homePageStepDef.user_should_be_able_to_search_with(String)"
});
formatter.result({
  "duration": 259809422,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDef.user_should_be_able_to_signout()"
});
formatter.result({
  "duration": 1831894683,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 202171327,
  "status": "passed"
});
});