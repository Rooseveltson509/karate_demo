@update
Feature: Update user profile
  Background:
    * url baseUrl
    * header Accept = 'application/json'
    #* def expectedOutput = read("output.json")
    * def myFeature = call read('createUser.feature')
    * def res = myFeature.response

  Scenario: Update user from PUT method
    Given path '/users'
    And match res.name != null
    And set res.job = 'Automation'
    And set res.name = 'RooseZenity'
    And request res
    When method PUT
    Then status 200
    And assert response.name == 'RooseZenity'
    And print response