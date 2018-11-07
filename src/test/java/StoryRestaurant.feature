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
Feature: US_00 Donner nom du restaurant

	En tant que Manager 
	Je veux changer le nom de mon restaurant
	Afin d'identifier chacun de mes restaurants
	
  @tag1
  Scenario: Modification d'un nom de restaurant
    Given un restaurant existe
    When le manager change le nom du restaurant
    Then le nom du restaurant doit être automatiquement mis a jour

  @tag2
  Scenario: Creation d'un restaurant
    Given le manager souhaite creer un restaurant
    When le manager affecte un nom au restaurant
    Then le restaurant doit être créé avec le nom demandé

