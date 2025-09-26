package Classes_Objects_Assignments;
import static javax.swing.JOptionPane.*;
class Person{
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public Person(String firstName, String lastName, String address, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getFirstName (){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName (){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getAddress (){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getPhoneNumber (){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void printPerson(){
        String out = "Name: " + firstName + " " + lastName + "\nAddress: " + address + "\nPhone-Number: " + phoneNumber;

        showMessageDialog(null, out);

    }
}
public class Assignment_6 {
    public static void main(String[]args){
        String firstName = showInputDialog("Write in your first name: ");
        String lastName = showInputDialog("Write in your last name: ");
        String address = showInputDialog("Write in your address: ");
        String phoneNumber = showInputDialog("Write in your Phone-Number: ");

        Person newPerson = new Person(firstName,lastName,address,phoneNumber);
        newPerson.printPerson();
    }
}
