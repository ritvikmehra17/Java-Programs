import java.io.*;
import java.util.*;
class Q25
{
	public static void main(String args[])throws Exception
	{
		Scanner imp = new Scanner(System.in);
        int m=0,n=0;
        System.out.println("Enter the size of matrix press enter then enter the elements:");
        int or[][]=new int[(m=imp.nextInt())][(n=imp.nextInt())];
        String oor[]=new String[m];
        String ocr[]=new String[m];
        for(int i=0;i<m;i++)
        {
         	for(int j=0;j<n;j++)
        	{
        		or[i][j]=imp.nextInt();
        	}
        }
        System.out.println("Enter the elements of second matrix:");
        int oc[][]=new int[(m)][(n)];
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
         		oc[i][j]=imp.nextInt();
          	}
        }
        int a=0;
        try
        {
			for(int i=0;i<n;i++)
            {
              	for(int j=0;j<m;j++)
            	{
            		ocr[a]=(oc[j][i])+"";
             	    oor[a]=(or[j][i])+"";
            	    a=a+1;
				}
			}
		}
		catch(Exception e)
        {
        }
        int flag=0;
        for(int i=0;i<m;i++)
        {
         	flag=0;
           	for(int j=0;j<m;j++)
           	{
        		if(ocr[i].equals(oor[j]))
        		flag=1;
           	}
         	if(flag==0)
           	break;
        }
     	if(flag==0)
    	System.out.println("Not possible");
    	else
      	System.out.println("Possible");
	}
}
/*
Sample output:
1)	Enter the size of matrix press enter then enter the elements:
	4 3


	1 2 3 4
	1 2 3 4
	1 2 3 4
	Enter the elements of second matrix:


	4 3 2 1
	4 3 2 1
	4 3 2 1
	Possible



2)	Enter the size of matrix press enter then enter the elements:
	2 2


	5 5
	6 7
	Enter the elements of second matrix:


	4 5
	6 7
	Not possible

ALGORITHM
1)	Declare the variables
	 	int m=0,n=0 to store the size of the matrix.
		int or[][]=new int[(m=imp.nextInt())][(n=imp.nextInt())]
    this array is to store the input of matrix.
		int oc[][]=new int[(m)][(n)] to store the second matrix.
2)	String oor[]=new String[m]
 	to store the column in string form.
 	String ocr[]=new String[m]
3)	Take input from the user using for loop and
  	using the size entered initialize the matrix.
4)	Take input from the second matrix.
5)	Our aim is to check if wrt to each column in the first
  	there is a colunm in second matrix or not.
6)	To check this find each element of oor[] in ocr[]
  	if all elements of first are present if(ocr[i].equals(oor[j]))
  	in second then it means that it is possible.
7)	Display approprite message along with the matrices.
8)	Program end.
*/
