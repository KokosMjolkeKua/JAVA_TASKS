package School_Projects.Assignments.Arithmetic_Logical_Methods_Assignments;
import static javax.swing.JOptionPane.*;
public class Assignment_10 {
    public static void main(String[]args){
        String inputAge = showInputDialog("How old are you?");

        int age;
        try {
            age = Integer.parseInt(inputAge);
            if(age < 18){
                showMessageDialog(null, "You are not old enough to take your drivers license!");
            }
            if(age >= 18){
                showMessageDialog(null, "You are old enough to take your drivers license!");
            }
        } catch (Exception e){
            age = 0;
            showMessageDialog(null, "Write in a number!");
        }
    }
}
