package ApiComponents.demo;

import javax.persistence.*;

@Entity
@Table(name = "film")
public class Film{
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