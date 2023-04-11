class LinearExample
  {
    public static void main(String args[])
    {
      int i;
      int arr[]={12,34,45,67,46};
      int a=45;
      int n=arr.length;
      for(i=0;i<n;i++){
        if(arr[i]==a)
          System.out.println(i);
          break;
      }
      if(i==n)
        System.out.println("Element not found");
    }
  }
