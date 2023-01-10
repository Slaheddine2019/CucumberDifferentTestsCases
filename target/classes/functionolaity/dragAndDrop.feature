@smoke-test
Feature: Je souhaite faire un double click sur une boutton

  Background: 
    Given Je me connecte sur l application "https://demoqa.com/droppable/"
   

  @dragAndDrop
  Scenario: Je souhaite deplacer le dossier drap me au fichier Drop here
    Given Je deplace le fichier drap me au fichier drop here
    Then Je verifie le message text qui s affiche dans drop here
