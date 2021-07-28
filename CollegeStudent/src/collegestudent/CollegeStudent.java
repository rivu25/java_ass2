/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegestudent;
import mypackage.*;
/**
 *
 * @author RIMI MONDAL
 */
public class CollegeStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        College[] c1 = {
                            new College("130","TMSL"),
                            new College("221", "BETHUNE")
                        };
       // System.out.println(c1[0]);
        Student[] S1= {
                          new Student(c1[0],"Rivu",10,"MCA","26/10/2020",100),
                          new Student(c1[0],"Pritam",10,"MCA","26/10/2020",100),
                          new Student(c1[1],"Tathagata",10,"MCA","26/10/2020",100),
                          new Student(c1[1],"Priyesh",10,"MCA","26/10/2020",100),
                          new Student(c1[0],"Rimi",1,"MCA","26/10/2020",200)
                        };
        int count=0;
        
        //System.out.println(S1[0]);
        for(int i=0; i<c1.length;i++){
            count=0;
            for(int j=0; j<S1.length; j++){
                if(c1[i].getColId_()==S1[j].getCInfo().getColId_()){
                    count++;
                }
            }//end of inner for loop
            System.out.println(c1[i].getColName_()+" has "+count+" students");
        }//end of outer for loop
//      

        for(int i=0;i<c1.length;i++){
            System.out.println("\n"+c1[i]);
            for(int j=0;j<S1.length;j++){
                if(c1[i].getColId_()==S1[j].getCInfo().getColId_()){
                    System.out.println(S1[j]);
                }
            }
            System.out.println("_______");
        }
    }
    
}