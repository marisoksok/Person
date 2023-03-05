package lesson03;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Person sarah= new Person();
        sarah.setFirstName("Sarah");
        sarah.setLastname("Thompson");
        sarah.setYearOfBirth(1995);
        sarah.getName();
        System.out.println("The name is: "+sarah.getName()+", and the first and last names are: "+sarah.constructName());
        System.out.println("______________ Another person ______________");

        Person fred=new Person("Fred",55);
        fred.setYearOfBirth(1998);
        fred.setFirstName("Fred");
        fred.setPhoneNumber(234123678);
        System.out.println("Fred is "+fred.getAge()+" years old");
        System.out.println(fred.toString());


        try {
            //create output file and assign stream
            FileOutputStream fileOut =
                    new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            //write an object
            out.writeObject(fred);
            //close the output file and stream
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in person.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }




        //deserialization

        Person e = null;
        try {
            //create output file and assign stream to read from
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            //read the object
            e = (Person) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Person class not found");
            c.printStackTrace();
            return;
        }
        System.out.println();
        System.out.println("Deserialized person...");
        System.out.println("Name: " + e.getFirstName());
        System.out.println("Last Name: " + e.getLastname());

    }
}
