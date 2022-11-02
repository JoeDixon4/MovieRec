package ApiComponents.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin
public class MovieRecApplication {

	@Autowired
	private ActorRepo actorRepo;
	private FilmRepo filmRepo;
	private CountryRepo countryRepo;

	public MovieRecApplication(ActorRepo myActorRepo, FilmRepo myFilmRepo, CountryRepo myCountryRepo){
		this.actorRepo = myActorRepo;
		this.filmRepo = myFilmRepo;
		this.countryRepo = myCountryRepo;
	}
	public static void main(String[] args) {
		SpringApplication.run(MovieRecApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepo.findAll();
	}

	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepo.findAll();
	}

	@GetMapping("/allCountries")
	public @ResponseBody
	Iterable<Country> getAllCountries(){return countryRepo.findAll();}

//	@GetMapping("/category/{myCategory}")
//	public @ResponseBody
//	List<Film> getFilmByCategory(@PathVariable(value = "myCategory") String category){
//		return filmRepo.findByCategory(name);
//	}

	@PostMapping("/newActor")
	public void createActor(@RequestBody Actor actor) {
		actorRepo.save(actor);
	}
}