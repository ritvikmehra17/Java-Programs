import java.util.*;
import java.io.*;
public class Q9
{

    static void yarg(String prefix, int n)
 {
        if (n == 0) System.out.println(prefix);
        else {
            gray(prefix + "1", n - 1);
            yarg(prefix + "0", n - 1);
        }
    }

    static void gray(String prefix, int n)
{
        if (n == 0) System.out.println(prefix);
        else {
            gray(prefix + "0", n - 1);
            yarg(prefix + "1", n - 1);
        }
    }
    public static void main(String[] args)throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the number");
        int N = Integer.parseInt(br.readLine());
        gray("", N);
    }

}
/*
Sample Output:
Enter the number
4
0000
0001
0011
0010
0110
0111
0101
0100
1100
1101
1111
1110
1010
1011
1001
1000
*/
