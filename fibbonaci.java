import java.util.Scanner;

public class q7 
{
    public static int fib_num(int x)
    {
        if(x<2)
        {
            if(x==0)
            return 0;
            else
            return 1;
        }
        else
        {
            int a=0;
            int b=1;
            int j=2;
            while(j<=x)
            {
                int c=a+b;
                a=b;
                b=c;
                j++;
            }
            return b;
        }
    }
    public static void print_array(int arr[],int n)
    {
        int j=0;
        while(j<n)
        {
            System.out.printf("%d ",arr[j]);
            j++;
        }
    }
    public static void main(String args[])
    {
        Scanner my_scanner=new Scanner(System.in);
        System.out.printf("Enter a: ");
        int n=1000;
        int a=my_scanner.nextInt();
        int fib[]=new int[n];
        int j=0;
        while(j<n)
        {
            fib[j]=-1;
            j++;
        }
        fib[0]=0;
        fib[1]=1;
        j=2;
        while(j<=a)
        {
            fib[j]=fib[j-1]+fib[j-2];
            j++;
        }
        int an=j;
        print_array(fib, an);
        my_scanner.close();
    }
}
