import java.io.*;
class Q13
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader inp=new InputStreamReader(System.in);
        BufferedReader ob=new BufferedReader(inp);
        String s1="",s2="",r="",v="01";
        int m=0,c=0;
        System.out.println("Enter the first Binary number");
        s1=ob.readLine();
        System.out.println("Enter the second Binary number");
        s2=ob.readLine();
        while(s1.length()!=s2.length())
	    {
			if(s1.length()>s2.length())
			s2='0'+s2;
			if(s1.length()<s2.length())
			s1='0'+s1;
		}
		s1='0'+s1;
		s2='0'+s2;
		for(int i=s1.length()-1;i>=0;i--)
		{
			m=c+v.indexOf(s1.charAt(i))+v.indexOf(s2.charAt(i));
			r=v.charAt(m%2)+r;
			c=m/2;
		}
		System.out.println("The result is"+"\t"+r);
	}
}
/*
Sample output:
1) Enter the first Binary number
   1111
   Enter the second Binary number
   1111
   The result is   11110

2) Enter the first Binary number
   1001
   Enter the second Binary number
   1101
   The result is   10110

ALGORITHM

1)	s1,s2,r are String type variables to store the two binary numbers and to store their their sum.
	m and c are integer type variables to store the sum and carry of each digit of the binary number at each iteration.
2)	The while loop executes till the length of both the binary numbers are not equal.
	'0' is added at the front to the smaller string.This addition if '0' takes place until both are of same length.
3)	If both the binary numbers are of same length then also '0' is added at the front.
4)	for() loop starts from last digit of each binary number.
5)	initially m and c equal to zero.v is string storing 0,1.
6)	At each itiration the  m=c+v.indexOf(s1.charAt(i))+v.indexOf(s2.charAt(i)).{storing the sum of the indexes of charAt(i)in v.}
	The maximum value of m can be 3.
		r=v.charAt(m%2)+r [m is divided by 2 and remainder is added to the result.]
		c=m/2;[stores the dividend as carry];
7)	This process continues till all the complete addition is done.
8)	At the end resulting string is printed.
*/
