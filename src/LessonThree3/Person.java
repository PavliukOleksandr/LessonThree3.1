package LessonThree3;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    int year = 2022;

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
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    Person(){}
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getAge(int birthYear){
        return year - birthYear;
    }
    public void input(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String output(String firstName, String lastName){
        return "Firstname: " + firstName + " Lastname: " + lastName;
    }
    public String changeName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
        return firstName + " " + lastName;
    }
}
