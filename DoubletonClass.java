
//Double Ton Class
class Sample2
{
        public static Sample2 obj;
        public static Sample2 obj1;
       private  Sample2()
      {

            System.out.println("constructor called");
       }
  
       public static Sample2  create()
      {
            if(obj==null){
           obj=new Sample2();
            return obj;
           }
             
         else  if(obj1==null){
           obj1=new Sample2();
            return obj1; 
          }
         else
              {
                   return obj;
              }
             
       }
}
 
 class Test
{
            public static void main(String[]args)
{
           Sample2 s1=Sample2.create();
           Sample2 s2=Sample2.create();
          System.out.println(s1==s2);
          Sample2 s3=Sample2.create();            
          System.out.println(s1==s3);
          System.out.println(s2==s3);              
}
}
        