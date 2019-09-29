import java.io.*;
import java.util.*;
class Q27
{
public static void main(String args[])throws IOException

{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int cou[];
    int words[]=new int[10];
    int vel[]=new int[10];
    String qq[];
    String ww[]=new String [10];
    System.out.println("Enter the sentnces:");
    int size=1;
    StringTokenizer st=new StringTokenizer(br.readLine());
    cou=new int[st.countTokens()];
    cou[0]=-1;
    qq=new String [st.countTokens()];
    int qwe=st.countTokens();
    for(int i=0;i<qwe;i++)
    {
		qq[i]=st.nextToken();
		if(qq[i].charAt(0)<64)
		{
			cou[size++]=i;
		}
	}
	cou[size]++;
	int q=0;
	for(int i=1;i<size;i++)
	{
		vel[i-1]=0;
		words[i-1]=-1;
		int flag=0;

		for(int j=cou[i-1]+1;j<=cou[i];j++)
		{
			words[i-1]++;
			if(flag==0)
			ww[i-1]=qq[q++];
			else
			ww[i-1]=ww[i-1]+qq[q++];
			flag =1;
		}
	}
 	String vuo="AEIOUaeiou";
	for(int i=0;i<size-1;i++)
	{
		for(int j=0;j<ww[i].length();j++)
		{
			if(vuo.indexOf(ww[i].charAt(j))>=0)
			vel[i]++;
		}
	}
	for(int i=0;i<size-1;i++)
	{
		System.out.println("The sentence "+(i+1)+"contains  "+vel[i]+"  vowels and  "+words[i]+" words.");
	    for(int j=0;j<vel[i];j++)
	    System.out.print("VVV");
	    System.out.println();
	    for(int j=0;j<words[i];j++)
	    System.out.print("WWW");
	    System.out.println();
	}
}
}
/*
Sample output:

1)	Enter the sentnces:
	He is good . He is nice ? bad day.
	The sentence 1contains  4  vowels and  3 words.
	VVVVVVVVVVVV
	WWWWWWWWW
	The sentence 2contains  4  vowels and  3 words.
	VVVVVVVVVVVV
	WWWWWWWWW
	The sentence 3contains  2  vowels and  2 words.
	VVVVVV
	WWWWWW
2)	Enter the sentnces:
	HELLO! HOW ARE YOU? HOPE EVERYTHING IS FINE. BEST OF LUCK.
	The sentence 1contains  2  vowels and  1 words.
	VVVVVV
	WWW
	The sentence 2contains  5  vowels and  3 words.
	VVVVVVVVVVVVVVV
	WWWWWWWWW
	The sentence 3contains  8  vowels and  4 words.
	VVVVVVVVVVVVVVVVVVVVVVVV
	WWWWWWWWWWWW
	The sentence 4contains  3  vowels and  3 words.
	VVVVVVVVV
	WWWWWWWWW

ALGORITHM
1)	Declare five arrays three of int type to store words
    int cou[];
    int words[]=new int[10];
    int vel[]=new int[10];
    String qq[];
    String ww[]=new String [10];
	vowels and the positions of signs. The other two of
	String type to store the input sentence and the sentences.
2)	Take input and and break it into tokens using string tokenizer.
 	StringTokenizer st=new StringTokenizer(br.readLine());
3)	Store the number of words int total and the positions of sings
	using for loop going from 0 to the number of tokens in total.
4)	Run a loop that many times which us equal to the number of sentences in total.
	whitin this loop count the number if vowels in each sentence and stroe it in
	for(int i=0;i<size-1;i++)
	the already made for the purpose.
5)	We already have the no of words in each sentnece so display them along with the sentence  number.
6)	Display pictorial representation of the number of words and vowels by using another two for loops nested
		for(int j=0;j<vel[i];j++)
		System.out.print("VVV");
		System.out.println();
		for(int j=0;j<words[i];j++)
		System.out.print("WWW");
		System.out.println();
	in the last loop.
*/
