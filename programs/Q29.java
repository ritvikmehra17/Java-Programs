import java.io.*;
class Q29
{
	public static void main(String args[])throws IOException
	{
     	InputStreamReader inp=new InputStreamReader(System.in);
	    BufferedReader ob=new BufferedReader(inp);
	    int n,am[],w[]={0,1,2,3,4,5,6,7,8,9},df[]={1000,500,100,50,20,10,5,2,1};
	    String str="",ams="",wor[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
	    System.out.print("Enter the amount"+" "+':');
	    n=Integer.parseInt(ob.readLine());
	    if(n>99999)
	    {
			System.out.println("INVALID AMOUNT");
			System.exit(0);
		}
	    str=String.valueOf(n);
	    am=new int[str.length()];
	    for(int i=0;i<str.length();i++)
	    {
			am[i]=((int)str.charAt(i)-48);
			for(int j=0;j<w.length;j++)
			{
				if(am[i]==w[j])
				{
					ams=ams+wor[j];
					ams=ams+" ";
				}
			}
		}
		System.out.println(ams);
		while(n>0)
		{
			if(n>df[0]){
			System.out.println("1000*"+n/df[0]+"="+(1000*(n/df[0])));n=n%df[0];}
			else if(n>df[1]){
			System.out.println("500*"+n/df[1]+"="+(500*(n/df[1])));n=n%df[1];}
		    else if(n>df[2]){
			System.out.println("100*"+n/df[2]+"="+(100*(n/df[2])));n=n%df[2];}
			else if(n>df[3]){
			System.out.println("50*"+n/df[3]+"="+(50*(n/df[3])));n=n%df[3];}
			else if(n>df[4]){
			System.out.println("20*"+n/df[4]+"="+(20*(n/df[4])));n=n%df[4];}
			else if(n>df[5]){
			System.out.println("10*"+n/df[5]+"="+(10*(n/df[5])));n=n%df[5];}
			else if(n>df[6]){
			System.out.println("5*"+n/df[6]+"="+(5*(n/df[6])));n=n%df[6];}
			else if(n>df[7]){
			System.out.println("2*"+n/df[7]+"="+(2*(n/df[7])));n=n%df[7];}
			else{
			System.out.println("1*"+n/df[8]+"="+(1*(n/df[8])));n=n%df[8];}
		}
	}
}
/*
Sample output:

1)	Enter the amount :14836
  	ONE FOUR EIGHT THREE SIX
  	1000*14=14000
  	500*1=500
  	100*3=300
  	20*1=20
  	10*1=10
  	5*1=5
  	1*1=1

2)	Enter the amount :235005
  	INVALID AMOUNT

ALGORITHM
1)	integer type variable n to store the amount.
	w[] to store number from 1-9.df[] to store the denomination factor.
	wor[] store all the numbers from 1-9 in word.am[] to store each digit of the amount.
	ams to store the amount in String.
2)	n is converted to string type and each character is extracted and matched for its word form in wor[].
3)	When found the element of wor[] is added to ams.
4)	For denomination of the amount the while loop executes till amount is greater than 0.
5)	When the denominating factor is able to divide the amount then the denomination is printed.
*/
