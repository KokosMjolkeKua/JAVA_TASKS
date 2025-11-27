package School_Projects.Assignments.Control_Structure;
import static javax.swing.JOptionPane.*;
class Bil{
    String type;
    double gasTank;


    public Bil(String type, double gasTank){
        this.type = type;
        this.gasTank = gasTank;
    }

    public void printBil() {
        showMessageDialog(null,
                "Car-Type: " + type + "\nLiter of Gas: " + gasTank);
    }

    public boolean mileage() {
        double kmPerLiter = 12;
        double km = gasTank * kmPerLiter;
        double inputMileage = Double.parseDouble(showInputDialog(null,
                "How many kilometer do you need to go?"));
        if (km < inputMileage) {
                showMessageDialog(null, "You do not have enough gas to go " + inputMileage + " km.");
                return false;
            }
        if (km >= inputMileage) {
                double newMileage = (km - inputMileage)/12;
                showMessageDialog(null, "You have enough gas!");
                this.gasTank = newMileage;
                return true;
            }
        return false;
    }

}


public class Assignment_Other_1 {
    public static void main(String[]args){

        Bil car = new Bil("BMW", 20);
        car.printBil();
        car.mileage();
        car.printBil();
    }
}
