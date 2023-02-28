import java.util.*;
class employee
  {
    int empno;
    String empname;
    float basicsalary,HRA,DA,GS,incometax,netsalary;
    public void read()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Employee Number: ");
      empno = sc.nextInt();
      System.out.println("Enter Employee Name: ");
      empname = sc.next();
      System.out.println("Enter Basic Salary: ");
      basicsalary = sc.nextFloat();
      calculate();
    }
    public void calculate()   //calculating all the parameters
    {
      HRA = 0.1f * basicsalary;
      DA = 0.555f * basicsalary;
      GS = basicsalary + DA + HRA;
      incometax = 0.06f * GS;
      netsalary=GS-incometax;
    }
    public void display()  //displaying the calculating parameters
     {
        System.out.println("Employee number="+empno);
        System.out.println("Name="+empname);
        System.out.println("Basic pay="+basicsalary);        
        System.out.println("Housing Rent Allowance="+HRA);    
        System.out.println("Dearness Allowance="+DA);
        System.out.println("Income Tax="+incometax);
        System.out.println("Gross pay="+GS);
        System.out.println("Net Salary="+netsalary);
     }
  }
class main //main function
{
  public static void main(String args[])
  {
    employee employeobj=new employee();
    employeobj.read(); //calling read function
    employeobj.display(); //calling display function
  }
}