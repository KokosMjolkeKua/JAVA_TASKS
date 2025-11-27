package School_Projects.Assignments.Control_Structure;

public class Assignment_9 {
    public static void main(String[]args){
        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            int pTall = i++;
            System.out.println(pTall);
            sum += pTall;
        }
        System.out.println("Summen av partallene mellom 0 og 20 er: " + sum);
    }
}
