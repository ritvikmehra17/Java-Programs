import java.io.*;
class Q12
{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static String a[],b[],c[];
	int m,n,p;
	Q12(int s,int t)
	{
		m=s;
		n=t;
		p=s+t;
		a=new String[s];
		b=new String[t];
		c=new String[p];
	}
	void enter()throws IOException
	{
		System.out.println("Enter the names for 1st array.");
		for(int i=0;i<m;i++)
		{
			a[i]=br.readLine();
			c[i]=a[i];
		}
		System.out.println("Enter the names for 2nd array.");
		for(int j=0;j<n;j++)
		{
			b[j]=br.readLine();
			c[m+j]=b[j];
		}
	}
	void sort(String k[],int v)
	{
		int g=k.length;
		for(int i=0;i<g;i++)
		{
			String small=k[i];
			int p=i;
			for(int j=i+1;j<g;j++)
			{
				if(small.compareTo(k[j])>0)
				{
					small=k[j];
					p=j;
				}
			}
			String temp=k[i];
			k[i]=small;
			k[p]=temp;
		}
		if(v==1)
		a=k;
		else if(v==2)
		b=k;
		else
		c=k;
	}
	void display(String f[])
	{
		int g=f.length;
		for(int i=0;i<g;i++)
		System.out.println("	"+f[i]);
	}
	public static void main(String atgs[])throws IOException
	{
		System.out.print("Enter the size of a	:");
		int l=Integer.parseInt(br.readLine());
		System.out.println("Enter the size of b	:");
		int h=Integer.parseInt(br.readLine());
		Q12 obj=new Q12(l,h);
		obj.enter();
		obj.sort(a,1);
		obj.sort(b,2);
		obj.sort(c,3);
		System.out.println();
		System.out.println("Sorted Merged array:");
		obj.display(c);
		System.out.println();
		System.out.println("Sorted first array:");
		obj.display(a);
		System.out.println();
		System.out.println("Sorted second array:");
		obj.display(b);
	}
}
/*
Sample Output:
Enter the size of a     :2
Enter the size of b     :3
Enter the names for 1st array.
Suman
Anil
Enter the names for 2nd array.
Usha
Sachin
John

Sorted Merged array:
        Anil
        John
        Sachin
        Suman
        Usha

Sorted first array:
        Anil
        Suman

Sorted second array:
        John
        Sachin
        Usha

ALGORITHM
1)	Three String type array a[],b[],c[].
	a[] to store names of first array.
	b[] to store names of second array.
	c[] to store the names of merged a[] and b[] in ascending order.
	integer type variables l and h to store the size of a[] and b[]
2)	Object obj of the class is created thereby invoking constructor .
3)	The constructor initializes
	m=l(size of first array)
	n=h(size of second array)
	p=l+h(size of the merged array)
	arrays a[],b[],c[] are initialized by m,n,p;
4)	enter() function is invoked.
5)	It takes input of names in two arrays.
6)	At the same time array c[] is also being filled.
7)	sort() function is invoked. This function is invoked 3 times each time passing a String array with it.
8)	The array passed is sorted by bubble sorting technique and the control is return.
9)	After all the arrays are sorted, display() function is invoked 3 times, printing the array.
*/
