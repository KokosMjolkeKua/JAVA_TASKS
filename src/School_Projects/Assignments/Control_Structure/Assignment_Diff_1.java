package School_Projects.Assignments.Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_Diff_1 {
    public static void main(String[]args){
        int nr = Integer.parseInt(showInputDialog(null, "Write a whole number: "));
        double pi = 4;
        try{

            int first = -1;
            for (long i = 3; i < nr; i += 2){
                pi += first * (4/(double)i);
                first = -first;
            }
        } catch (Exception e){
            nr = 0;
            showMessageDialog(null, "Write a whole number.");
        }
        showMessageDialog(null, "PI should be 3.14159265358." + "\nIt is: " + pi);
    }
}
