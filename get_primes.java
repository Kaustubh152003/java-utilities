import java.util.Scanner;

public class Main
{
    public static void print_array(int arr[],int n)
    {
        int j=0;
        while(j<n)
        {
            System.out.printf("%d ",arr[j]);
            j++;
        }
    }
    public static void mark_primes(int arr[],int n) //0 is prime, 1 is composite
    {
        int j=0;
        while(j<n)
        {
            arr[j]=0;
            j++;
        }
        arr[0]=-1;
        arr[1]=-1;
        j=2;
        while(j<n)
        {
            if(arr[j]==0)
            {
                int k=2;
                int x=j;
                while(k*x<n)
                {
                    arr[k*x]=1;
                    k++;
                }
            }
            j++;
        }
        
    }
    public static void get_primes_from_a_to_b(int a,int b)
    {
        int primes[]=new int[b+1];
        mark_primes(primes,b+1);
        int j=a;
        while(j<=b)
        {
            if(primes[j]==0)
            System.out.printf("%d ",j);
            j++;
        }
    }
	public static void main(String[] args) 
	{
		Scanner my_scanner=new Scanner(System.in);
		System.out.printf("Enter a : ");
		int a=my_scanner.nextInt();
		System.out.printf("Enter b : ");
		int b=my_scanner.nextInt();
		get_primes_from_a_to_b(a,b);
		
        
	}
}
