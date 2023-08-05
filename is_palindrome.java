import java.util.Scanner;

public class q6 
{
    public static int number_of_digits(int x)
    {
        if(x<0)
        x=-x;
        int j=0;
        while(x>0)
        {
            x=x/10;
            j++;
        }
        return j;
        
    }
    public static int is_palindrome(int x)
    {
        int n2=number_of_digits(x);
        int arr[]=new int[n2];
        int j=0;
        while(x>0)
        {
            arr[j]=x%10;
            j++;
            x=x/10;
        }
        int n=j;
        int p=0;
        int q=n-1;
        while(p<q && arr[p]==arr[q])
        {
            p++;
            q--;
        }
        if(p>=q)
        return 1;
        else
        return 0;

        
    }
    public static int reverse_of_number(int x)
    {
        int sign=1;
        if(x<0)
        {
            x=-x;
            sign=-1;
        }
        int n2=number_of_digits(x);
        int arr[]=new int[n2];
        int j=0;
        while(x>0)
        {
            arr[j]=x%10;
            j++;
            x=x/10;
        }
        int n=j;
        j=0;
        int num=0;
        while(j<n)
        {
            num=num*10+arr[j];
            j++;
        }
        return sign*num;

        
    }
    public static void main(String[] args) 
	{
		Scanner my_scanner = new Scanner(System.in);
		System.out.printf("Enter a: ");
        int a=my_scanner.nextInt();
        int ans= is_palindrome(a);

        
        if(ans==1)
        System.out.printf("YES\n");
        else
        System.out.printf("NO\n");

        // if(reverse_of_number(a)==a)
        // System.out.printf("YES\n");
        // else
        // System.out.printf("NO\n");

        my_scanner.close();
	}
}
