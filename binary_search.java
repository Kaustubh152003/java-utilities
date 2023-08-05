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
    public static void scan_array(int arr[],int n)
    {
        Scanner my_scanner=new Scanner(System.in);
        int j=0;
        while(j<n)
        {
            arr[j]=my_scanner.nextInt();
            j++;
        }
    }
    public static int bs(int arr[],int l,int r,int k)
    {
        if(l<=r)
        {
            int m=(r-l+1)/2;
            if(arr[m]==k)
            return m;
            else
            {
                if(k<arr[m])
                return bs(arr,l,m-1,k);
                else
                return bs(arr,m+1,r,k);
            }
        }
        else
        return -1;
    }
	public static void main(String[] args) 
	{
		Scanner my_scanner=new Scanner(System.in);
		System.out.printf("Enter n : ");
		int n=my_scanner.nextInt();
		System.out.printf("Give sorted array : ");
        int arr[]=new int[n];
        scan_array(arr,n);
        System.out.printf("Enter key : ");
		int k=my_scanner.nextInt();
        int ans=bs(arr,0,n-1,k);
        System.out.printf("the element is at : %d\n",ans);
        
	}
}
