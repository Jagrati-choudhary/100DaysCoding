// Triple Ton Class

class Sample3
{
        public static Sample3 obj;
        public static Sample3 obj1;
        public static Sample3 obj2;
       private  Sample3()
      {
            System.out.println("constructor called");
       }
       public static Sample3  create()
      {
            if(obj==null){
           obj=new Sample3();
            return obj;
           }
             
         else  if(obj1==null){
           obj1=new Sample3();
            return obj1; 
          }
         else if(obj2==null)
              {
                   obj2=new Sample3();
                   return obj2;
              }
           else
                   {
                     return obj;                  }
             
       }
}
 
 class Test
{
            public static void main(String[]args)
{
           Sample3 s1=Sample3.create();
           Sample3 s2=Sample3.create();
          Sample3 s3=Sample3.create(); 

           System.out.println(s1==s2);           
          System.out.println(s1==s3);
          System.out.println(s2==s3); 

          Sample3 s4=Sample3.create(); 
            System.out.println(s1==s4);           
          System.out.println(s2==s4);
          System.out.println(s3==s4); 
                       
}
}
        