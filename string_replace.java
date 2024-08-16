public static boolean issubequal(String s1,int j,String s2,int k)//does s1 starting at j equal contain s2 starting at k
{
    while(j<s1.length() && k<s2.length() && s1.charAt(j)==s2.charAt(k))
    {
        j++;
        k++;
    }
    if(k==s2.length())
        return true;
    else
        return false;
}
public static String replace(String str,String s1,String s2) //returns a new string which has all occurences of s1 replaced with with s2 in str
{
    char ans[]=new char[str.length()+10000];
    int p=0;
    int j=0;
    while(j<str.length())
    {
        if(issubequal(str,j,s1,0))
        {
            int k=0;
            while(k<s2.length())
            {
                ans[p]=s2.charAt(k);
                p++;
                k++;
            }
            j=j+s1.length();

        }
        else
        {
            ans[p]=str.charAt(j);
            p++;
            j++;
        }
    }
    ans[p]='\0';
    p++;
    return new String(ans);

}
