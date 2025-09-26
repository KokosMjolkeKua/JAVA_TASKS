package Arithmetic_Logical_Methods_Assignments;
import static javax.swing.JOptionPane.*;
public class Assignment_11 {
    public static void main(String[]args){
        String inputNumber = showInputDialog("Write a number between 0 and 1000");

        int number;
        try{
            number = Integer.parseInt(inputNumber);
            if (number < 0 && number > 1000){
                showMessageDialog(null, "You have to write a number between 0 and 1000");
            }
            if (number > 0 && number < 1000){
                int outNumber = number;
                int sum;
                int singleNumber;
                singleNumber = number % 10;
                sum = singleNumber;
                number = number / 10;
                singleNumber = number % 10;
                sum = singleNumber;
                number = number / 10;
                sum = number;

                showMessageDialog(null, "The Cross Sum of " + outNumber + ", is: " + sum);

            }
        } catch (Exception e){
            number = 0;
            showMessageDialog(null, "Write a number please");
        }
    }
}
