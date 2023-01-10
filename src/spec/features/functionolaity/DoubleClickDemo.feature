@smoke-test
Feature: Je souhaite faire un double click sur une boutton

  Background: 
    Given Je me connecte sur l application "https://demoqa.com/buttons"
    

  @doubleClick
  Scenario: Je souhaite faire un double click
    And Je fais un double clique sur le bouton
    Then Je verifie le message text qui s affiche
