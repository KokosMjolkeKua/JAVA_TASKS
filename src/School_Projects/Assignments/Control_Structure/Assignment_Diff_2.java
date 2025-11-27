package School_Projects.Assignments.Control_Structure;

public class Assignment_Diff_2 {
    public static void main(String[]args){
        int n = 100;
        int i = 0;
        while (i <= n){
            int c = 0;
            for (int j = 1; j < n; j++){
                if (i % j == 0){
                    c++;
                }
            }
            if (c == 2){
                System.out.println( " " + i);
            }
            i++;
        }
    }
}
