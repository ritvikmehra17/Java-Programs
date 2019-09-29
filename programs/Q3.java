import java.io.*;
class Q3
{
	public static void main(String args[])throws Exception
	{
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		String str="",w="";
		String word[];
		int t=0,z,wc=0;
		System.out.print("Input:"+"	");
		System.out.println("Enter the string");
		str=ob.readLine();
		if((int)str.charAt(0)>=65&&(int)str.charAt(0)<=91)
		str=((char)((int)str.charAt(0)+32))+str.substring(1);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(i==0&&(ch==' '||ch=='.'))
			continue;
			if(ch==' '||ch=='.')
			wc=wc+1;
		}
		word=new String[wc];
		System.out.println(wc);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(i==0)
			{
				if(ch==' '||ch=='.')
				continue;
			}
			if(ch!=' '&&ch!='.')
			w=w+ch;
			else
			{
				word[t]=w;
				t++;
				w="";
			}
		}
		for(int i=0;i<word.length;i++)
		{
			for(int j=0;j<word.length-1;j++)
			{
		        if(word[j].length()>word[j+1].length())

				{
					String swap=word[j];
					word[j]=word[j+1];
					word[j+1]=swap;
				}
			}
		}
		for(int i=0;i<wc;i++)
		{
			if(i==0&&(word[i].charAt(0)>=97&&word[i].charAt(0)<=123))
			word[i]=((char)((int)word[i].charAt(0)-32))+word[i].substring(1);
			System.out.print(word[i]);
			if(i!=wc-1)
			System.out.print(" ");
		}
		System.out.print('.');
	}
}
/*
Sample Output:
1)	Input:  Enter the string
	This is a sentence.
	4
	A is this sentence.

2)	Input:  Enter the string
	Program in java.
	3
	In java program.

ALGORITHM
1)	Declare a string variable to store the entered string,
	an string array to store the words.
2)	Take the input fron the user and store in the str.
3)	If first character of the sentence is capital make it small.
4)	Using a for loop for(int i=0;i<str.length();i++) and a
	if(word[j].length()>word[j+1].length()) condition statement in it to store the
	words in the array also store the number of words.
5)	Now by using bubble sorting
	for(int i=0;i<word.length;i++)
	for(int j=0;j<word.length-1;j++)
	and the ascii value of the first character
	and the length of the words if(word[j].length()>word[j+1].length())
	to sort the array containig the words.
6)	Initialize a for loop for(int i=0;i<wc;i++) and print the words and at
	last make the first character capital and end the sentence with a full stop.
*/
