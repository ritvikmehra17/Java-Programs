import java.io.*;
class Q6
{
	public static void main(String args[])throws IOException
	{
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		String n="", str="",nstr="",w="";
		int r=0;
		System.out.println("Enter the encoded message");
		n=ob.readLine();
		for(int i=n.length()-1;i>=0;i--)
		{
			char ch=n.charAt(i);
			nstr=nstr+ch;
		}
		for(int i=0;i<nstr.length();i++)
		{
			char ch=nstr.charAt(i);
			int d=(int)ch-48;
		    r=r*10+d;
		    if(r>=65&&r<=90||r>=97&&r<=122||r==32)
		    {
				System.out.print((char)r);
				r=0;
			}
		    else
		    continue;
		}
	}
}
/*
Sample output
1)	Enter the encoded message
	2312179862310199501872379231018117927
	Have a Nice Day

2)	Enter the encoded message
	23511011501782351112179911801562340161171141148
	Truth Always Wins
ALGORITHM
1)	Declare variables
	String n(to take input)
	String str(to store the decoded message)
	String nstr(to use temporarly store words and to print them)
2)	Take input from the user.
3)	Start a for loop for(int i=n.length()-1;i>=0;i--) and use it to
	extact the words in coded form and then to reverse them.
4)	Start another loop for(int i=0;i<nstr.length();i++)
	and use it to decode the ecoded message.
5)	To decode the message first store int ASCII value of the
	extacted character and then check the following if(r>=65&&r<=90||r>=97&&r<=122||r==32)
	if true then we have encountered a character.
6)	Now print the character and at the end the end the encoded message will
	be printed in decoded form.
*/
