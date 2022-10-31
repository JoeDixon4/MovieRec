package ApiComponents.demo;
import ApiComponents.demo.Actor;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ActorTest{
    Actor myTestActor = new Actor("Joseph", "Dixon");
    @Test
    public void testFirstActorName(){
        String actualName  = myTestActor.getFirstName();
        Assertions.assertEquals("Joseph", actualName,"First names assigning incorrectly.");
    }
    @Test
    public void testLastActorName(){
        String actualName  = myTestActor.getLastName();
        Assertions.assertEquals("Dixon", actualName,"Last names assigning incorrectly.");
    }
}
