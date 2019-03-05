package Chap22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
        
public class Film {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    protected void list (){
        //list all film tittle and descr
        //try..catch = exetion/err handling
        //code berada dlm try, catch bila berlaku err
        try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useLegacyDatetimeCode=false&serverTimezone=America/New_York","root","" );
           stmt = con.createStatement ();
           String sql ="SELECT * FROM film";
            rs = stmt.executeQuery(sql);
             while (rs.next()){
                 int id = rs.getInt("film_id");
                 System.out.print(id + "\t");
                 System.out.print(rs.getString("title") + "\t");
                      System.out.println(rs.getString("description"));
             }
        }catch (Exception e) {
            System.out.println("Berlaku erorr");
            System.out.print(e.getMessage());
              
        }
     
    }
    public static void main(String[]args){
        Film f = new Film();
        f. list();
        
    }
}

    

