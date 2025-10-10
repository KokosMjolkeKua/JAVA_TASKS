package Control_Structure;

public class Assignment_13 {
    public static void main(String[]args){
        int sum = 0;
        int i = 0;
        while (i < 100){
            int pTall = i ++;
            sum += pTall;
            i ++;
            System.out.println(pTall);
        }
        System.out.println("Summen av alle tallene er: " + sum);
    }
}
