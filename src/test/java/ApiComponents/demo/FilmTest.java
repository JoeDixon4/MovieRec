package ApiComponents.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FilmTest {
    Film myTestFilm = new Film("Shawshank Redemption");
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
}