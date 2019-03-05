package chap4;

/**
 discuss on "static" keyword 
 * apply to variable and method
 * shared 
 */
public class Book {
    static int bil = 0; // shared by all obj and own by class
    String title;
    
    //own by class buku bukan obj buku 
    public static void cetak(){
        System.out.println("Bil buku = " + Book.bil);
         
    }
    
    Book() {
        Book.bil = Book.bil + 1;
        System.out.println("Bil buku = "+ Book.bil);
        
        
    }
    //static x boleh guna this
    public static void main(String[] args) {
        Book b1 = new Book(); //obj
        Book b2 = new Book();  //obj
        Book.cetak();
    }
}
