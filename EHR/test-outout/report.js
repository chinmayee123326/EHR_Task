$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Eclipse_Neon/Eclipse/EHR/src/main/java/com/EHR/Features/Ehr.feature");
formatter.feature({
  "line": 1,
  "name": "EHR Application Test",
  "description": "",
  "id": "ehr-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "# Scenario: Navigate to the correct patient and chart"
    },
    {
      "line": 6,
      "value": "#   Given User opens browser"
    },
    {
      "line": 7,
      "value": "# Then User is on login logged with Valid credentials"
    },
    {
      "line": 8,
      "value": "#  Then Navigate to the patient chart"
    },
    {
      "line": 9,
      "value": "#  Then Click on Edit botton"
    }
  ],
  "line": 11,
  "name": "Enter in all the information and save the chart",
  "description": "",
  "id": "ehr-application-test;enter-in-all-the-information-and-save-the-chart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User is on login logged with Valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Navigate to the patient chart",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click on Edit botton",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Edit History",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepagesteps.user_opens_browser()"
});
formatter.result({
  "duration": 11444458000,
  "status": "passed"
});
formatter.match({
  "location": "Homepagesteps.user_is_on_login_logged_with_Valid_credentials()"
});
formatter.result({
  "duration": 15197227100,
  "status": "passed"
});
formatter.match({
  "location": "Homepagesteps.navigate_to_the_patient_chart()"
});
formatter.result({
  "duration": 10862297700,
  "status": "passed"
});
formatter.match({
  "location": "Homepagesteps.click_on_Edit_botton()"
});
formatter.result({
  "duration": 665949500,
  "status": "passed"
});
formatter.match({
  "location": "Homepagesteps.edit_History()"
});
formatter.result({
  "duration": 2956210400,
  "status": "passed"
});
});