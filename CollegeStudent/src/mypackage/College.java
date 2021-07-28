/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;
/**
 *
 * @author RIMI MONDAL
 */
public class College {
    private String colId_= null;
    private String colName_= null;
    //private ArrayList<Student> students_= new ArrayList<Student>();
    public College(){}
    public College(String colId,String colName){
        colId_=colId;
        colName_=colName;
    }
    
    public String getColId_(){
        return colId_;
    }
    public String getColName_(){
        return colName_;
    }

    @Override
    public String toString() {
        return "College{" + "colId_=" + colId_ + ", colName_=" + colName_ + '}';
    }

   
}