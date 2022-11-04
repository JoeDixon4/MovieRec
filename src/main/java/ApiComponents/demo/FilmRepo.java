package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepo extends JpaRepository<Film, Integer> {
    @Query(nativeQuery = true, value ="SELECT sakila.film.* FROM sakila.film INNER JOIN sakila.film_category ON sakila.film.film_id = sakila.film_category.film_id INNER JOIN sakila.category ON sakila.category.category_id = sakila.film_category.category_id WHERE category.name = ?1")
    List<Film> findByCategory(String category);

    @Query(nativeQuery = true, value = "SELECT sakila.film.* FROM sakila.film INNER JOIN sakila.film_actor ON sakila.film.film_id = sakila.film_actor.film_id INNER JOIN sakila.actor ON sakila.actor.actor_id = sakila.film_actor.actor_id WHERE actor.first_name = ?1")
    List<Film> findByActorFirstName(String name);

    @Query(nativeQuery = true, value = "SELECT sakila.film.* FROM sakila.film INNER JOIN sakila.film_actor ON sakila.film.film_id = sakila.film_actor.film_id INNER JOIN sakila.actor ON sakila.actor.actor_id = sakila.film_actor.actor_id WHERE actor.last_name = ?1")
    List<Film> findByActorLastName(String name);
}
