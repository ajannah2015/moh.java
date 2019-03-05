
package chap5;

public class Array {
  public static void main(String[] args){
      //$people = [] //php
      //bil data dlm array = 3. fixed
      String [] people = new String [3];
      people [0] = "zana 0"; 
      people [1] = "zana 1"; 
      people [2] = "zana 2"; 
       //people [3] = "zana 4"; erorr
      System.out.println(people[2]);
      
    //int[] bil = new int -- x boleh
    Integer [] bil = new Integer[5];
    int[] jum = {1,2,3};  

    for (int i = 0; i<jum.length; i++){
        System.out.println(jum[i]);
        // for ($ i = 0; $i<count ($jum); Si++)
    }
  
    int j = 0;
    while (j < jum.length){
        //system.out.println(jum[j]);
        System.out.printf("Val = %s", jum[j]);
         j++;
    }
    
  }  
}