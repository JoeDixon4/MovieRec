package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepo extends JpaRepository<Film, Integer> {
    @Query(nativeQuery = true, value ="SELECT sakila.film.* FROM sakila.film INNER JOIN sakila.film_category ON sakila.film.film_id = sakila.film_category.film_id INNER JOIN sakila.category ON sakila.category.category_id = sakila.film_category.category_id WHERE category.name = ?1")
    List<Film> findByCategory(String category);
}
