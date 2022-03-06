# Autor: Wilmer Juseth Mendoza Garzon

@storiesUtest
Feature: Utest
  As a new user, I want to register on the Utest page
  @scenario1
  Scenario: New User Registration
    Given that Jose wants to be able to access tester jobs
    When he fills in the form for the creation of a new user
      | firts_name | last_name | email |
      | Jose       | Mendoza   | Jose@gmail.com |
    Then access the Utest platform


