import java.io.*;
class Q10
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n (1<n<12).");
		int n=Integer.parseInt(br.readLine());
		int k=1,ar[][]=new int[n][n],p,r,c;
		if(n%2==0)
		{
			p=n/2;
			r=p;
		}
		else
		{
			p=(n+1)/2;
			r=p-1;
		}
		c=p-1;
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<(i+1)*2;j++)
			{
				if(k<=n*n)
				ar[r][c++]=k++;
			}
			c--;
			for(int l=0;l<(i*2)+1;l++)
			{
				if(k<=n*n)
				ar[--r][c]=k++;
			}
			for(int m=0;m<(i+1)*2;m++)
			{
				if(k<=n*n)
				ar[r][--c]=k++;
			}
			for(int s=0;s<(i*2)+1;s++)
			{
				if(k<=n*n)
				ar[++r][c]=k++;
			}
			r++;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			System.out.print(ar[i][j]+"	");
			System.out.println();
		}
	}
}
/*
Sample Output:
1)	Enter n (1<n<12).
	5
	17      16      15      14      13
	18      5       4       3       12
	19      6       1       2       11
	20      7       8       9       10
	21      22      23      24      25

2)	Enter n (1<n<12).
	7
	37      36      35      34      33      32      31
	38      17      16      15      14      13      30
	39      18      5       4       3       12      29
	40      19      6       1       2       11      28
	41      20      7       8       9       10      27
	42      21      22      23      24      25      26
	43      44      45      46      47      48      49

Algorithm
1)	Integer type variable n is entered by the user as the side of the
	square matrix.
2)	Integer type double dimensional array ar is initialised along with
	integer type variables r and c for the row and column no. of next
	entry. Thier initial value is calculated by using integer type
	variable p.
3)	A steadily increasing integer type variable k from 1 to n^2 is
	feeded as the element of the array ar in a anti-clockwise spiral
	pattern starting from middle by using nested for loops and
	periodically incrementing or decrementing the value of position
	variables r and c.
4)	The array ar is printed, thus giving the required output.
*/
