Feature: changement format planete


  Scenario: une planete peut perdre une grande partie de sa masse qui deviendra satellite
    Given Quand l'age d'une planete atteint 100 million d'année de vie
    Then formation d'un sattelite et changement de la planete mere