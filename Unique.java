import java.util.*;
class Unique
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,i,j,count;
      System.out.println("Enetr number of elements in array:");
      n=sc.nextInt();
      int arr[]=new int[n];
      int unqarr[]=new int[n];
      System.out.println("\nEnter Unique Arrays Items : "+n);
      for(i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
          unqarr[i]=-1;
        }
      for(i = 0; i < n; i++)
      {
			   count = 1;
			   for(j = i + 1; j < n; j++)
         {
				    if(arr[i] == arr[j])
            {
				        count++;
				        unqarr[j] = 0;
			       }
		      }
		  if(unqarr[i] != 0) {
			unqarr[i] = count;
			}
		}
		System.out.println("\nList of Unique Items in this Array :");
		for(i = 0; i < n; i++) {
			if(unqarr[i] == 1) {
				System.out.println(arr[i]);
			}
		}
	}
}
