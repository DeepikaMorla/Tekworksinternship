interface Student
  {
    void details();
    void marks();
  }
class StudentInfo implements Student
  {
    public void details()
    {
      String name="chintu";
      System.out.println("Student name:"+name);
      int rollno=21;
      System.out.println("Student roll no:"+rollno);
      String address="Vijayawada";
      System.out.println("Student address:"+address);
    }
    public void marks()
    {
      int sub1=98;
      int sub2=75;
      int sub3=89;
      int sub4=76;
      int sub5=57;
      System.out.println(sub1+" "+sub2+" "+sub3+" "+sub4+" "+sub5);
      int total=sub1+sub2+sub3+sub4+sub5;
      double avg=total/5;
      System.out.println("Average:"+avg);
      double percent=(avg/500)*100;
      System.out.println("Percentage:"+percent);
    }
  }
class InterfaceExample
  {
    public static void main(String args[])
    {
      StudentInfo si=new StudentInfo();
      si.details();
      si.marks();
    }
  }