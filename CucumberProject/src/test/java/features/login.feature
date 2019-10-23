Feature: Login feature

@reg @suite1 @all
Scenario Outline: Google search
Given a user has navigate to google.com
And user logs in using <Username> and <password>
Examples: 
|Username| password |
|User1   | pass1    |
|User2   | pass2    |
|User3   | pass3    |

@smk @suite2 @all
Scenario: test 2
Given I user has navigate to google.com
