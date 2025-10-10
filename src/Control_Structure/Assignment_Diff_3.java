package Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_Diff_3 {
    public static void main(String[]args){
        int n = Integer.parseInt(showInputDialog(null, "Write a whole number: "));
        int c = 0;
        String primeNr = " is a Prime Number.";
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                c++;
            }
            if (c > 2){
                primeNr = " is not a Prime Number.";
                break;
            }
        }
        showMessageDialog(null, "The Number " + n + primeNr);
    }
}
