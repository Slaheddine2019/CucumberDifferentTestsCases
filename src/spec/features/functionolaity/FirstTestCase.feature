@smoke-test
Feature: Je souhaite coonecter a l application

  Background: 
    Given Je me connecte sur l application "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
  

  @firstTestCase
  Scenario: Je souhaite me connecter sur l application e commerce
    Given Je saisis le username "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

