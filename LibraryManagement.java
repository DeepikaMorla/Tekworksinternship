import java.util.*;
class Books
  {
    String title;
    String author;
    String isbn;
    String publisher;
    void getDetails()
    {
      System.out.println("Book title is "+title);
      System.out.println("Book author is "+author);
      System.out.println("Book isbn is "+isbn);
      System.out.println("Book publisher is "+publisher);
    }
    void setDetails()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter details of a book:");
      System.out.println("Enter book title:");
      title=sc.nextLine();
      System.out.println("Enter book author:");
      author=sc.nextLine();
      System.out.println("Enter book isbn:");
      isbn=sc.nextLine();
      System.out.println("Enter book publisher:");
      publisher=sc.nextLine();
    }
  }
class Author
  {
    String name;
    String email;
    String listofBooks[]={"abc" , "def"};
    void getDetails()
    {
      System.out.println("Author name is "+name);
      System.out.println("Author email is "+email);
      System.out.println("List of books written by author is ");
      for(int i=0;i<listofBooks.length;i++)
        System.out.println(listofBooks[i]);
    }
    void setDetails()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter author details:");
      System.out.println("Enter author name:");
      name=sc.nextLine();
      System.out.println("Enter author email:");
      email=sc.nextLine();
    }
  }
class LibraryManagement
  {
    public static void main(String args[])
    {
      Books b=new Books();
      b.setDetails();
      b.getDetails();
      Author a=new Author();
      a.setDetails();
      a.getDetails();
    }
  }