package com.org.java;
 public class SampleBean
{


private int rollNo;
private String studentName;
private boolean pass;
private long mobileNumber;

public static void main(String[]args){
}

public void setRollNo(int RollNo){
this.rollNo=RollNo;
}
public void setStudentName(String StudentName){
this.studentName=StudentName;
}
public void setPass(boolean Pass){
this.pass=Pass;
}
public void setMobileNumber(long MobileNumber){
this.mobileNumber=MobileNumber;
}

public int getRollNo(){
return this.rollNo;
}
public String getStudentName(){
return this.studentName;
}
public boolean getPass(){
return this.pass;
}
public long getMobileNumber(){
return this.mobileNumber;
}
}



