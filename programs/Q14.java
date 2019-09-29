import java.io.*;
class Q14
{
	public static void main(String args[])throws IOException
	{
		String m,ar[];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Sentence :");
		m=br.readLine();
		int n=0,k=0,h=0;
		for(int i=0;i<m.length();i++)
		{
			if((m.charAt(i)==' ')||(m.charAt(i)=='.'))
			n++;
		}
		ar=new String[n];
		for(int i=0;i<m.length();i++)
		{
			if((m.charAt(i)==' ')||m.charAt(i)=='.')
			{
				ar[k]=m.substring(h,i);
				h=i+1;
				k++;
			}
		}
		System.out.println("Input Integers-");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		a--;
		b--;
		for(int i=0;i<ar[a].length();i++)
		{
			char y=ar[a].charAt(i);
			if(y=='Z')
			y='A';
			else if(y=='z')
			y='a';
			else
			y=(char)(((int)y)+1);
			if(i==0)
			ar[a]=y+ar[a].substring(1);
			else
			ar[a]=ar[a].substring(0,i)+y+ar[a].substring(i+1);
		}
		if(a!=b)
		{
			for(int i=0;i<ar[b].length();i++)
			{
				char y=ar[b].charAt(i);
				if(y=='Z')
				y='A';
				else if(y=='z')
				y='a';
				else
				y=(char)(((int)y)+1);
				if(i==0)
				ar[b]=y+ar[b].substring(1);
				else
				ar[b]=ar[b].substring(0,i)+y+ar[b].substring(i+1);
			}
		}
		System.out.print("The output is	:");
		for(int i=0;i<n;i++)
		{
			if(i==n-1)
			System.out.print(ar[i]+'.');
			else
			System.out.print(ar[i]+' ');
		}
		System.out.println();
	}
}
/*
Sample Output:
1)	Enter the Sentence :He has good Books.
    Input Integers-
    2
    4
    The output is   :He ibt good Cpplt.

2)  Enter the Sentence :Time and tide waits for none.
    Input Integers-
    3
    3
    The output is   :Time and ujef waits for none.

ALGORITHM
1)	String type variable m and array ar are initialised to store the string as entered by the user and
	to store the words in the string.
2)  No. of words in the string are calculated by counting no of spaces and fullstops. then this no is
	assigned as the size of array ar, in which the words are stored by splitting the string from one
	space to another space or fullstop.
3)	Position of the desired words, to be encrypted, are entered by the user in integer type variables a & b.
4)	The characters of the word at position a in array ar are changed by the next charcter in a cyclic order by
	usi the following loop:
		for(int i=0;i<ar[a].length();i++)
		{
			char y=ar[a].charAt(i);
			if(y=='Z')
			y='A';
			else if(y=='z')
			y='a';
			else
			y=(char)(((int)y)+1);
			if(i==0)
			ar[a]=y+ar[a].substring(1);
			else
			ar[a]=ar[a].substring(0,i)+y+ar[a].substring(i+1);
		}
5)	Its then checked if b is equal to a. If it is then no other change takes place, if not then word at position
	b is encrypted in the same manner as a.
6)	Display the modified array ar as output.
*/
