import java.util.*;
class Q1
{
	public static void main(String args[])throws Exception
	{
		Scanner ob=new Scanner(System.in);
		int n,y,m,mn,newn,dl=0,month[]={31,0,31,30,31,30,31,31,30,31,30,31};
		String mon[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.print("Enter the number of days"+"\t");
		n=ob.nextInt();
		System.out.print("Enter the year"+"\t");
		y=ob.nextInt();
        System.out.println("Enter the number of days for future date between 1 and 100"+"\t");
		newn=ob.nextInt();
		m=n;
		for(int z=0;z<2;z++)
		{
			if(y%100==0)
			{
				if(y%4==0&&y%400==0)
		        month[1]=29;
		        else
		        month[1]=28;
		    }
			else
			{
				if(y%4==0)
		        month[1]=29;
		        else
		        month[1]=28;
			}
		    int s=0,i=0;
		   	while(n>s)
		    {
				s=s+month[i];
				i++;
			}
			mn=i;
			i--;
			s=s-month[i];
			dl=n-s;
			s=0;
		    if(z==1)
		    System.out.print("Date after"+" "+newn+" "+"days"+"  ");
		    System.out.print(dl);
            if(dl==1&&dl%10==1)
            System.out.print("st"+" ");
            else if(dl==2&&dl%10==2||dl==22)
            System.out.print("nd"+" ");
            else if(dl==3&&dl%10==3||dl==23)
            System.out.print("rd"+" ");
            else
            System.out.print("th"+" ");
		    for(int p=1;p<=mon.length;p++)
		    {
				if(p==mn)
				System.out.print(mon[p-1]);
			}
		    mn=0;
		    System.out.print(" "+y);
            System.out.println();
            if(newn>100){
				System.out.println("Invalid input");
				System.exit(0);}
            m=m+newn;
            if(y%4==0)
            {
		       	month[1]=29;
		     	if(m>366)
		    	{
		    		m=m-366;
		    		y=y+1;
		    	}
		    }
		    else
		    {
		    	month[1]=28;
		    	if(m>365)
		    	{
		     		m=m-365;
		    		y=y+1;
		    	}
		     }
		     n=m;
		 }
	 }
 }
 /*
Sample output:
1)	Enter the number of days	233
	Enter the year	2008
	Enter the number of days for future date between 1 and 100	17
	20th August 2008
	Date after 17 days  6th September 2008

2)	Enter the number of days	360
	Enter the year	2008
	Enter the number of days for future date between 1 and 100	45
	25th December 2008
	Date after 45 days  8th Febrary 2009

3)	Enter the number of days	360
	Enter the year	2099
	Enter the number of days for future date between 1 and 100	45
	26th December 2099
	Date after 45 days  9th Febrary 2100

ALGORITHM
1)	Define five variables of int type to store the input date, to store input year ,
  	to store the number of days to be incremented and the last on eto store the output
  	int n,y,m,newn,s=0,dl=0.
2)	Define an array that contains the names of months.
3)	Make a funtion that returns leap if the year enterd is leap and not leap otherwise,
  	change the value of the month of feb accordingly.
4)	Count the month using the date input and year by using a for loop
  	for(int i=0;i<n-1;i++).
5)	Display the entered date in DD-MM-YYYY format.
6)	Now using the day number entered increment the ouput date month and year.
7)	To do so use a for loop to count month then using a switch statement store the
  	month name.
8)	Now check whether increasing the number of days does or doesnot lead to a increase
  	in the year.
9)	Check whether the new year is leap or not and change the number of days in the month of
  	feb accordingly.
10)	At last display the date along with month name along with the year number.
*/
