@smoke-test
Feature: Je souhaite acceder a la page aleatoire et verifier les elements

  Background: 
    Given Je me connecte sur l application "http://www.bouletcorp.com"
    

  @bouletcorp
  Scenario: Je souhaite verifer l affichage de la page aleatoire et les t les widgets facebook  twitter et tumblr sont bien affiches
    And Je clique sur le link aleatoire
    Then Je verifie que la page a changee
    Then Je verifie les widgets facebook, twitter et tumblr sont bien affiches
