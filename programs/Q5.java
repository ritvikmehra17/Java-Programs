import java.io.*;
class Q5
{
	public static void main(String args[])throws IOException
	{
		String m,vw="",vow="aeiouAEIOU";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the PARAGRAPH.");
		m=br.readLine();
		int n=0,k=0,h=0;
		for(int i=0;i<m.length();i++)
		{
			if((m.charAt(i)==',')||(m.charAt(i)=='.')||(m.charAt(i)=='?')||(m.charAt(i)=='!'))
			n++;
		}
		String ar[]=new String[n];
		for(int i=0;i<m.length();i++)
		{
			if((m.charAt(i)==',')||(m.charAt(i)=='.')||(m.charAt(i)=='?')||(m.charAt(i)=='!'))
			{
				ar[k]=m.substring(h,i+1);
				h=i+2;
				k++;
			}
		}
		for(int q=0;q<n;q++)
		{
			int p=0,r=0,s=0;
			for(int i=0;i<ar[q].length();i++)
			{
				if((ar[q].charAt(i)==' ')||(ar[q].charAt(i)==',')||(ar[q].charAt(i)=='.')||(ar[q].charAt(i)=='?')||(ar[q].charAt(i)=='!'))
				p++;
			}
			String arr[]=new String[p];
			for(int i=0;i<ar[q].length();i++)
			{
				if((ar[q].charAt(i)==' ')||(ar[q].charAt(i)==',')||(ar[q].charAt(i)=='.')||(ar[q].charAt(i)=='?')||(ar[q].charAt(i)=='!'))
				{
					arr[r]=ar[q].substring(s,i);
					s=i+1;
					r++;
				}
			}
			for(int i=0;i<p;i++)
			{
				if((vow.indexOf(arr[i].charAt(0))>=0)&&(vw.indexOf(arr[i])<0))
				vw=vw+arr[i]+' ';
			}
			for(int i=0;i<p-1;i++)
			{
				int index = i;
				for (int j=i+1;j<p;j++)
				{
					if (arr[j].compareTo(arr[index])<0)
					index = j;
				}
				String temp=arr[index];
				arr[index]=arr[i];
				arr[i]=temp;
			}
			char v=ar[q].charAt(ar[q].length()-1);
			ar[q]="";
			for(int i=0;i<p;i++)
			{
				if(ar[q].indexOf(arr[i])<0)
				{
					if(i!=p-1)
					ar[q]=ar[q]+arr[i]+' ';
					else
					ar[q]=ar[q]+arr[i];
				}
				if(i==p-1)
				{
					if(ar[q].charAt(ar[q].length()-1)==' ')
					ar[q]=ar[q].substring(0,ar[q].length()-1)+v;
					else
					ar[q]=ar[q]+v;
				}
			}
		}
		System.out.print("Output:	");
		for(int i=0;i<n;i++)
		System.out.print(ar[i]+' ');
		System.out.println();
		System.out.println("Vowels:	"+vw);
	}
}
/*
Sample Output:
1)	Enter the PARAGRAPH.
	HELLO! HOW ARE YOU? WHEN ARE YOU COMING? HOPE TO SEE YOU SOON.
	Output: HELLO! ARE HOW YOU? ARE COMING WHEN YOU? HOPE SEE SOON TO YOU.
	Vowels: ARE

2)	Enter the PARAGRAPH.
	THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG.
	Output: BROWN DOG FOX JUMPED LAZY OVER QUICK THE.
	Vowels: OVER

3)	Enter the PARAGRAPH.
	Can you define plan as a loose sequence of manifestly inadequate observations and
	conjectures, held together by panic, indecision and ignorance? If so, it was a very
	good plan.
	Output: Can and as conjectures define inadequate loose manifestly observations of
	plan sequence you, by held panic together, and ignorance indecision? If so, a
	good it plan very was.
	Vowels: as of inadequate observations and indecision ignorance If it

ALOGRITHM
1)	String type variables m,vw and vow are initialised to store the string
	entered by user, words starting with vowels, and vowels respectively.
2)	Integer type variables n, k and h are initialised to count the no. of sentences,
	position of sentences in the String type array ar, which stores the sentences
	from the para., and the position of the start of next sentence in the string
	respectively.
3)	The string is split into sentences which are stored as elements of the array ar
	by using th following loop:
	 for(int i=0;i<m.length();i++)
	 {
	  if((m.charAt(i)==',')||(m.charAt(i)=='.')||(m.charAt(i)=='?')||(m.charAt(i)=='!'))
	  {
		ar[k]=m.substring(h,i+1);
		h=i+2;
		k++;
	  }
	 }
4)	Integer type variables p, r and s are initialised in for loop for same functions as n,
	k and h, but for splitting each sentence from ar into words, which are then stored in
	string type array arr.
5)	Words in arr are checked whether they are starting from a vowel. If they are, then they
	are added to vw.
6)	The words of the array arr are sorted by bubble sorting in alphabetical
	order by using .compareTo function.
7)	The sorted arr array is stored again as a single element in the ar array, thus storing
	the sorted sentence in each element.
8)	The elements of the array ar and the variable vw are printed thus giving the required
	output.
*/
