import java.util.* ;    
class Sorting  
{    
static void sortarray ( int arr[] , int n )  
{  
    int count0 = 0 ;  
    int count1 = 0 ;  
    int count2 = 0 ;  
    int i = 0 ;  
    while ( i < n )  
    {  
        if ( arr [ i ] == 0 )  
        {  
            count0 = count0 + 1 ;  
        }  
        if ( arr[ i ] == 2 )  
        {  
            count2 = count2 + 1 ;  
        }  
        if ( arr[ i ] == 1 )  
        {  
            count1 = count1 + 1 ;  
        }  
        i = i + 1 ;  
    }  
    i = 0 ;  
    while ( i < count0 )  
    {  
        arr[ i ] = 0 ;  
        i = i + 1 ;  
    }  
    while ( i < count2 + count1 + count0 )  
    {  
        arr[ i ] = 2 ;  
        i = i + 1 ;  
    }  
    while ( i <  count1 + count0 )  
    {  
        arr[ i ] = 1 ;  
        i = i + 1 ;  
    }  
}  
public static void main ( String args[] )    
{    
 int n ;  
 Scanner sc = new Scanner ( System.in ) ;  
 System.out.println ( " Enter number of elements :  " ) ;  
 n = sc.nextInt() ;  
 int arr[] = new int[ n ] ;  
 System.out.println ( " Enter elements of the array :  " ) ;  
 for ( int i = 0 ; i < n ; i++ )  
 {  
     arr[ i ] = sc.nextInt() ;  
 }  
 sortarray( arr , n ) ;  
 System.out.println ( " Array after sorting : " ) ;  
  for ( int i = 0 ; i < n ; i++ )  
 {  
     System.out.println ( arr[ i ] ) ;  
 }  
}    
}  