import java.util.*;
class Q2
{
	public static void main(String args[])throws Exception
	{
		Scanner ob=new Scanner(System.in);
		int a[][],b[],sum=0,c=0,x=0,m,n,y=0;
		System.out.println("Enter the rows and columns of array");
		m=ob.nextInt();
		n=ob.nextInt();
		a=new int[m][n];
		System.out.println("Enter the elements");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			a[i][j]=ob.nextInt();
		}
		System.out.println("The Original Matrix is"+"  ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			System.out.print(a[i][j]+"\t");
			System.out.println();
		}
        b=new int[(m*2)+((n-2)*2)];
        for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==(m-1)||j==0||j==(n-1))
				{
					b[y]=a[i][j];
                    sum=sum+a[i][j];
				    y=y+1;
			    }
            }
		}

        System.out.println();
        for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length-i-1;j++)
			{
				if(b[j]>b[j+1])
				{
					int k=b[j];
					b[j]=b[j+1];
					b[j+1]=k;
				}

			}
		}
		System.out.println();
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<n;j++)
			a[i][j]=b[x++];
			for(int j=i+1;j<m-1;j++)
			a[j][n-i-1]=b[x++];
			for(int j=n-1;j>=0;j--)
			a[m-i-1][j]=b[x++];
			for(int j=m-2;j>0;j--)
			a[j][i]=b[x++];
		 }
        System.out.println();
		System.out.println("The Rearranged Matrix is"+"  ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			System.out.print(a[i][j]+"\t");
			System.out.println();
	    }
	    System.out.println();
	    System.out.println("The Boundary elements are"+"  ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			   {
					if(i==0||i==(a.length-1)||j==0||j==(a[0].length-1))
						System.out.print(a[i][j]+" \t");
					else
					    System.out.print("\t");
		    	}
				System.out.println();
		}
		System.out.println("The sum of the Boundary elements are"+"   "+sum);
	}
}
/*
Sample Output:
1) Enter the rows and columns of array
   3
   3
   The Original Matrix is
   1       7       4
   8       2       5
   6       3       9
   The Rearranged Matrix is
   1       3       4
   9       2       5
   8       7       6
   The Boundary elements are
   1       3       4
   9               5
   8       7       6
   The sum of the Boundary elements are   43

2) Enter the rows and columns of array
   4
   3
   The Original Matrix is
   1       3       5
   7       9       8
   6       3       2
   9       10      11
   The Rearranged Matrix is
   1       2       3
   11      9       5
   10      3       6
   9       8       7
   The Boundary elements are
   1       2       3
   11              5
   10              6
   9       8       7
   The sum of the Boundary elements are   62

3) Enter the rows and columns of array
   2
   3
   The Original Matrix is
   7       1       6
   8       9       2
   The Rearranged Matrix is
   1       2       6
   9       8       7
   The Boundary elements are
   1       2       6
   9       8       7
   The sum of the Boundary elements are   33

ALGORITHM
1)	Define variables int a[][],b[],sum=0,c=0,x=0,m,n,y=0 to store the sum ,
	to store number of rows and number of columns.
2)	Declare an int a[][] type dd array and another sd b[] array
	to repectively store the input array and the boundary elements.
3)	Take input using for loop.
	for(int i=0;i<m;i++)
4)	Display the input matrix again by using a for loop.
5)	Using a for loop nested in another for loop
	sort and simultaneously store the boundary elements.
	b[y]=a[i][j];//storing boundary elements
	sum=sum+a[i][j];//clculating sum of boundary elements
6)	Find the sum of boundary elements and store
	the sum.
7)	Display the sorted matrix using a for loop  for(int i=0;i<m;i++).
8)	Finally display the boundary elements only along with the sum system.out.print("sum").
*/
