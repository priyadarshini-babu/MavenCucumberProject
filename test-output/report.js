$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Features/login.feature");
formatter.feature({
  "name": "Free CRM Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Invalid user scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the start up page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginStepDefinitions.user_is_on_the_start_up_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login option",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginStepDefinitions.user_clicks_on_Login_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginStepDefinitions.user_enters_username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginStepDefinitions.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "invalid user message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginStepDefinitions.invalid_user_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});