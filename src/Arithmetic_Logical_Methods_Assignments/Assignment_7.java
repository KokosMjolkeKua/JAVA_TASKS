package Arithmetic_Logical_Methods_Assignments;
import static javax.swing.JOptionPane.*;
public class Assignment_7 {
    public static void main(String[]args){
        String amountPizza = showInputDialog("How many Pizza`s do you have?");
        String amountPeople = showInputDialog("How many people are you?");
        String amountSlicesPerPizza = showInputDialog("How many slices are there per pizza?");

        int pizza, people, slicesPerPizza;
        try{
            pizza = Integer.parseInt(amountPizza);
            people = Integer.parseInt(amountPeople);
            slicesPerPizza = Integer.parseInt(amountSlicesPerPizza);
        } catch (Exception e){
            pizza = 0;
            people = 0;
            slicesPerPizza = 0;
            showMessageDialog(null, "Write whole numbers!");
        }
        int slicesPerPerson = (pizza * slicesPerPizza) / people;
        int pizzasLeft = (pizza * slicesPerPizza) % people;

        showMessageDialog(null, "When you have " + pizza + " pizzas" +
                "\nEvery person gets " + slicesPerPerson + " slices each." +
                "\nThere are then " + pizzasLeft + " slices left-over!");
    }
}
