import java.util.*;
class Bank
  {
    String username;
    String password;
    String IFSC;
    Bank(String username1,String password1)
    {
      System.out.println("Username:"+username1);
      System.out.println("Password:"+password1);
    }
    void getDetils()
    {
      System.out.println("Username:"+username);
      System.out.println("Password:"+password);
      System.out.println("IFSC code:"+IFSC);
    }
    void setDetails()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter User Details");
      System.out.println("Enter username:");
      username=sc.nextLine();
      System.out.println("Enter password:");
      password=sc.nextLine();
      System.out.println("Enter IFSC code:");
      IFSC=sc.nextLine();
    }
    void getOutput()
    {
      if(username.equals("Deepika.morla") && password.equals("abcd@123"))
      {
        System.out.println("Valid user");
      }
      else
      {
        System.out.println("Invalid user");
      }
    }
  }
class InternetBanking
  {
    public static void main(String args[])
    {
      Bank bd=new Bank("Deepika.morla","abcd@123");
      bd.setDetails();
      bd.getDetils();
      bd.getOutput();
    }
  }