package chap4;
/*
"this" kegunaan untuk set atau / get a property OR call / run a method 
i.e this.jumlah = 100;
*/

public class LoanCalculator extends Calculator {
    int jumlah = 0;//variable /properity
    //final - val ini tak boleh ditukar 
    final String tajuk = "LOAN CALCULATOR";
    
    //public void info(){
    
   // }
    //ini overide cetak() dalam parent @overicde  
    public void cetak(){
        //this.tajuk = "abc"; error, dah final tak boleh tukar
        
        System.out.println("cetak LoanCalculator");
    }
    int jumlah; //variable /property
    //ctrl +space = show auto suggestion 
    //taip psvm tab  auto gen pub satic void main () 
    public static void main(String[] args) {
          LoanCalculator cal = new LoanCalculator();
          cal.cetak();
          //shit +ctl copy code kebwh  bw arrow down 
          LoanCalculator cal2 = new LoanCalculator(1);
    }
    // constructor tiada return dan nama mesti sama dengan class
    //dlm satu class boleh ada mutple constructor
    //auto run bila create new obj
    //guna biasanya utuk initialize variable
    //mesti public
   LoanCalculator (){
       super();//run parent constructor
        System.out.println("I'm in constructor");
        
    }
   //constructor
    LoanCalculator(int amount) {
        this.jumlah = amount;//initialize value awalan 
           System.out.println("I'm in constructor 2");
    
    }
  //object orinted function = metod  
//mesti return int, void - no return
   private int calcLoanPayment(int amount, int numberOfMonths, String state){
        //your code goes here
        return 0;
          
    }
    
    //shift+alt +f auto arrange code
    //method overlading 
    private int calLoanPayment (int amout){
    return 0;
    }
}
