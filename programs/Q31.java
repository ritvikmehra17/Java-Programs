import java.io.*;
class Q31
{
	static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	void moves(int n,double a[],double b[])
  	{
		if(n==0)
		return;
		moves(n-1,a,b);
		a[n]=-a[n];
		a[0]+= 2*a[n];
		if(Math.abs(a[0])<Math.abs(b[0]))
		for(int i=0;i<a.length;i++)
		b[i]=a[i];
		moves(n-1,a,b);
	}
	public static void main(String[] args)throws IOException
	{
		Q31 obj=new Q31();
		System.out.println("Enter the size");
		int N=Integer.parseInt(br.readLine());
		double[]a=new double[N+1];
		double[]b=new double[N+1];
		System.out.println("Enter the numbers");
		for(int i=1;i<=N;i++)
		a[i]=Double.parseDouble(br.readLine());
		for(int i=1;i<=N;i++)
		a[0]+=a[i];
		b[0]=a[0];
		obj.moves(N, a, b);
		Double c[]=new Double[N];
		Double d[]=new Double[N];
		int g=0,h=0;
		for(int i=1;i<=N;i++)
		{
			if(b[i]<0)
			c[g++]=(-1)*b[i];
			else
			d[h++]=b[i];
		}
		System.out.println("The first group is");
		for(int i=0;i<g;i++)
		System.out.print(c[i]+", ");
		System.out.println();
		System.out.println("The second group is");
		for(int i=0;i<h;i++)
		System.out.print(d[i]+", ");
		System.out.println();
		if(b[0]<0)
		b[0]=(-1)*b[0];
		System.out.println("Difference: "+ b[0]);
	}
}
/*
Sample output:

1)	Enter the size
	10
	Enter the numbers
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
	The first group is
	2.0, 3.0, 4.0, 5.0, 6.0, 7.0,
	The second group is
	1.0, 8.0, 9.0, 10.0,
	Difference: 1.0

2)	Enter the size
	7
	Enter the numbers
	12
	19
	51
	28
	65
	41
	79
	The first group is
	12.0, 19.0, 51.0, 65.0,
	The second group is
	28.0, 41.0, 79.0,
	Difference: 1.0

Algorithm
1)	User enters the no. of numbers in integer type variable N.
2)	Double type array a and b are initialised with their size as N+1.
3)	User enters the desired nos. in the array a in positions 1 to N.
4)	The sum of all the nos. is stored in a[0] and b[0].
5)	Recursive function moves() is called with variable n, array a and array b as the parameters. Function moves() stores the nos. for the first group as positive nos. while the nos. for the second group as negative nos. in the array b after position 0, at which it stores the difference of the two groups.
6)	Double type array c and d are initialised with size N and the positive nos. n array b i.e., the first group is stored in c while the negative nos. i.e., the second group is stored in d.
7)	Array c and d are printed as the first nd second group and b[0] is printed as the difference between them, thus giving the desired output.
*/
