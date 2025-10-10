package Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_Other_2 {
    public static void main(String[]args) {
        String inputItem = showInputDialog(null,
                "Write the price of the Item and to end the loop, select: 0");
        double priceItem = Double.parseDouble(inputItem);
        double totalPrice = 0;
        while (priceItem > 0 ){
            totalPrice += priceItem;
            inputItem = showInputDialog(null,
                    "Write the price of the Item and to end the loop, select: 0");
            priceItem = Double.parseDouble(inputItem);
        }
        double comission = totalPrice * 0.09;
        showMessageDialog(null,
                "The comission for the total cost of " +
                        totalPrice + " is " + comission + " kr.");
    }
}
