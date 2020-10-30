package Student20;

public class Student20 {
    private String firstName;
    private String lastName;
    private int age;
    private String city;


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student20(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;

    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {

        return this.city;
    }


}
