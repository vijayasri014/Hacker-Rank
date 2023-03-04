import java.io.*;
import java.util.*;
public class Solution {
    static int rotateArr(int a[],int n,int k)
    {
        if(n==0)
        {
            return 0;
        }
        int temp=0;
        for(int i=0;i<k;i++)
        {
            temp=a[n-1];
            for(int j=n-1;j>0;j--)
            {
                a[j]=a[j-1];
            }
            a[1]=temp;
        }
        return 1;
       
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int res=rotateArr(a,n,k);
        if(res==0)
        {
            System.out.println(0);
        }
        else{
            for(int i:a)
            System.out.print(i+" ");
        }
    }
}
