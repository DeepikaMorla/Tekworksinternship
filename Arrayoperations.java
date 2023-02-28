import java.util.*;
class ArrayOperations
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of elements in an array:");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("Array Operations:");
      System.out.println("1.Insert an element in first index ");
      System.out.println("2.Insert an element in last index ");
      System.out.println("3.Insert an element in specified index ");
      System.out.println("4.Remove element from first index ");
      System.out.println("5.Remove element from last index ");
      System.out.println("6.Remove element from specified index ");
      System.out.println("7.Remove user eneted element ");
      System.out.println("8.Display all in ASC/DESC order. ");
      System.out.println("9.Display all array elements ");
      int option=sc.nextInt();
      switch(option)
        {
          case 1: insertAtFirstIndex(arr,size);
                  break;
          case 2: insertAtLastIndex(arr,size);
                  break;
          case 3: insertAtSpecifiedIndex(arr,size);
                  break;
          case 4: removeAtFirstIndex(arr,size);
                  break;
          case 5: removeAtLastIndex(arr,size);
                  break;
          case 6: removeAtSpecifiedIndex(arr,size);
                  break;
          case 7: removeUserElement(arr,size);
                  break;
          case 8: DisplayinAscendingOrder(arr,size);
                  break;
          case 9: DisplayArrayElements(arr,size);
                  break;
        }
    }
    static void insertAtFirstIndex(int arr[], int size)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter element to insert at first index:");
      arr[0]=sc.nextInt();
    }
    static void insertAtLastIndex(int arr[], int size)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter element to insert at last index:");
      arr[size-1]=sc.nextInt();
    }
    static void insertAtSpecifiedIndex(int arr[], int size)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the position number to insert data:");
      int position = sc.nextInt();
      System.out.println("Enter element to insert at "+position+" index");
      arr[position]=sc.nextInt();
    }
    static void removeAtFirstIndex(int arr[], int size)
    {
      arr[0]=0;
    }
    static void removeAtLastIndex(int arr[], int size)
    {
      arr[size-1]=0;
    }
    static void removeAtSpecifiedIndex(int arr[], int size)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter position number to remove data:");
      int remove = sc.nextInt();
      arr[remove]=0;
    }
    static void removeUserElement(int arr[], int size)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter element to remove from array:");
      int remove=sc.nextInt();
      int i;
      for(i=0;i<size;i++)
        {
          if(arr[i]==remove)
          {
            arr[i]=0;
            break;
          }
        }
      if(i==size)
        System.out.println(remove+" not available in the array");
    }
    static void DisplayinAscendingOrder(int arr[], int size)
    {
      
    }
    static void DisplayArrayElements(int arr[], int size)
    {
      Scanner sc = new Scanner(System.in);
      int arr[]=new int[size];
      System.out.println()
    }
  }