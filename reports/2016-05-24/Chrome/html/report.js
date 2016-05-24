$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EnglandvSlovakia.feature");
formatter.feature({
  "line": 1,
  "name": "As a customer,",
  "description": "I want to place a bet on a football match,",
  "id": "as-a-customer,",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Place bet on a football match",
  "description": "",
  "id": "as-a-customer,;place-bet-on-a-football-match",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on the William Hill website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have navigated to the euro competition section",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I have picked a \"\u003cGame\u003e\" I wish to bet on",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I place a \"\u003cBetAmount\u003e\" on a \"\u003cTeam\u003e\" to win",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I am given the odds and returns",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "as-a-customer,;place-bet-on-a-football-match;",
  "rows": [
    {
      "cells": [
        "Game",
        "BetAmount",
        "Team"
      ],
      "line": 12,
      "id": "as-a-customer,;place-bet-on-a-football-match;;1"
    },
    {
      "cells": [
        "Slovakia vs England",
        "0.05",
        "Slovakia"
      ],
      "line": 13,
      "id": "as-a-customer,;place-bet-on-a-football-match;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 114374,
  "status": "passed"
});
formatter.before({
  "duration": 410621,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Place bet on a football match",
  "description": "",
  "id": "as-a-customer,;place-bet-on-a-football-match;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on the William Hill website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have navigated to the euro competition section",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I have picked a \"Slovakia vs England\" I wish to bet on",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I place a \"0.05\" on a \"Slovakia\" to win",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I am given the odds and returns",
  "keyword": "Then "
});
formatter.match({
  "location": "EnglandVsSlovakiaStepDefs.i_am_on_the_William_Hill_website()"
});
formatter.result({
  "duration": 4702575494,
  "status": "passed"
});
formatter.match({
  "location": "EnglandVsSlovakiaStepDefs.i_have_navigated_to_the_euro_competition_section()"
});
formatter.result({
  "duration": 1396457976,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Slovakia vs England",
      "offset": 17
    }
  ],
  "location": "EnglandVsSlovakiaStepDefs.i_have_picked_a_I_wish_to_bet_on(String)"
});
formatter.result({
  "duration": 1921727200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 11
    },
    {
      "val": "Slovakia",
      "offset": 23
    }
  ],
  "location": "EnglandVsSlovakiaStepDefs.i_place_a_on_a_to_win(String,String)"
});
formatter.result({
  "duration": 1327337391,
  "status": "passed"
});
formatter.match({
  "location": "EnglandVsSlovakiaStepDefs.i_am_given_the_odds_and_returns()"
});
formatter.result({
  "duration": 798345185,
  "status": "passed"
});
formatter.after({
  "duration": 75504,
  "status": "passed"
});
});