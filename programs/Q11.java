import java.util.*;
class Q11
{
	int magic[][];
	int N;
	Q11(int n)
	{
		N=n;
		magic=new int[n][n];
	}
	void create()
	{
		int row=N-1;
		int col=N/2;
		magic[row][col]=1;
		for(int i=2;i<=N*N;i++)
		{
			if(magic[(row+1)%N][(col+1)%N]==0)
		    {
		    	row=(row+1)%N;
		    	col=(col+1)%N;
		    }
		    else
		    {
		    	row=(row-1+N)%N;
		    }
		    magic[row][col]=i;
		}
	}
	void display()
	{
		System.out.println("The magic square of order"+" "+N);
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(magic[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String args[])throws Exception
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter order N of Magic Square(odd)"+" "+"="+" ");
		int N=ob.nextInt();
		if(N%2==0)
		{
			System.out.println("Wrong Input.N must be odd.Cannot continue");
			System.exit(0);
		}
		Q11 obj=new Q11(N);
		obj.create();
		obj.display();
	}
}
/*
Sample Output

1)	Enter order N of Magic Square(odd) = 3
    The magic square of order 3
    4       9       2
    3       5       7
    8       1       6

2)	Enter order N of Magic Square(odd) = 5
    The magic square of order 5
    11      18      25      2       9
    10      12      19      21      3
    4       6       13      20      22
    23      5       7       14      16
    17      24      1       8       15

3)	Enter order N of Magic Square(odd) = 7
    The magic square of order 7
    22      31      40      49      2       11      20
    21      23      32      41      43      3       12
    13      15      24      33      42      44      4
    5       14      16      25      34      36      45
    46      6       8       17      26      35      37
    38      47      7       9       18      27      29
    30      39      48      1       10      19      28

 ALGORITHM
1) The size of the array is stored in N.For making a magic square the order/size of the array must be odd.
2) First step is checking if N is not odd .
3) Number of variables taken is five.
4) magic[][]:is an integer type duble dimensional array.
   N and n are integer type variables .
   row and column are integer type storing the array index of input number.
5) Object of the class is created . Constructor is invoked initializing N to n and array magic[][].
6) After initialization void create() function is invoked which assigns the integer 1 to N^2 in ascending order,
   starting at the bottom middle cell.
	row=N-1
	col=N/2
	magic[row][col]=1
7) Repeatedly assign the next integers to the cell adjacent diagonally to the right and down.
    for(int i=2;i<=N*N;i++)
	if(magic[(row+1)%N][(col+1)%N]==0)
	    {
	    	row=(row+1)%N
	    	col=(col+1)%N
		}
		 magic[row][col]=i
8) If the cell has alredy been assign the another integer, instead use the cell adjacently above, do not change the column.
   if(magic[(row+1)%N][(col+1)%N]!=0)
      row=(row-1+N)%N
9) When the for() loop terminates magic[][] is completely filled with integer, such that all row sums,column sums and diagonal sums are
   equal.
10)Display() function is invoked and the resultant matrix is displayed.
*/
