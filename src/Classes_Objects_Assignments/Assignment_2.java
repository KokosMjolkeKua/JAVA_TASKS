package Classes_Objects_Assignments;
import static javax.swing.JOptionPane.*;
class booksTwo{
    private String name;
    private String price;
    private String author;
    private String iSBN;

    public void getBookTwo(){
        this.name = name;
        this.price = price;
        this.author = author;
        this.iSBN = iSBN;

        name = showInputDialog("What is the name of the Book?");
        author = showInputDialog("Who is the author?");
        price = showInputDialog("What is the price of the book?");
        iSBN = showInputDialog("What is the iSBN?");
    }
    public void printBookTwo(){
        showMessageDialog(null, "\nName: " + name + "\nAuthor: " + author + "\nPrice: " + price + "\niSBN: " + iSBN);
    }
}
public class Assignment_2 {
    public static void main(String[]args){
        booksTwo bookTwo = new booksTwo();
        bookTwo.getBookTwo();
        bookTwo.printBookTwo();
    }
}
