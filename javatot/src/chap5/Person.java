
package chap5;
// class members ada 2:1 property 2. method
public class Person {
   public String name;
   public int age;
   public String gender;
   //Encapsulation
   private String statusKahwin;
   //public interface
   private String getStatusKawin(String jenisOrang){
       if (jenisOrang.equals("kanak2")){
           return "Muda lagi";
       }else if (jenisOrang.equals("tansri")){
           return "Janda";
       }else{
           return "Bujang";
       }
       //return this.statusKahwin;
   }
      private getStatusKawin(){
          return this.statusKahwin;
    }

 public void walk(){
       
        }
   
   void talk(){
       
         }
   void sing(){
       
         }
}
