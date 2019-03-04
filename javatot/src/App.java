//main () berada satu class khusus yg akan 
//guna class class yg lain 

public class App {
    //entry point 
    public static void main(String[] args) {
        //create object 
        Car ferrari  = new Car ();
        ferrari.numOfDoors = 2;
        ferrari.color = "red";//mesti "" x boleh
        //'' hanya utuk char shj
        ferrari.prnt();
        ferrari.startEngine();
        Car porrsche = new Car ();
        
    }
    
}
