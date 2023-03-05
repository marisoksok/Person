package lesson03;
import java.util.Date;
import java.io.Serializable;



public class Person implements Serializable {
    //1. Attributes
    private String name;
    String firstName;
    String lastname;
      int age;
      int phoneNumber;
      int yearOfBirth;

    //2. Constructors
   //2.1 Constructor that asks for the age

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){
        System.out.println("simple constructor");
    }

    Person(int age){
        this.age=age;
        System.out.println("Constructor with age");
    }

    //3. Methods
    //set a name
   /* void setName(String name){
        this.name=name;
    }*/

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //set an age
    void setAge(int age){
        this.age=age;
    }

    public void setPhoneNumber(int phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        Date date = new Date();
        this.age=date.getYear()+1900-this.yearOfBirth;
        System.out.println("Recalculated the age: "+this.age);
    }
    //get methods for name and for age

    String getName(){
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    int getAge(){
        return age;
   }

    public String toString(){
        return "Person "+this.firstName+" , age: "+this.age+" and the phone number: "+this.phoneNumber+".";
    }

    //constructName method that makes name as a concatenation of the two others
    public String constructName(){
        return this.getFirstName()+" "+this.getLastname();
    }

}
