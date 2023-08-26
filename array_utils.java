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
int bs(int arr[],int l,int r,int k)
{
    if(l<=r)
    {
        int m=(l+r)/2;
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
