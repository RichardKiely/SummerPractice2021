package Labsheet6.exercise1;

public class Person {
    private String firstName;
    private String lastName;

    public Person() {
        this("Not Supplied","Not Supplied");
    }

    public Person(String firstName, String lastName) {
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

    @Override
    public String toString() {
        return "First Name: " + getFirstName() +
                " Last Name: " + getLastName();
    }
}
