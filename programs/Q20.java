import java.io.*;
import java.util.*;
class Q20
{
	public static void main(String []args)throws IOException
    {
		Scanner imp=new Scanner(System.in);
        System.out.print("Enter the sentence:	");
		String sen=imp.nextLine();
		StringTokenizer st=new StringTokenizer(sen);
		int row=0;
		int now=st.countTokens();
		String aa[]=new String[now];
		for(int i=0;i<now;i++)
		{
			int a=0;
			if((a=(aa[i]=st.nextToken()).length())>row)
			row=a;
		}
		char asd[][]=new char[row][now];
		String temp;
		for(int i=0;i<now;i++)
		{
			for(int j=0;j<aa[i].length();j++)
		 	{
				asd[j][i]=aa[i].charAt(j);
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<now;j++)
			{
				if((int)asd[i][j]>33)
				System.out.print(asd[i][j]+"    ");
				else
				System.out.print("     ");
			}
			System.out.println("");
		}
	}
}
/*
Sample Output:
1)	Enter the sentence:	This is a program
	T    i    a    p
	h    s         r
	i              o
	s              g
	               r
	               a
	               m

2)	Enter the sentence:	Enter the sentence
	E    t    s
	n    h    e
	t    e    n
	e         t
	r         e
	          n
	          c
	          e

ALGORITHM
1)	Define String sen to store the input string.
2)	Take the input in the varible sen.
3)	Using StringTokenizer break the input into words.
4)	Define int now to store the number of words.
5)	Define array String aa[]=new String[now] to store the
	words.
6)	In int row store the largest length of the words.
7)	Define char asd[][]=new char[row][now] that will store
	the each character of each word using for loop
		for(int i=0;i<now;i++)
		{
			for(int j=0;j<aa[i].length();j++)
			{
				asd[j][i]=aa[i].charAt(j);
			}
		}
8)	Now print the elements of char[][] in matrix form in such a manner
	that the palces that have no characters are filled with
	spaces.
9)	Program end.
*/
