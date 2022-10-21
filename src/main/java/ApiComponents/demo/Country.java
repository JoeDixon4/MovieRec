package ApiComponents.demo;

import javax.persistence.*;

@Entity
@Table(name = "country")
public class Country {
    //Attributes
    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int countryId;

    @Column(name = "country")
    String countryName;

    //Constructor
    public Country(String myCountryName) {
        this.countryName = myCountryName;
    }

    public Country() {

    }
    //Methods

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String myCountryName) {
        countryName = myCountryName;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int myId) {
        countryId = myId;
    }
}