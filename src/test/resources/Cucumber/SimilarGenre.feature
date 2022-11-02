Feature: This feature will search for similar genres of a chosen movie.
  As a user, I would like to be able to choose a genre so that I can have movies of the genre recommended.

  Scenario: Successfully retrieving movies of the chosen genre.
    Given  a users favourite movie genre
    When  the user searches for the genre
    Then  the program returns popular movies of the same genre

