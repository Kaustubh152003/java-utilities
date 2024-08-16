//when given a list file or string, can store this into actual list form
import java.util.ArrayList;
public class ListObject
{
    private ArrayList<String> l;
    ListObject()
    {
        this.l=new ArrayList<String>();
    }
    ListObject(String s)
    {
        this();
        int j=0;
        while(j<s.length() && s.charAt(j)!='-')
            j++;
        j++;
        while(j<s.length())
        {
            char ans[]=new char[s.length()];
            int p=0;
            while(j<s.length() && s.charAt(j)!='-')
            {
                ans[p]=s.charAt(j);
                p++;
                j++;
            }
            ans[p]='\0';
            l.add(new String(ans));
            j++;

        }
    }
    void addElement(String s)
    {
        l.add(s);
    }
    ArrayList<String> getList()
    {
        return new ArrayList<String>(l);
    }
    void print()
    {
        System.out.print(l);
    }
}
