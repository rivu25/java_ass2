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
public class Student{
    private int roll_=-1;
    private String name_=null;
    private String stream_=null;
    private String admYear_=null;
    private int marks_=0;
    private College CInfo=null;
    
    public Student(){}
    public Student(College C, String name, int roll, String stream, String admYear, int marks){
        CInfo=C;
        roll_=roll;
        name_=name;
        stream_=stream;
        admYear_=admYear;
        marks_=marks;
    }

    public int getRoll_() {
        return roll_;
    }

    public String getName_() {
        return name_;
    }

    public String getStream_() {
        return stream_;
    }

    public String getAdmYear_() {
        return admYear_;
    }

    public int getMarks_() {
        return marks_;
    }

    public College getCInfo() {
        return CInfo;
    }
    

    @Override
    public String toString() {
        return "Student{" + "roll_=" + roll_ + "\n"+
                "name_=" + name_ + "\n"+
                "stream_=" + stream_ +"\n"+ 
                "admYear_=" + admYear_ + "\n"+
                "marks_=" + marks_ + "\n"+
                "College Id=" + CInfo.getColId_() +"\n"+
                "College name=" + CInfo.getColName_()+'}';
    }

    
    
}