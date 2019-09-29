import java.io.*;
class Q15
{
	static int d1,m1,y1,d2,m2,y2,a[];
	Q15()
	{
		d1=0;m1=0;y1=0;d2=0;m2=0;y2=0;;
		a=new int[]{31,0,31,30,31,30,31,31,30,31,30,31};
	}
	int leap(int x)
	{
		if((x%100==0&&x%400!=0)||(x%4!=0))
		return 28;
		else
		return 29;
	}
	void enter(int k)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter DAY");
		int b=Integer.parseInt(br.readLine());
		System.out.println("Enter MONTH");
		int c=Integer.parseInt(br.readLine());
		System.out.println("Enter YEAR");
		int d=Integer.parseInt(br.readLine());
		if(k==1)
		{
			d1=b;
			m1=c;
			y1=d;
		}
		else
		{
			d2=b;
			m2=c;
			y2=d;
		}
	}
	void arrange()
	{
		if((y2<y1)||(y2==y1&&m2<m1)||(y2==y1&&m2==m1&&d2<d1))
		{
			int t1=d1;
			int t2=m1;
			int t3=y1;
			d1=d2;
			m1=m2;
			y1=y2;
			d2=t1;
			m2=t2;
			y2=t3;
		}
	}
	int count()
	{
		int j=0;
		for(int i=y1;i<y2;i++)
		{
			if(leap(i)==28)
			j+=365;
			else
			j+=366;
		}
		for(int i=0;i<m2-1;i++)
		j+=a[i];
		j+=d2;
		for(int i=0;i<(m1-1);i++)
		j-=a[i];
		j-=d1;
		return j;
	}
	boolean check()
	{
		a[1]=leap(y1);
		if(d1>a[m1-1]||d1<0||d2<0||m1<0||m2<0||y1<0||y2<0||m1>12||m2>12)
		return false;
		a[1]=leap(y2);
		if(d2>a[m2-1])
		return false;
		return true;
	}
	public static void main(String args[])throws IOException
	{
		Q15 obj=new Q15();
		obj.enter(1);
		obj.enter(2);
		if(obj.check())
		{
			obj.arrange();
			int n=obj.count();
			System.out.println("OUTPUT:	"+n);
		}
		else
		System.out.println("Wrong Input");
	}
}
/*
Sample Output:
1)	Enter DAY
	24
	Enter MONTH
	09
	Enter YEAR
	1960
	Enter DAY
	08
	Enter MONTH
	12
	Enter YEAR
	1852
	OUTPUT: 39371

2)	Enter DAY
	10
	Enter MONTH
	01
	Enter YEAR
	1952
	Enter DATE
	16
	Enter MONTH
	10
	Enter YEAR
	1952
	OUTPUT: 280

3)	Enter DAY
	17
	Enter MONTH
	12
	Enter YEAR
	1996
	Enter DATE
	6
	Enter MONTH
	01
	Enter YEAR
	2015
	OUTPUT: 6595

Algorithm
1)	Integer type variables d1, m1, y1, d2, m2, y2, and array ar are initialised
	for storing days of first date, month no. of first date, year no. of first
	date,days of second date, month no. of second date, year no. of second date,
	and no. of days in each month respectively.
2)	Constructor is called to enter the no. of days in each month in ar and
	intitial value of other variables as 0.
3)	The fuction enter() is called twice with parameters 1 and 2 to enter the
	first and second dates in d1, m1, y1 and d2, m2, y2 as entered by the user.
4)	It is checked whether the dates are valid using boolean type function check().
	If they are valid then they are swaped if the first date is smaller than the
	second by calling function arrange().
5)	Now function count() is called. It calculates the no. of days elapsed between
	the two dates by first adding all the days of the years in between the dates
	including the first year and checking if the are leap. Then it adds the no. of
	days of passed months of second year and the days of the second date and subtract
	the days of the passed months of first year and the days of the first date. The
	result is then returned and is stored in the integer type variable n in the main
	class.
6)	n is printed thus giving the desired output.
*/
