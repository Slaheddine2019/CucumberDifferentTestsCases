@smoke-test
Feature: Je souhaite verifier la liste deroulante

  Background: 
    Given Je me connecte sur l application "https://demoqa.com/select-menu"
   

  @dropdownList
  Scenario: Je choisir la couleur bleue dans la liste deroulante
    Given Je clique sur la liste deroulante et je choisis la couleure bleue
    Then Je verifie le texte de la couleur choisis dans la liste
