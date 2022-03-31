public class student{
 public static int internalmarks1, internalmarks2,internalmarks3;
 public static String name,registernumber;
 int marks;
 int marks2;
 int marks3;
 String number;
 String spelling;
;
 student(){
 name="Ashish";
 registernumber="21BCE8425";
 internalmarks1 = 87;
 internalmarks2=45;
 internalmarks3=78;
 }
 student(String string,String string2,int num3,int i,int j){
 name=string;
 registernumber=string2;
 internalmarks1=num3;
 internalmarks2=i;
 internalmarks3=j;   
     
 }
 public int getinternalmarks1() {
       return internalmarks1;
   }
   public void setinternalmarks1(int marks) {
       this.marks= marks;
   }
   public int getinternalmarks2() {
       return internalmarks2;
   }
   public void setinternalmarks2(int marks2) {
   }
   public int getinternalmarks3() {
       return internalmarks3;
   }
   public void setinternalmarks3(int marks3) {
       this.marks3 = marks3;
   }
   public String getregisternumber() {
       return registernumber;
   }
   public void setregisternumber(String number) {
       this.number = number;
   }
   public String getname() {
       return name;
   }
   public void setname(String spelling) {
       this.spelling = spelling;
   }
   public static void main(String args[])
   {
       
       student myobj = new student();
       System.out.println("Student Name is: "+myobj.getname());
       System.out.println("Student register number is: "+myobj.getregisternumber());
       System.out.println("Student internalmarks1: "+myobj.getinternalmarks1());
       System.out.println("Student internalmarks2: "+myobj.getinternalmarks2());
       System.out.println("Student internalmarks3: "+myobj.getinternalmarks3());

       
       student myobj2 = new student("Sahil","21BCEXYSD",98,67,38);
       System.out.println("Student Name is: "+myobj2.getname());
       System.out.println("Student register number is: "+myobj.getregisternumber());
       System.out.println("Student internalmarks1: "+myobj2.getinternalmarks1());
       System.out.println("Student internalmarks2: "+myobj2.getinternalmarks2());
       System.out.println("Student internalmarks3: "+myobj2.getinternalmarks3()); 
  }
}
