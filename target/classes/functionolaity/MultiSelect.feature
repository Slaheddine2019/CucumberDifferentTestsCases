@smoke-test
Feature: Je souhaite faire un multy select et deselectionner

  Background: 
    Given Je me connecte sur l application "https://demoqa.com/select-menu"

  @multiSelect
  Scenario: Je souhaite me connecter sur l application
    Given Je selectionne tous les options
    And je deselectionne tous les options
