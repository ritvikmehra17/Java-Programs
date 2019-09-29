import java.io.*;
class Q8
{
	int a,b,c;
	String q,w;
	Q8(int s,int t)
	{
		a=s;
		b=t;
		c=t;
		q=s+" ";
		w="";
	}
	void cal()
	{
		while(c!=a)
		{
			if((c%2==0)&&(c/2>=a))
			{
				c=c/2;
				w="* 2 "+w;
			}
			else
			{
				c--;
				w="+ 1) "+w;
				q='('+q;
			}
		}
	}
	void display()
	{
		System.out.println();
		System.out.println("Output:");
		System.out.println(b+" = "+q+w);
	}
	public static void main(String atgs[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of a");
		int l=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of b");
		int m=Integer.parseInt(br.readLine());
		if(l<=m)
		{
			Q8 obj=new Q8(l,m);
			obj.cal();
			obj.display();
		}
		else
		System.out.println("Wrong Input");
	}
}
/*
Sample Output:
1)	Enter the value of a
	4
	Enter the value of b
	65

	Output:
	65 = (4 * 2 * 2 * 2 * 2 + 1)

2)	Enter the value of a
	9
	Enter the value of b
	901

	Output:
	901 = (((((((9 + 1) + 1) + 1) + 1) + 1) * 2 * 2 * 2 * 2 + 1) * 2 * 2 + 1)

ALGORITHM
1)	Declare variables int a,b,c to store the value passed
	on to the consructor and to calculate the reqired sequence.
2)	Declare two more String type variables q and w to respectively
	store the left brackets and to store *2 and *1 along with right
	brackets.
3)	Define a function named cal which will using  if and nested in while
	will generate the desired sequence.
4)	The logic used is that if the number is odd the subtact one
	then it will become even ,divide the same by 2.
5)	At the last check if any of the step 4 operation lead to a
	number greater than a then change so as to get a by sutracting
	1 in succession.
6)	After all this print the result by calling display function
	System.out.println(b+" = "+q+w).
*/
