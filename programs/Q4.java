import java.util.*;
class Q4
{
	public static void main(String args [])throws Exception
	{
		Scanner ob=new Scanner(System.in);
		String a[];
		String str="";
		int d=0,m=0;
		System.out.print("Enter date in six digit format"+"\t");
		str=ob.nextLine();
		a=new String [3];
		a[0]=str.substring(0,2);
        a[1]=str.substring(2,4);
		a[2]=str.substring(4,6);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(i<2)
			d=d*10+(int)ch-48;
			if(i>=2&&i<4)
			m=m*10+(int)ch-48;
		}
		if(m==01||m==03||m==05||m==07||m==8||m==10||m==12)
		{
           if(d>31)
           {
			   System.out.println("Invalid Date");
			   d=00;
			   m=00;
		   }
		}
	    if(m==04||m==06||m==9||m==11)
		{
            if(d>30)
            {
				System.out.println("Invalid Date");
				d=00;
				m=00;
			}
		}
	    if(m==02)
		{
             if(d>29)
             {
				 System.out.println("Invalid Date");
				 d=00;
				 m=00;
			 }
		}
		if(m>12)
		{
			m=0;
			System.out.println("Invalid Date");
		}
		if(d!=00&&m!=00)
	  	{
			System.out.print(d);
			if(a[0].equals("01")||a[0].equals("21")||a[0].equals("31"))
		    System.out.print("st"+" ");
		    else if(a[0].equals("02")||a[0].equals("22"))
		    System.out.print("nd"+" ");
		    else if(a[0].equals("03")||a[0].equals("23"))
		    System.out.print("rd"+" ");
		    else
		    System.out.print("th"+" ");
		    switch(a[1])
	        {
		    	case "01":System.out.print("January");
	         	break;
		     	case "02":System.out.print("Febrary");
		    	break;
			    case "03":System.out.print("March");
			    break;
			    case "04":System.out.print("April");
			    break;
			    case "05":System.out.print("May");
			    break;
			    case "06":System.out.print("June");
			    break;
			    case "07":System.out.print("July");
			    break;
			    case "08":System.out.print("August");
			    break;
			    case "09":System.out.print("September");
			    break;
			    case "10":System.out.print("October");
			    break;
			    case "11":System.out.print("November");
			    break;
			    case "12":System.out.print("December");
			    break;
			}
	        System.out.print(" "+","+a[2]);
	        System.out.println();
	        System.out.println("Valid date");
		}
	}
}
/*
Sample output
1)	Enter date in six digit format	121212
    12th December ,12
    Valid date

2)	Enter date in six digit format  341070
    Invalid Date

3)	Enter date in six digit format  080808
    8th August ,08
    Valid date

ALGORITHM
1)	Define the variables and initialize them
	String a[];To store the day year and month.
	String str="";To takeinput from user.
	int d=0,m=0;To store final day and month.
2)	Check for the validity of the date and display the message.
	System.out.println("Invalid Date").
3)	Now using a switch statement switch(a[1]) find the month name.
4)	Display the date along with month name and year
	System.out.print(" "+","+a[2]).
5)	At last print if the date was valid
	System.out.println("Valid date").
*/
