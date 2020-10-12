package prep100c;
import java.util.*;
public class MinMaxScalarproduct {
	public static void minscalar(int a[],int b[],int n)
	{
		int temp1=0;
		//ascending sorting
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;
				}
			}
		}
		//descending sorting
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(b[i]<b[j])
				{
					temp1=b[i];
					b[i]=b[j];
					b[j]=temp1;
				}
			}
		}
		int sum1=0;
			for(int i=0;i<n;i++)
			{
					sum1+=a[i]*b[i];

			}
			System.out.println();
			System.out.println("Minimum scalar product");
			System.out.println(sum1);
	}
	
	public static void maxscalar(int a[],int b[],int n)
	{
		int temp2=0;
		//ascending sorting
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp2=a[i];
					a[i]=a[j];
					a[j]=temp2;
				}
			}
		}
		//ascending sorting
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(b[i]>b[j])
				{
					temp2=b[i];
					b[i]=b[j];
					b[j]=temp2;
				}
			}
		}
		int sum2=0;
			for(int i=0;i<n;i++)
			{
					sum2+=a[i]*b[i];

			}
			System.out.println();
			System.out.println("Maximum scalar product");
			System.out.println(sum2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter element for first array: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element for second array: ");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		minscalar(a,b,n);
		maxscalar(a,b,n);
		
		
	}

}
