import java.io.*;
import java.util.*;
public class Checktwo 
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int arr[]=new int[size];
        int k=input.nextInt();
        for(int i=0;i<size;i++)
        {
            arr[i]=input.nextInt();
        }
        int count=0,temp;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                temp=arr[i]+arr[j];
                if(k==temp)
                {
                    count=1;
                }
            }
        }
        if(count==1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
