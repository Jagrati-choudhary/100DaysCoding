
//Single Ton  Class
class Sample1
{
        public static Sample1 obj;
         private  Sample1()
      {

            System.out.println("constructor called");
       }
  
       public static Sample1  create()
      {
            if(obj==null)
           obj=new Sample1();
            return obj;
       }
}
 
 class Test
{
            public static void main(String[]args)
{
           Sample1 s1=Sample1.create();
           Sample1 s2=Sample1.create();
             System.out.println(s1==s2);
}
}
        