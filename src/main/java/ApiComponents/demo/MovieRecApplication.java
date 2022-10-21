package ApiComponents.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin
public class MovieRecApplication {

	@Autowired
	private ActorRepo actorRepo;
	private FilmRepo filmRepo;

	public MovieRecApplication(ActorRepo myActorRepo){
		this.actorRepo = myActorRepo;
	}
	public MovieRecApplication(FilmRepo myFilmRepo){
		this.filmRepo = myFilmRepo;
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

}
