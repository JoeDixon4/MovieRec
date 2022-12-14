Feature: This feature will search for movies with the same genre.
  As a user, I would like to be able to choose a genre so that I can have movies of the genre recommended.

  Scenario: Successfully retrieving movies of the chosen genre.
    Given  a user has a favourite movie genre
    When  the program takes the users movie genre
    Then  the program returns popular movies of the same genre

