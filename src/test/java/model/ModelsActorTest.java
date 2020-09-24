package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true,
         value = {"pageable", "sort"})
public class ModelsActorTest {

    String firstName;
    String lastName;
    Integer id;

    public ModelsActorTest() {
    }

    public ModelsActorTest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public ModelsActorTest(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String toString() {
        return "The actor id is: "+ this.id +" and the first name is: " + this.firstName + " " + ", and the last name is: " + this.lastName + ".";
    }
}
