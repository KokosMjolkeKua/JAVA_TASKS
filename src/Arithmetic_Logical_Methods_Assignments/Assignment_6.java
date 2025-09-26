package Arithmetic_Logical_Methods_Assignments;
import static javax.swing.JOptionPane.*;
public class Assignment_6 {
    public static void main(String[]args){
        String inputUSD = showInputDialog("How many dollars do you have?");

        double USD;
        try{
            USD = Double.parseDouble(inputUSD);
        } catch (Exception e){
            USD = 0;
            showMessageDialog(null, "Write a number!");
        }

        double NOK = USD * 10.04;
        String twoDecimalsNOK = String.format("%.2f", NOK);

        showMessageDialog(null, "You have " + USD + " USD, when converted to NOK you get: " + twoDecimalsNOK + " kr.");
    }
}
