import java.io.*;
class Q26
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader inp=new InputStreamReader(System.in);
	    BufferedReader ob=new BufferedReader(inp);
	    String post="",v="-+*/^",op1="",op2="",str[];
	    int top=-1;
        System.out.print("Enter the Postfix Expression	:");
	    post=ob.readLine();
	    str=new String[post.length()];
	    for(int i=0;i<post.length();i++)
	    {
			if(v.indexOf(post.charAt(i))!=-1)
			{
				op2=str[top--];
				op1=str[top--];
				String t="("+op1+post.charAt(i)+op2+")";
				str[++top]=t;
			}
			else
			    str[++top]=""+post.charAt(i);
		}
		System.out.println("The Infix Expression is	:"+str[0]);
	}
}
/*Sample Output:
1)	Enter the Postfix Expression    :ab+cd+e-a+-
  	The Infix Expression is :((a+b)-(((c+d)-e)+a))

2)	Enter the Postfix Expression    :ab*cd/e^a-/
    The Infix Expression is :((a*b)/(((c/d)^e)-a))

ALGORITHM
1)	post stores the postfix expression entered by the user.
2)	op1 and op2 stores the two operands stored in the stack.
3)	if the scanned symbol is an operand it will go in the stack.
	if the scanned symbol is an operator pop out op1 and op2 from the stack and
   	add them string t in infix order.
4)	Now the str[top] has the resultant infix expression.
5)	This extraction continues till all the elements of post have been scanned .
6)	At last we get the final infix expression at str[0].
*/
