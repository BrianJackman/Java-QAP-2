/* 
Java QAP 2 
By: Brian Jackman
2024/10/08
 */

public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    // Constructor
    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    // toString method
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + home;
    }
}