#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: US_01 Affecter un restaurant à un manager
	En tant que Manager
	Je veux être assigé à un restaurant
	Afin de pouvoir gerer le restaurant dans lequel je travaille 

  @tag1
  Scenario: Creation d'un nouveau Manager
    Given un nouveau manager est créé
    When un restaurant lui est affecté
    Then le restaurant du manager est celui demandé
    And la ville de l'adjoint correspond à la ville du restaurant correspondant

  @tag2
  Scenario: Modification du restaurant d'un manager
    Given un manager change d'affectation
    When   on change le restaurant du manager
    Then le nouveau restaurant du manager est enregistré et validé
    And la ville du manager est modifiée

    