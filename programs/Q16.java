import java.io.*;
class Q16
{
	static String a,b,c;
	Q16(String x,String y)
	{
		a=x;
		b=y;
		c="";
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String m,n;
		System.out.println("Enter First binary no.");
		m=br.readLine();
		System.out.println("Enter Second binary no.");
		n=br.readLine();
		Q16 obj=new Q16(m,n);
		if(b.length()>a.length())
		System.out.println("Wrong Input");
		else
		{
			int k=b.length();
			for(int i=0;i<a.length()-k;i++)
			b='0'+b;
			if(a.indexOf('0')<b.indexOf('0'))
			System.out.println("Wrong Input");
			else
			{
				obj.sub();
				obj.disp();
			}
		}
	}
	void sub()
	{
		for(int i=a.length()-1;i>=0;i--)
		{
			char e=a.charAt(i);
			char f=b.charAt(i);
			if(e=='1'&&f=='0')
			c=c+'1';
			else if(e==f)
			c=c+'0';
			else
			{
				int t=0;
				while(a.charAt(i-t)!='1')
				{
					a=a.substring(0,i-t)+'1'+a.substring(i-t+1);
					t++;
				}
				a=a.substring(0,i-t)+'0'+a.substring(i-t+1);
				c=c+'1';
			}
		}
		String g="";
		for(int i=c.length()-1;i>=0;i--)
		g=g+c.charAt(i);
		c=g;
	}
	void disp()
	{
		if(c=="")
		System.out.println("Wrong Input");
		else
		{
			System.out.println("The Result is");
			System.out.println(c);
		}
	}
}
/*
Sample Output:
1)	Enter First binary no.
	1101
	Enter Second binary no.
	1001
	The Result is
	0100

2)	Enter First binary no.
	1111
	Enter Second binary no.
	1111
	The Result is
	0000

3)	Enter First binary no.
	1110
	Enter Second binary no.
	0111
	The Result is
	0111

Algorithm
1)	The first and second binary nos. are entered by the user which are then stored
	in String type variables a and b by calling the constructor.
2)	It is checked whether the second binary no. is greater than the first binary no.
	by first checking their lengths and then checking the index of first 0 in them.
	If then 2nd no. is found to be greater then wrong output is printed and the
	program ends.
3)	Now one by one the characters of both a and b are taken from the back end to the
	front into character type variables e and f.
4)	If e is equal to f then 0 is added to the stringtype variable c.
5)	If e is 1 and f is 0 then 1 is added to c.
6)	If e is 0 and f is 1 then 1 is added to c and all the zeroes in a just before and
	including this position of e are replaced by 1 and the first 1 before them is
	replaced by 0. Thus performing the concept of carry-forward.
7)	Now c is reversed to give the result of subtraction.
8)	c is printed. Thus giving the desired output.
*/
