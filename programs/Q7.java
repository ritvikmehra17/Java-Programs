import java.io.*;
import java.util.*;
class Q7
{
	int arr[];
	int n;
    Q7(int nm)
    {
		n=nm;
        arr=new int[n];
    }
    void input()throws IOException
    {
		Scanner imp=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
			arr[i]=imp.nextInt();
        }
     }
     void display()
     {
		 for(int i=0;i<n;i++)
         {
             System.out.print(arr[i]+" ");
         }
         System.out.println("");
     }
     Q7 intersection(Q7 obj)
     {
          int size=0;
          if(n<obj.n)
          size=n;
          else
          size=obj.n;
          Q7 obj1=new Q7(size+100);
          size=0;
          int tep[]=new int[n];
          int tep1[]=new int[obj.n];
          for(int i=0;i<n;i++)
          {
			  tep[i]=arr[i];
          }
          for(int i=0;i<obj.n;i++)
          {
              tep1[i]=obj.arr[i];
          }
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<obj.n;j++)
              {
                 if(tep[i]==tep1[j])
                 {
                    obj1.arr[size++]=tep[i];
                    tep[i]=tep[j]=0;
                     break;
                 }
              }
          }
          obj1.n=size;
          return obj1;
	  }
	  Q7 union(Q7 obj)
	  {
		  Q7 obj1=new Q7(n+obj.n);
          int size=0;
          Arrays.sort(arr);
          Arrays.sort(obj.arr);
          int a=0,b=0;
          try
          {
			  for(int i=0;i<(n+obj.n);i++)
              {
                	if(a==n&&b!=obj.n)
                    {
                        obj1.arr[size++]=obj.arr[b];
                        b++;
                    }
                    else if(a!=n&&b==obj.n)
                    {
                        obj1.arr[size]=arr[a++];
                        size=size+1;
                    }
                    else if(arr[a]==obj.arr[b])
                    {
                        obj1.arr[size++]=arr[a++];
                         b++;
                    }
                    else if(arr[a]<obj.arr[b])
                    {
                         obj1.arr[size++]=arr[a++];
                    }
                    else
                    {
                          obj1.arr[size++]=obj.arr[b++];
                    }
				}
			}
			catch(Exception e)
			{
	            System.out.println();
            }
            obj1.n=size;
            return obj1;
		}
		public static void main(String []args)throws IOException
		{
		   Scanner imp=new Scanner(System.in);
           System.out.println("Enter the size of first array less than 50");
           Q7 obj1=new Q7(imp.nextInt());
           obj1.input();
           System.out.println("Enter the size of second array less than 50");
           Q7 obj2=new Q7(imp.nextInt());
           obj2.input();
           Q7 obj3=obj1.intersection(obj2);
           System.out.println("Intersection of the two arrays is:");
           obj3.display();
           obj3=obj1.union(obj2);
           System.out.println("The union is:");
           obj3.display();
        }	}
/*
Sample output:
1)	Enter the size of first array less than 50
	5
	Enter the elements
	1 4 5 68 9
	Enter the size of second array less than 50
	6
	Enter the elements
	1 3 4 88 66 99
	Intersection of the two arrays is:
	1 4
	The union is:
	1 3 4 5 9 66 68 88 99

2)	Enter the size of first array less than 50
	5
	Enter the elements
	5
	4
	3
	2
	1
	Enter the size of second array less than 50
	5
	Enter the elements
	5
	6
	7
	8
	9
	Intersection of the two arrays is:
	5
	The union is:
	1 2 3 4 5 6 7 8 9

ALGORITHM
1)	Decalre class varialbles int size(to store size),int arr[](to store the array elements).
2)	Define two function one for intersection and other for union of the sets.
3)	Both the functions are static and take class object as parameters.
	In intersection function first sort the arrays of calling and passed objects.
4)	Define another object of class type to store and to return the final array.
5)	Find all the common elments by using the simple procedure of searching one element in
	other array if found then store it in the array of the object just declared.
6)	Finally return the object with the intersection of the sets,
	take the address in another declared object in the main funtion and call
	display.
7)	Follow step 3 and 4 for the union funtion as well.
8)	Now using variables and loops fill the union set ensuring that no duplicate
	element comes in it.
9)	Finally return the union object and follow step 6.
10)	Display the reqired result.
*/
