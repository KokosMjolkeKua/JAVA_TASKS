package School_Projects.Assignments.Classes_Objects_Assignments;
class person{
    private String name;
    private String address;
    private String phoneNumber;
    private int yearOfBirth;

    public void getPerson(String name, String address, String phoneNumber, int yearOfBirth){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.yearOfBirth = yearOfBirth;
    }
    public void printPerson(){
        int age = 2025 - yearOfBirth;
        System.out.println("\nName: " + name + "\nAddress: " + address + "\nPhone-Number: " + phoneNumber + "\nAge: " + age);
    }
}
public class Assignment_3 {
    public static void main(String[]args){
        person newPerson = new person();
        newPerson.getPerson("Potato", "Potato Farm 23", "+3398877654", 1997);
        newPerson.printPerson();
    }
}
