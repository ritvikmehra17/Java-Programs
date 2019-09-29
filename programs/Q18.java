import java.io.*;
public class Q18
{
	public static void main(String args[])throws IOException
	{
		String n,r="",t="",m="";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the infix expression:	");
		n=br.readLine();
		int l=n.length();
		for(int i=0;i<l;i++)
		{
			char x=n.charAt(i);
			if(x!='('&&x!=')'&&x!='*'&&x!='/'&&x!='+'&&x!='-')
			m=m+x;
		}
		int a[]=new int[m.length()];
		for(int i=0;i<m.length();i++)
		{
			System.out.print("Enter the value of "+" "+(m.charAt(i))+" ");
			a[i]=Integer.parseInt(br.readLine());
		}
		n="("+n+")";
		for(int i=0;i<n.length();i++)
		{
			char x=n.charAt(i);
			if(x!='('&&x!=')'&&x!='*'&&x!='/'&&x!='+'&&x!='-')
			r=r+x;
			if(x=='*'||x=='/'||x=='+'||x=='-')
			t=x+t;
			if(x==')')
			{
				r=r+t.charAt(0);
				t=t.substring(1);
			}
		}
		System.out.print("The Posfix Operation is:	"+r);
		int k=0;
		for(int i=0;i<r.length();i++)
		{
			char x=r.charAt(i);
			if(x=='*')
			a[++k]=a[k-1]*a[k];
			else if(x=='/')
			a[++k]=a[k-1]/a[k];
			else if(x=='+')
			a[++k]=a[k-1]+a[k];
			else if(x=='-')
			a[++k]=a[k-1]-a[k];
		}
		System.out.println("The Result is "+a[k]);
	}
}
/*
Sample Output:
Enter the infix expression:	(a+b)/c
Enter the value of a 10
Enter the value of b 5
Enter the value of c 3
The Posfix Operation is:	ab+c/
The Result is 5

ALGORITHM
1)	str stores the infix expression. Parenthesses are added to the front and rear of the expression.
    stack[] is initialized of size str.length().
2)  ch stores character while extracting. If ch is left paranthesses it will go to the stack.
3)	If ch is an operand it will go to the postfix string p.
4)	If ch is right paranthesses then pop out all the symbols from the stack
    and append these in the postfix string till left paranthesses is encountered.
5)	If ch is an operator pop out all the symbols from the top of the stack whose
    precedence is more or same as that of the scanned symbol.
6)  The current scanned symbol will go to the stack.
7)  Print the resultant postfix expression p.
8)	The value of the variables is entered by the user in an array a.
9)	The operators in the string are now checked and their respective functions are executed with the eements of array a.
10)	The result gets stored in the last element, from where it is printed as the output.
*/
