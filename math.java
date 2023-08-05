public static long sum_of_first_n(long n)
{
    n=n*(n+1);
    n=n/2;
    return n;
}
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
