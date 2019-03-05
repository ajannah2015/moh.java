//
// 2.create object student 

package chap4;
//pass variable by val via references 
//primitive + string = passing by value
//object always passing by reference

public class Student {
  // step  1(1)
   void setName(String name){
       // nak print
       //akan print value azman
       name = name +" bin zakaria";
       System.out.println(name);
   }  
       void changeBookTitle (Book b) {
       b.title ="Java Advance";
   }

   // step 2 (1)
    public static void main(String[] args){
        //step 3 (2) 
        Student s1 = new Student();
        String nama = "azman";
        //ini passing  var by value original x berubah
        s1.setName(nama);
        System.out.println(nama);
        
        // passing by reference
        Book b1 = new Book();
            b1.title = "Java for Beginner";
            System.out.println(b1.title);   
            s1.changeBookTitle(b1);
            System.out.println(b1.title);
    }
}
