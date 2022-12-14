package ApiComponents.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ActorTest{
    Actor myTestActor = new Actor("Joseph", "Dixon");
    Actor myEmptyActor = new Actor();
    @Test
    public void testGetFirstActorName(){
        String actualName  = myTestActor.getFirstName();
        Assertions.assertEquals("Joseph", actualName,"First names are getting incorrectly.");
    }
    @Test
    public void testGetLastActorName(){
        String actualName  = myTestActor.getLastName();
        Assertions.assertEquals("Dixon", actualName,"Last names are getting incorrectly.");
    }
    @Test
    public void testSetFirstActorName(){
        myTestActor.setFirstName("Ryan");
        String actualName = myTestActor.getFirstName();
        Assertions.assertEquals("Ryan", actualName, "First names are setting incorrectly");
    }
    @Test
    public void testSetLastActorName(){
        myTestActor.setLastName("Garrett");
        String actualName = myTestActor.getLastName();
        Assertions.assertEquals("Garrett", actualName, "Last names are setting incorrectly");
    }
    @Test
    public void testGetActorId(){
        myTestActor.setActorId(1);
        Assertions.assertEquals(1,myTestActor.getActorId(),"Getting ID's are working incorrectly");

        myTestActor.setActorId(2);
        Assertions.assertEquals(2,myTestActor.getActorId(),"Setting ID's are working incorrectly");
    }
}
