package ApiComponents.demo;

import org.junit.jupiter.api.Assertions;

public class ActorTest{

    public void ActorNameTest(){
        Actor myTestActor = new Actor("Joseph", "Dixon");

        Assertions.assertEquals("Joseph", myTestActor.getFirstName(),"First names assigning incorrectly.");
    }
}
