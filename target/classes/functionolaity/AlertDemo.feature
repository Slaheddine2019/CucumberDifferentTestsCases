@smoke-test
Feature: Je souhaite accepter une alerte



  @alert
  Scenario: Je souhaite accepter une alerte
    Given Je me connecte sur l application "https://demoqa.com/alerts"
    When Je clique sur le bouton alert 
    And Je accepte alert
