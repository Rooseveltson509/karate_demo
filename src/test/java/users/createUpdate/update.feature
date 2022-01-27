@update
Feature: Update user profile
  Background:
    * url baseUrl
    * header Accept = 'application/json'
    * def expectedOutput = read("post.json")

  Scenario: Update user from PUT method
    Given path '/users'
    And def reqBody = expectedOutput
    And set reqBody.job = 'Automation'
    And set reqBody.name = 'RooseZenity'
    And request reqBody
    When method PUT
    Then status 200
    And assert response.name == 'RooseZenity'
    And print response