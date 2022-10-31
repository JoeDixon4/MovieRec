package ApiComponents.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FilmTest {
    Film myTestFilm = new Film("Shawshank Redemption");
    Film myEmptyFilm = new Film();
    @Test
    public void testGetFilmTitle(){
        Assertions.assertEquals("Shawshank Redemption",myTestFilm.getFilmTitle(),"Get film title is working incorrectly");
    }
    @Test
    public void testSetFilmTitle(){
        myTestFilm.setFilmTitle("Lambshank Redemption");
        Assertions.assertEquals("Lambshank Redemption", myTestFilm.getFilmTitle(),"Set film title is working incorrectly");
    }
    @Test
    public void testGetFilmId(){
        myTestFilm.setFilmId(1);
        Assertions.assertEquals(1,myTestFilm.getFilmId(),"Getting or setting film id are working incorrectly.");

        myTestFilm.setFilmId(2);
        Assertions.assertEquals(2,myTestFilm.getFilmId(),"Getting or setting film id are working incorrectly.");
    }
    @Test
    public void testGetDescription(){
        myTestFilm.setDescription("A story of two men finding unexpected companionship in prison");
        Assertions.assertEquals("A story of two men finding unexpected companionship in prison",myTestFilm.getDescription(),"Getting or setting description are working incorrectly.");

        myTestFilm.setDescription("A story of two young sheep finding unexpected gravy on a roast dinner");
        Assertions.assertEquals("A story of two young sheep finding unexpected gravy on a roast dinner",myTestFilm.getDescription(),"Getting or setting description are working incorrectly.");
    }
    @Test
    public void testGetReleaseYear(){
        myTestFilm.setReleaseYear(1986);
        Assertions.assertEquals(1986,myTestFilm.getReleaseYear(),"Getting or setting Release Year are working incorrectly.");

        myTestFilm.setReleaseYear(2011);
        Assertions.assertEquals(2011,myTestFilm.getReleaseYear(),"Getting or setting Release Year are working incorrectly.");
    }
    @Test
    public void testGetFilmLength(){
        myTestFilm.setFilmLength(1);
        Assertions.assertEquals(1,myTestFilm.getFilmLength(),"Getting or setting film id are working incorrectly.");

        myTestFilm.setFilmLength(2);
        Assertions.assertEquals(2,myTestFilm.getFilmLength(),"Getting or setting film id are working incorrectly.");
    }
    @Test
    public void testGetRating(){
        myTestFilm.setRating("PG");
        Assertions.assertEquals("PG",myTestFilm.getRating(),"Getting or setting rating are working incorrectly.");

        myTestFilm.setRating("U");
        Assertions.assertEquals("U",myTestFilm.getRating(),"Getting or setting rating are working incorrectly.");
    }
    @Test
    public void testGetSpecialFeatures(){
        myTestFilm.setSpecialFeatures("Deleted Scenes");
        Assertions.assertEquals("Deleted Scenes",myTestFilm.getSpecialFeatures(),"Getting or setting special features are working incorrectly.");

        myTestFilm.setSpecialFeatures("Director's cut");
        Assertions.assertEquals("Director's Cut",myTestFilm.getSpecialFeatures(),"Getting or setting special features are working incorrectly.");
    }
}