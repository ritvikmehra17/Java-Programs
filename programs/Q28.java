import java.io.*;
class Q28
{
	static int[] findLis(int[] arr)
	{
		int[] is = new int[arr.length];
		int index = 0;
		is[0] = index;
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] < arr[is[index]])
			{
				for (int j = 0; j <= index; j++)
				{
					if (arr[i] < arr[is[j]])
					{
						is[j] = i;
						break;
					}
				}
			}
			else if (arr[i] != arr[is[index]])
			is[++index] = i;
		}
		int[] lis = new int[index + 1];
		lis[index] = arr[is[index]];
		for (int i = index - 1; i >= 0; i--)
    	{
			if (is[i] < is[i + 1])
			lis[i] = arr[is[i]];
			else
			{
				for (int j = is[i + 1] - 1; j >= 0; j--)
				{
					if (arr[j] > arr[is[i]] && arr[j] < arr[is[i + 1]])
					{
						lis[i] = arr[j];
						is[i] = j;
						break;
					}
				}
			}
		}
		return lis;
	}
	public static void main(String[] args)throws IOException
	{
		int n,arr[];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Q28 obj=new Q28();
		System.out.println("Enter Size of array.");
		n=Integer.parseInt(br.readLine());
		arr= new int[n];
		System.out.println("Enter the elements.");
		for(int j=0;j<n;j++)
		arr[j]=Integer.parseInt(br.readLine());
		int p[]=obj.findLis(arr);
    	for (int i=0;i<p.length;i++)
    	System.out.print(p[i]+" ");
    	System.out.println();
	}
}
/*
Sample output:

1)	Enter Size of array.
	10
	Enter the elements.
	9
	1
	2
	35
	14
	9
	20
	25
	30
	21
	1 2 9 20 25 30

2)	Enter Size of array.
	5
	Enter the elements.
	3
	5
	7
	9
	11
	3 5 7 9 11

Algorithm
1)	Integer type variable n and integer type array arr are initialised.
2)	User enters the size of the array in variable n.
3)	n is assigned as the size of array arr.
4)	User enters the elements of array arr.
5)	Function findLis() is called with array arr as the parameter.
6)	Function findLis() finds the the longest sub-sequence of numbers in
	ascending order and returns the result to the main method as an array.
7)	The result of findLis() is stored in an integer type array p.
8)	Array p is displayed as the required output.
*/
