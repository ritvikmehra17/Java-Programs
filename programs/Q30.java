import java.io.*;
class Q30
{
	static InputStreamReader inp=new InputStreamReader(System.in);
	static BufferedReader ob=new BufferedReader(inp);
	static String str[],nstr="",estr="",e1str="",v="ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static int n;
	public static void main(String args[])throws Exception
	{
		Q30 obj=new Q30();
		System.out.print("Enter size of the array	:");
	    n=Integer.parseInt(ob.readLine());
	    str=new String[n];
	    obj.input();
	    for(int i=1;i<=n;i++)
	    {
			if(i%2!=0)
	        {
		    	nstr=encrypt(str[i-1]);
	            str[i-1]=nstr;
	            nstr="";
		    }
		    else
		    {
		    	nstr=reverse(str[i-1]);
		    	str[i-1]=nstr;
		    	nstr="";
			}
		}
		System.out.println("THE ENCRYPTED CODE IS:");
		for(int i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
	}
	void input()throws Exception
	{
		System.out.println("Enter "+n+" sentences	:");
		for(int i=0;i<n;i++)
		str[i]=ob.readLine();
	}
	 static String encrypt(String x)
	{
		estr="";
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)!=' '&&x.charAt(i)!='.')
			estr=estr+v.charAt((v.indexOf(x.charAt(i))+2));
			else if(x.charAt(i)==' ')
			estr=estr+" ";
			else
			estr=estr+".";
		}
		return(estr);
	}
	 static String reverse(String y)
	{
		String w="",q[];
		int wc=0,t=0;
		e1str="";
		for(int i=0;i<y.length();i++)
		{
			if(i==0&&(y.charAt(i)==' '&&y.charAt(i)=='.'))
			continue;
			if(y.charAt(i)==' '||y.charAt(i)=='.')
			wc=wc+1;
		}
		q=new String[wc];
		for(int i=0;i<y.length();i++)
		{
			if(y.charAt(i)==' '||y.charAt(i)=='.')
			{
				q[t]=w;
				t=t+1;
				w="";
			}
			else
			w=w+y.charAt(i);
		}
		for(int i=wc-1;i>=0;i--)
		{
			e1str=e1str+q[i];
			if(i==0)
			e1str=e1str+".";
			else
			e1str=e1str+" ";
		}
		wc=0;
		q=new String[wc];
		return(e1str);
	}
}
/*
Sample output:

1) Enter size of the array :4

   Enter 4 sentences       :
   IT IS CLOUDY.
   IT MAY RAIN.
   THE WEATHER IS FINE.
   IT IS COOL.

   THE ENCRYPTED CODE IS:

   KV KU ENQWFA.
   RAIN MAY IT.
   VJG YGCVJGT KU HKPG.
   COOL IS IT.

2) Enter size of the array :4

   Enter 4 sentences       :
   YOU HAVE NO POWER HERE.
   YOU SHALL NOT PASS.
   CONSTANT VIGILANCE.
   IMAGINATION EXCEEDS KNOWLEDGE.

   THE ENCRYPTED CODE IS:
   AQW JCXG PQ RQYGT JGTG.
   PASS NOT SHALL YOU.
   EQPUVCPV XKIKNCPEG.
   KNOWLEDGE EXCEEDS IMAGINATION.

ALGORITHM
1) integer type variable n-to store the number of sentences to be entered in the String type array str[].
   nstr store one sentence at a time. v stores all the alphabets in cyclic order.
   w stores a particular word of a sentence.q[] is String type and stores a word of a sentence at each index.
2) Object of the class is created .Sentences are entered.
3) The encrypt() function is invoked when control reaches to an odd numbered sentence
   (first sentence will be numbered as 1 and so on.)
   For even numbered sentence reverse() is invoked.
4) The encrypt() function increments each letter of a sentence by two.
5) The reverse() function reverses the order of words in a sentence.
6) Each of the modified sentence is stored at its initial index in str[].
7) str[] is displayed at last.
*/
