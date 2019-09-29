import java.io.*;
import java.util.*;
class Q23
{
	static String ss[];
	static int flag=0;
	static void yarg(String prefix, int n)
 	{
       if (n == 0)
       {
      	 	ss[flag++]=prefix;
       }
       else
       {
            gray(prefix + "1", n - 1);
            yarg(prefix + "0", n - 1);
       }
	}
    static void gray(String prefix, int n)
	{
         if (n == 0)
         {
        	ss[flag++]=prefix;
         }
         else
         {
            gray(prefix + "0", n - 1);
            yarg(prefix + "1", n - 1);
         }
 	}
	public static void main(String args[])throws Exception
	{
		int k,size=0,size2=0;
		String s;
		String sss[];
		Scanner imp = new Scanner(System.in);
		System.out.println("Enter the hammer distance followed by gray code string deparated by spaces:");
		k=imp.nextInt();
		s=imp.next();
		ss=new String[(size=(int)Math.pow(2,s.length()))];
		sss=new String[(int)Math.pow(2,s.length())];
		gray("",s.length());
		String qw="01";
		for(int i=0;i<size;i++)
		{
			int temp=0;
			flag=0;
			while(temp<s.length())
			{
				flag+=qw.indexOf(ss[i].charAt(temp++));
				if(flag>k)
				break;
				if(temp==s.length()&&flag==k)
				sss[size2++]=ss[i];
			}
		}
		for(int i=0;i<size2;i++)
		{
			System.out.println(sss[i]);
		}
	}
}
/*
Sample output:
Enter the hammer distance followed by gray code string deparated by spaces:
2 0000
0011
0110
0101
1100
1010
1001
*/
