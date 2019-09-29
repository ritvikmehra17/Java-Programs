import java.io.*;
class Q21
{
	char s[];
	int size;
	Q21()
	{
		size=0;
		s=new char[0];
	}
	Q21(char c[])
	{
		s=c;
		size=c.length;
	}
	void displayarray()
	{
		for(int i=0;i<size;i++)
		System.out.print(s[i]+' ');
	}
	void move()
	{
		char t;
		for(int i=0;i<size;i++)
		{
			if(Character.isUpperCase(s[i]))
			{
				for(int j=size-1;Character.isUpperCase(s[j]);j--)
				{
					if(j<i)
					break;
					t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
			}
		}
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size.");
		int q=Integer.parseInt(br.readLine());
		char p[]=new char[q];
		System.out.println("Enter the characters.");
		for(int i=0;i<q;i++)
		p[i]=(char)br.read();
	    Q21 obj=new Q21(p);
		obj.displayarray();
		obj.move();
		System.out.print("Output : ");
		obj.displayarray();
	}
}
/*
Sample Output:
1)	Enter the size.
	7
	Enter the characters.
	t
	D
	f
	s
	X
	v
	d
	t  D  f  s  X  v   d
	Output : t  d  f  s  v  X  D

2)	Enter the size.
	7
	Enter the characters.
	u
	E
	g
	t
	Y
	x
	e
	u  E  g  t  Y  x   e
	Output : u  e  g  t  x  Y  E

Algorithm
1)	Integer type variable size and character type array s are initialised.
2)	Integer type variable q is initialised in main method with value entered
	by the user.
3)	Character type array p is initialised in main method with q as size.
4)	char type elements for array p are entered by the user.
5)	Object is made and thus constructor is called with p as parameter.
6)	Array s is assigned the elements of p and size is assigned the value of q.
7)	Initial elements of array s are displayed by calling the function
	displayarray().
8)	Function move() is called which moves all the upper case letters to the
	right side of the array without using any standard sorting technique.
9)	Final elements of array s are displayed by calling the function
	displayarray(), thus giving the desired output.
*/
