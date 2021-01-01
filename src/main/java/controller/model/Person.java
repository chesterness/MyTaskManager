package controller.model;

public class Person {

    //fields
    private String firstName;
    private String lastName;
    private String age;

    //constructor
    public Person(String firstName, String lastName, String age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getAge() { return age; }

    //setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(String age) { this.age = age; }
}
