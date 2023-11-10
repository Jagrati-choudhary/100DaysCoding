package com.batch1.java;
import com.org.java.SampleBean;
class Package1
{
public static void main(String[]args)
{

SampleBean s1=new SampleBean();
s1.setRollNo(101);
s1.setStudentName("Rahul");
s1.setPass(true);
s1.setMobileNumber(9009009009L);

System.out.println(s1.getRollNo());
System.out.println(s1.getStudentName());
System.out.println(s1.getPass());
System.out.println(s1.getMobileNumber());


}
}