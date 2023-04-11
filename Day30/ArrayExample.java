import java.util.*;
class ArrayException extends Exception{
  public ArrayException(String str)
  {
    super(str);
  }
}
class Array{
  int arr[];
  int size;
  public void read()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size:");
    try{
      int size=sc.nextInt();
      if(size<2){
        throw new ArrayException("Invalid");
      }
      else{
        System.out.println("Enter array elements:");
        arr=new int[size];
        for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println("Array is ");
        for(int i=0;i<size;i++){
          System.out.println(si[i]+" ");
        }
      }
    }
    catch(ArrayException e){
      System.out.println(e);
    }
  }
  public void sort(){
    int temp=0;
    System.out.println("sorted array is ");
    for(int i=0;i<size;i++){
      for(int j=i+1;j<size;j++){
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    for(int a:arr)
      System.out.println(a);
  }
}
class Main{
  public static void main(String args[]){
    Array a[]=new Array[5];
    for(int i=0;i<5;i++){
      a[i]=new Array();
      a[i].read();
      a[i].sort();
    }
  }
}
