package ApiComponents.demo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ActorTest{
    @Test
    public void testActorName(){
        Actor myTestActor = new Actor("Joseph", "Dixon");
        String actualName  = myTestActor.getFirstName();
        Assertions.assertEquals("Joseph", actualName,"First names assigning incorrectly.");
    }
}
