class StudentData
{
   private int stuID;
   private String stuName;
   private int stuAge;
    
     //Default constructor
   StudentData()
   {
       stuID = 100;
       stuName = "New Student";
       stuAge = 18;
   }
   StudentData(int num1, String str, int num2)
   {
       //Parameterized constructor
       stuID = num1;
       stuName = str;
       stuAge = num2;
   }
   //Getter and setter methods
    int getStuID() {
       return stuID;
   }
    void setStuID(int stuID) {
       this.stuID = stuID;
   }
    String getStuName() {
       return stuName;
   }
   void setStuName(String stuName) {
       this.stuName = stuName;
   }
    int getStuAge() {
       return stuAge;
   }
    void setStuAge(int stuAge) {
       this.stuAge = stuAge;
   }

   public static void main(String args[])
   {
       //This object creation would call the default constructor
       StudentData myobj = new StudentData();
       System.out.println("Student Name is: "+myobj.getStuName());
       System.out.println("Student Age is: "+myobj.getStuAge());
       System.out.println("Student ID is: "+myobj.getStuID());

       /*This object creation would call the parameterized
        * constructor StudentData(int, String, int)*/
       StudentData myobj2 = new StudentData(034, "Narayana", 22);
       System.out.println("Student Name is: "+myobj2.getStuName());
       System.out.println("Student Age is: "+myobj2.getStuAge());
       System.out.println("Student ID is: "+myobj2.getStuID()); 
  }
}