package ApiComponents.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "film")
public class Film{
    @ManyToMany
    @JoinTable(
            name = "film_category",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    Set<Category> filmCategory;

    public Set<Category> getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(Set<Category> filmCategory) {
        this.filmCategory = filmCategory;
    }

    //Attributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmId;

    @Column(name = "title")
    String filmTitle;

    @Column(name = "description")
    String description;

    @Column(name = "release_year")
    int releaseYear;

    @Column(name = "length")
    int filmLength;

    @Column(name = "rating")
    String rating;

    @Column(name = "special_features")
    String specialFeatures;

    //Constructor
    public Film(String myTitle) {
        this.filmTitle = myTitle;
    }

    public Film() {

    }

    //Methods
    public int getFilmId() {
        return filmId;
    }
    public void setFilmId(int myFilmId) {
        this.filmId = myFilmId;
    }
    public String getFilmTitle() {
        return filmTitle;
    }
    public void setFilmTitle(String myTitle) {
        this.filmTitle = myTitle;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String myDescription) {
        this.description = myDescription;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int myReleaseYear) {
        this.releaseYear = myReleaseYear;
    }
    public int getFilmLength() {
        return filmLength;
    }
    public void setFilmLength(int myFilmLength) {
        this.filmLength = myFilmLength;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String myRating) {
        this.rating = myRating;
    }
    public String getSpecialFeatures() {
        return specialFeatures;
    }
    public void setSpecialFeatures(String mySpecialFeatures) {
        this.specialFeatures = mySpecialFeatures;
    }
}