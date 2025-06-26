package at.mklestil.model;

public class Person {

    private String firstName;
    private String lastName;
    private Integer age;

    public Person(){}

    public Person(String firstNamejohn, String lastName, int i) {
        this.firstName = firstNamejohn;
        this.lastName = lastName;
        age = i;
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

    public Integer getAge() {
        return age;
    }
}
