package ApiComponents.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@ScenarioScope
public class SimGenStepDef {
    private String genre;

    @Autowired
    FilmRepo filmRepo;
    @Autowired
    CountryRepo countryRepo;
    @Autowired
    ActorRepo actorRepo;
    @Autowired
    MovieRecApplication movieRecApplication = new MovieRecApplication(actorRepo, filmRepo, countryRepo);
    private List<Film> films;
    @Given("a user has a favourite movie genre")
    public void a_user_has_a_favourite_movie_genre() {
        // Write code here that turns the phrase above into concrete actions
        genre = "Action";
    }
    @When("the program takes the users movie genre")
    public void the_program_takes_the_users_movie_genre() {
        films = movieRecApplication.getFilmByCategory(genre);
    }
    @Then("the program returns popular movies of the same genre")
    public void the_program_returns_popular_movies_of_the_same_genre() {
        Assertions.assertEquals(64,films.size(),"getFilmByCategory is working incorrectly");
        System.out.print(films);
    }
}
