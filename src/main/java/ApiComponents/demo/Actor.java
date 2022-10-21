package ApiComponents.demo;

import javax.persistence.*;

@Entity
@Table(name = "actor")
public class Actor {
    //Attributes
    @Id
    @Column(name ="actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorId;

    @Column(name = "first_name")
    String actorFirstName;

    @Column(name = "last_name")
    String actorLastName;

    //Constructor
    public Actor(String myFirstName,String myLastName) {
        this.actorFirstName = myFirstName;
        this.actorLastName = myLastName;
    }
    public Actor(){

    }
    //Methods
    public String getFirstName(){
        return actorFirstName;
    }
    public void setFirstName(String myFirstName){
        actorFirstName = myFirstName;
    }
    public String getLastName(){
        return actorLastName;
    }
    public void setLastName(String myLastName){
        actorLastName = myLastName;
    }
    public int getActorId(){
        return actorId;
    }
    public void setActorId(int myId){
        actorId = myId;
    }
}
