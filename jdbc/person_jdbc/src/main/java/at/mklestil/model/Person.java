package at.mklestil.model;

public class Person {

    private String firstName;
    private String lastName;
    private Integer age;

    public Person(){}
    public Person(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
