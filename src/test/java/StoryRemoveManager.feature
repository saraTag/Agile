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
Feature: US_02 
	En tant que directeur du restaurant
	Je veux pouvoir enlever un manager du restaurant
	Afin ne plus autoriser les opérations à un manager qui ne travaille plus dans le restaurant 

  @tag1
  Scenario: Enlever un manager du restaurant
    Given un manager travaille dans un restaurant
    When on supprime le manager du restaurant
    Then valider que le manager n'apparait plus dans la liste des adjoints du rerstaurant
