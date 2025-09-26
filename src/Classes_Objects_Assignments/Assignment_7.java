package Classes_Objects_Assignments;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class buyingGas{
    private String gasStation;
    private String typeOfGas;
    private double literFilled;
    private double pricePerLiter;
    private String timeFilled;

    public buyingGas(String gasStation, String typeOfGas, double literFilled, double pricePerLiter, String timeFilled){
        this.gasStation = gasStation;
        this.typeOfGas = typeOfGas;
        this.literFilled = literFilled;
        this.pricePerLiter = pricePerLiter;
        this.timeFilled = timeFilled;
    }

    public String getGasStation(){
        return gasStation;
    }
    public void setGasStation(String gasStation){
        this.gasStation = gasStation;
    }
    public String getTypeOfGas(){
        return typeOfGas;
    }
    public void setTypeOfGas(String typeOfGas){
        this.typeOfGas = typeOfGas;
    }
    public double getLiterFilled(){
        return literFilled;
    }
    public void setLiterFilled(double literFilled){
        this.literFilled = literFilled;
    }
    public double getPricePerLiter(){
        return pricePerLiter;
    }
    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }
    public String getTimeFilled() {
        return timeFilled;
    }
    public void setTimeFilled(String timeFilled){
        this.timeFilled = timeFilled;
    }

    public void printBuyingGas(){
        double totalPrice = literFilled * pricePerLiter;
        String twoDecimalsTotalPrice = String.format("%.2f", totalPrice);
        String out = "Gas-Station: " + gasStation + "\nType of Gas: " + typeOfGas +
                "\nLiter-Filled: " + literFilled + "\nPrice Per Liter: " + pricePerLiter +
                "\nTotal Price: " + twoDecimalsTotalPrice + "\nTime-Filled: " + timeFilled;

        showMessageDialog(null, out);

    }


}
public class Assignment_7 {
    public static void main(String[]args){
        String gasStation = showInputDialog("What is the name of the Gas-Station?");
        String typeOfGas = showInputDialog("What type of Gas is it?");
        double literFilled = Double.parseDouble(showInputDialog("How many liters did you fill?"));
        double pricePerLiter = Double.parseDouble(showInputDialog("What is the price per liter?"));
        String timeFilled = showInputDialog("At what time did you fill?");

        buyingGas newPerson = new buyingGas(gasStation, typeOfGas, literFilled, pricePerLiter, timeFilled);
        newPerson.printBuyingGas();
    }
}
