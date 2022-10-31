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
}