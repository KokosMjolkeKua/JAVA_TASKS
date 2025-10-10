package Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_Other_1B {
    public static void main(String[]args){
        String innKm = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0");
        double antallKM = Double.parseDouble(innKm);

        String innLiter = showInputDialog("Skriv inn antall liter som ble brukt på turen:");
        double antallLiter = Double.parseDouble(innLiter);

        double totaltAntallKM = 0, totaltAntallLiter = 0;

        while (antallKM>0){
            totaltAntallKM += antallKM;
            totaltAntallLiter += antallLiter;

            innKm = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0");
            antallKM = Double.parseDouble(innKm);

            innLiter = showInputDialog("Skriv inn antall liter som ble brukt på turen:");
            antallLiter = Double.parseDouble(innLiter);
        }
        double gjennomsnitt = totaltAntallLiter / totaltAntallKM * 10;

        showMessageDialog(null,
                "Gjennomsnittelig forbruk pr mil er "+gjennomsnitt+" liter");

        String inKM, innLite;
        double antalKM, antalLiter;
        double totaltAntalLiter=0, totalKM=0;
        do{
            inKM = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0");
            antalKM = Double.parseDouble(inKM);
            innLite = showInputDialog("Skriv inn antall liter som er brukt på turen!");
            antalLiter = Double.parseDouble(innLite);
            totaltAntalLiter += antalLiter;
            totalKM += antallKM;
        }while (antalKM > 0);
        double snit = totaltAntalLiter / totalKM * 10;
        showMessageDialog(null, "Gjennomsnittlig forbruk pr mil er "+snit+" liter");
    }
}
