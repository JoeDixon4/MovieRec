package ApiComponents.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

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

	@GetMapping("/filmCategory/{myCategory}")
	public @ResponseBody
	List<Film> getFilmByCategory(@PathVariable(value = "myCategory") String category){
		return filmRepo.findByCategory(category);
	}
	@GetMapping("/filmActorFirstName/{myName}")
	public @ResponseBody
	List<Film> getFilmByActorFirstName(@PathVariable(value = "myName") String name){
		return filmRepo.findByActorFirstName(name);
	}
	@GetMapping("/filmActorLastName/{myName}")
	public @ResponseBody
	List<Film> getFilmByActorLastName(@PathVariable(value = "myName") String name){
		return filmRepo.findByActorLastName(name);
	}

	@PostMapping("/newActor")
	public void createActor(@RequestBody Actor actor) {
		actorRepo.save(actor);
	}

	@PutMapping("/updateActor/{id}")
	public void updateActor(@PathVariable(value = "id") int id, @RequestBody Actor actorDetails){
		Actor updateActor = actorRepo.findById(id)
						.orElseThrow(() -> new ResourceAccessException("Actor does not exist with id: " + id));

		updateActor.setFirstName(actorDetails.getFirstName());
		updateActor.setLastName(actorDetails.getLastName());

		actorRepo.save(updateActor);
	}

	@DeleteMapping("/deleteActor/{id}")
	public void deleteActor(@PathVariable(value = "id") int actorId)
		throws ResourceAccessException  {
			Actor actor = actorRepo.findById(actorId)
					.orElseThrow(() -> new ResourceAccessException("Actor not found for this id: " + actorId));

			actorRepo.delete(actor);
	}
}