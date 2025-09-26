package Classes_Objects_Assignments;
class Calculator{
    private double inputNumber1;
    private double inputNumber2;

    public void numberInput(double inputNumber1, double inputNumber2){
        this.inputNumber1 = inputNumber1;
        this.inputNumber2 = inputNumber2;
    }

    public void subtract(){
        double subtract = inputNumber1 - inputNumber2;
        String subtractTwoDecimals = String.format("%.2f", subtract);
        System.out.println("When subtracting " + inputNumber1 + " and " + inputNumber2 + " you get " + subtractTwoDecimals + ".");
    }
    public void divide(){
        double divide = inputNumber1 / inputNumber2;
        String divideTwoDecimals = String.format("%.2f", divide);
        System.out.println("When subtracting " + inputNumber1 + " and " + inputNumber2 + " you get " + divideTwoDecimals + ".");
    }
    public void add(){
        double add = inputNumber1 * inputNumber2;
        String addTwoDecimals = String.format("%.2f", add);
        System.out.println("When subtracting " + inputNumber1 + " and " + inputNumber2 + " you get " + addTwoDecimals + ".");
    }
    public void multiply(){
        double multiply = inputNumber1 + inputNumber2;
        String multiplyTwoDecimals = String.format("%.2f", multiply);
        System.out.println("When subtracting " + inputNumber1 + " and " + inputNumber2 + " you get " + multiplyTwoDecimals + ".");
    }
}
public class Assignment_5 {
    public static void main(String[]args){
        Calculator newCal = new Calculator();
        newCal.numberInput(65.5, 67.5);
        newCal.add();
        newCal.multiply();
        newCal.subtract();
        newCal.divide();

    }
}
