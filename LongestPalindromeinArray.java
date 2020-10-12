package prep100c;
import java.util.*;
public class LongestPalindromeinArray {
	public static boolean isPalindrome(int n)
	{
		int r,rev=0;
		int number=n;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(number==rev)
			{
			return true;
			}
		else {
			return false;
		    }
	}
	public static int longest(int a[],int n)
	{
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=n-1;k>=0;--k)
		{
			if(isPalindrome(a[k]))
				return a[k];
		}
		   return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        int larger=longest(a,n);
        if(larger==-1)
        {
        	System.out.println("No palindrome found in array");
        }
        else
        {
        System.out.println("Longest palibdrome in array is :"+larger);
        }
	}

}
