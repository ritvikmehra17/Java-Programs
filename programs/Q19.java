import java.io.*;
class Q19
{
	static BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	static String str="";
	static int n,d,y;
	static int m[]={31,0,31,30,31,30,31,31,30,31,30,31};
	static String mo[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
	public static void main(String args[])throws IOException
	{
		        System.out.print("Enter the data"+"\t"+':');
			    n=Integer.parseInt(ob.readLine());
			    str=String.valueOf(n);
			    if(str.length()>=4)
			    y=Integer.parseInt(str.substring(str.length()-4));
		do
		{
			if((y<1900)||(y>3000)||(str.length()<6))
			{
				System.out.print("Wrong Input.Please reenter"+"	"+':');
			    n=Integer.parseInt(ob.readLine());
			    str=String.valueOf(n);
			    if((str.length())>=4)
			    y=Integer.parseInt(str.substring(str.length()-4));
			    else
			    continue;
			}
         }
		while((y<1900)||(y>3000)||(str.length()<6));
		d=Integer.parseInt(str.substring(0,str.length()-4));
		if(y%100==0)
		{
			if(y%4==0&&y%400==0)
	        m[1]=29;
	        else
	        m[1]=28;
		}
		else
		{
			if(y%4==0)
		    m[1]=29;
		    else
		    m[1]=28;
	    }
		int sumd=0,mn=0;
		while(d>sumd)
		{
			sumd=m[mn]+sumd;
			mn=mn+1;
		}
		mn=mn-1;
		sumd=sumd-m[mn];
		d=d-sumd;
		System.out.print("Output"+"\t"+':'+d+" "+mo[mn]+" "+y);
	}
}
/*
Sample output
1)	Enter the data  :272005
	Output  :27 January 2005

2)	Enter the data  :3602700
	Output  :26 December 2700

AGORITHM
1)  integer type variable n- to store the long date data.
                          d- stores the number of days.
                          y- stores the year number.
                          mn-stores the month number.
2)  m[] and mo[] are arrays storing the number of days in each month and the name of each month.
3)  The year y is checked if its a leap year .
4)	The loop while() loop executes till number of days is greater than sumd.
5)  At each iteration the the number of days starting from January is added to sumd and mn is incremented by one.
    sumd=m[mn]+sumd; mn=mn+1
6)  At last d will store the number of number of days elapsed in mn th month.
7)  finally d(date in the month),mo[mn](the month name)and y(the year) is printed.
*/
