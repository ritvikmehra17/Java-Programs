import java.io.*;
class Q24
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no. of rows and columns.");
		int r=Integer.parseInt(br.readLine());
		int t=Integer.parseInt(br.readLine());
		int f[][]=new int[r][t];
		int s[][]=new int[r][t];
		System.out.println("Enter the elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<t;j++)
			f[i][j]=Integer.parseInt(br.readLine());
		}
		System.out.println();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<t;j++)
			System.out.print(f[i][j]+"	");
			System.out.println();
		}
		for(int i=0;i<r;i++)
		{
		   for(int j=0;j<t;j++)
		   {
			   if(j>0&&i>0)
			   {
				   int max=s[i][j-1];
				   if(max<s[i-1][j])
				   max=s[i-1][j];
				   s[i][j]=f[i][j]+max;
			   }
			   else if(j>0)
			   s[i][j]=f[i][j]+s[i][j-1];
			   else if(i>0)
			   s[i][j]=f[i][j]+s[i-1][j];
			   else
			   s[i][j]=f[i][j];
		   }
	   }
	   System.out.println("Output:	"+s[r-1][t-1]);
   }
}
/*
Sample output:
1)	Enter the no. of rows and columns.
	2
	5
	Enter the elements
	2
	5
	6
	3
	1
	1
	2
	3
	0
	8

	2       5       6       3       1
	1       2       3       0       8
	Output: 25

2)	Enter the no. of rows and columns.
	3
	5
	Enter the elements
	1
	2
	3
	4
	5
	6
	7
	8
	9
	0
	11
	12
	13
	14
	15

	1       2       3       4       5
	6       7       8       9       0
	11      12      13      14      15
	Output: 72

Algorithm
1)	The no. of rows and columns are entered by user in integer type variable r
	and t.
2)	Two integer type double dimensional arrays f and s are initialised both
	with size r by t.
3)	User enters the no. of apples at each position as elements of f.
4)	f matrix is printed.
5)	A nested for loop is created. The outer loop running with i increasing from
	0 to r-1, and inner loop running with j increasing from 0 to t-1. Within
	inner loop if i is greater than 0 and j is also greater than 0 then the
	larger one of s[i][j-1] and s[i-1][j] is added with f[i][j] and stored into
	s[i][j], if only i is greater than 0 then s[i-1][j] is added with f[i][j]
	and stored into s[i][j], if only j is greater than 0 then s[i][j-1] is added
	with f[i][j] and stored into s[i][j], and if both i and j are equal to 0
	then simply f[i][j] is stored in s[i][j].
6)	The sum of path with the highest sum while only moving either down or right
	gets stored in the last element of s i.e., s[r-1][t-1].
7)	s[r-1][t-1] is printed as the required output.
*/
