Feature: As a customer,
  I want to place a bet on a football match,

  Scenario Outline: Place bet on a football match
    Given I am on the William Hill website
    And I have navigated to the euro competition section
    And I have picked a "<Game>" I wish to bet on
    When I place a "<BetAmount>" on a "<Team>" to win
    Then I am given the odds and returns

    Examples: 
      | Game                | BetAmount | Team     |
      | Slovakia vs England |      0.05 | Slovakia |
      
 #This test can be configured to run against any game, bet on any team for any value. Just adjust the fields 
 #Within the table to valid games
