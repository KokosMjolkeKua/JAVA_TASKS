package Classes_Objects_Assignments;
class Books{
    private String name;
    private String title;
    private String iSBN;
    private String author;

    public void getBook(String name, String title, String iSBN, String author){
        this.name = name;
        this.title = title;
        this.iSBN = iSBN;
        this.author = author;

    }
    public void printBook(){

        System.out.println("\nName: " + name);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("iSBN: " + iSBN);
    }
}
public class Assignment_1 {
    public static void main(String[]args){
        Books newBook = new Books();
        newBook.getBook("Hunger-Games", "Riders of the Storm", "245356176", "JK-LOL");
        newBook.printBook();

    }
}
