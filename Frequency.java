import java.util.*;
class Frequency
{
    public static void main(String arr[])
    {
        Scanner sc = new Scanner(System.in);
        int num,i,count,digit,temp;
        System.out.println("Enter any Number : ");
        num=sc.nextInt();
        System.out.println("Digit\tFrequency");
        for(i=0;i<=9;i++)
        {
            count=0;
            temp=num;
            while(temp>0)
            {
                digit=temp%10;
                if(digit==i)
                {
                    count++;
                }
                temp=temp/10;
            }
            if(count>0)
            {
                System.out.println(i+"\t"+count);
            }
        }
    }
}
