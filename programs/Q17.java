import java.io.*;
class Q17
{
	int htod(String hexadecimal)
	{
		int h=hexadecimal.length()-1;int d=0;int n=0;
		for(int i=0;i<hexadecimal.length();i++)
		{
			char ch=hexadecimal.charAt(i);boolean flag=false;
			switch(ch)
			{
				case '1':
				n=1;
				break;
				case '2':
				n=2;
				break;
				case '3':
				n=3;
				break;
				case '4':
				n=4;
				break;
				case '5':
				n=5;
				break;
				case '6':
				n=6;
				break;
				case '7':
				n=7;
				break;
				case '8':
				n=8;
				break;
				case '9':
				n=9;
				break;
				case 'A':
				n=10;
				break;
				case 'B':
				n=11;
				break;
				case 'C':
				n=12;
				break;
				case 'D':
				n=13;
				break;
				case 'E':
				n=14;
				break;
				case 'F':
				n=15;
				break;
				default:
				flag=true;
            }
            if(flag)
            {
				System.out.println("Wrong Entry");
				break;
			}
            d=(int)(n*(Math.pow(16,h)))+(int)d;
            h--;
		}
        return d;
    }
    String dtoh(int t)
    {
		String str = Integer.toHexString(t);
		return str;
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Hexadecimal Number");
		String a=br.readLine();
		System.out.println("Enter Second Hexadecimal Number");
		String b=br.readLine();
		Q17 obj=new Q17();
		int m=obj.htod(a);
		int n=obj.htod(b);
		if(m>n)
		{
			int p=m-n;
			String q=obj.dtoh(p);
			System.out.println("The Result is:");
			System.out.println(q.toUpperCase());
		}
		else
		System.out.println("Wrong Input");
	}
}
/*
Sample output:
1)	Enter First Hexadecimal Number
	AAAA
	Enter Second Hexadecimal Number
	9999
	The Result is:
	1111

2)	Enter First Hexadecimal Number
	FFFF
	Enter Second Hexadecimal Number
	AAAA
	The Result is:
	5555

3)	Enter First Hexadecimal Number
	FAFD
	Enter Second Hexadecimal Number
	1234
	The Result is:
	E8C9

Algorithm
1)	User enters the two Hexadecimal nos. in String type variables a and b.
2)	Integer type function htod() is called twice with a and b as parameters.
	htod() converts a and b from hexadecimal to decimal nos. by adding the
	value of each character in the strings with thier value in decimal nos.
	It then returns the decimal value to main class where it gets stored in
	integer type variables m and n.
3)	if m is smaller than n then wrong input is printed and the program ends.
4)	n is subtracted from m and the result is then stored in integer type
	variable p.
5)	String type function dtoh() is called with p as parameter. It converts
	the value of p from decimal no. to Hexadecimal string by using
	Integer.toHexString() statement, and returns the result to main class
	where it gets stored in string type variable q.
6)	q is printed as the required output.
*/
