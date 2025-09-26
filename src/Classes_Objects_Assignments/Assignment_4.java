package Classes_Objects_Assignments;
import static javax.swing.JOptionPane.*;

class personTwo{
    private String name;
    private String address;
    private String phoneNumber;
    private int yearOfBirth;

    public void getPersonTwo(){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

        name = showInputDialog("What is your name?");
        address = showInputDialog("What is your address?");
        phoneNumber = showInputDialog("What is your phone number?");
        yearOfBirth = Integer.parseInt(showInputDialog("What year where you born?"));
    }

    public void printPersonTwo(){
        int age = 2025 - yearOfBirth;
        showMessageDialog(null, "\nName: " + name + "\nAddress: " + address + "\nPhone-Number: " + phoneNumber + "\nAge: " + age);
    }
}


public class Assignment_4 {
    public static void main(String[]args){
        personTwo newPerson = new personTwo();
        newPerson.getPersonTwo();
        newPerson.printPersonTwo();
    }
}
