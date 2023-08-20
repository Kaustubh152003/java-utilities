import java.util.*;

class Node
{
    char data;
    Node next;
    Node(char data)
    {
        this.data=data;
        next=null;
    }
}

class reverseMain
{
    static Node reverselist(Node head)
    {
        int n=0;
        Node x=head;
        while(x!=null)
        {
            n++;
            x=x.next;
        }
        char arr[]=new char[n];
        x=head;
        int j=0;
        while(x!=null && j<n)
        {
            arr[j]=x.data;
            x=x.next;
            j++;
        }
        j=0;
        Node newhead=null;
        while(j<n)
        {
            Node x1=new Node(arr[j]);
            if(newhead==null)
            newhead=x1;
            else
            {
                x1.next=newhead;
                newhead=x1;
            }
            j++;
        }
        return newhead;
    }
}
public class Q1
{
    public static Node read_ll(int n)
    {
        Scanner my_scanner=new Scanner(System.in);
        int j=0;
        Node head=null;
        Node tail=null;
        while(j<n)
        {
            System.out.printf("Enter node:");
		    char x=my_scanner.nextLine().charAt(0);
		    Node ptr=new Node(x);
		    if(tail==null)
		    head=tail=ptr;
		    else
		    {
		        tail.next=ptr;
		        tail=ptr;
		    }
		    j++;
		    
        }
        return head;
    }
    public static void print_ll(Node head)
    {
        while(head!=null)
        {
            System.out.printf("%c",head.data);
            head=head.next;
        }
    }
	public static void main(String[] args) 
	{
		Scanner my_scanner=new Scanner(System.in);
		System.out.printf("Enter the number of nodes:");
		int n=my_scanner.nextInt();
		Node head=read_ll(n);
		print_ll(head);
		System.out.printf("\n");
		Node newhead=reverseMain.reverselist(head);
		print_ll(newhead);
		
		
	}
}


///////////////////////
///////////////////////
///////////////////////

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}

class ll
{
    Node head;
    Node tail;
    ll()
    {
        head=null;
        tail=null;
    }
    void insert_front(int x)
    {
        Node ptr=new Node(x);
        ptr.next=head;
        head=ptr;
        if(tail==null)
        tail=ptr;
    }
    void insert_back(int x)
    {
        Node ptr=new Node(x);
        if(tail==null)
        {
            tail=ptr;
            head=ptr;
        }
        else
        {
            tail.next=ptr;
            tail=ptr;
        }
    }
    void print_ll()
    {
        while(head!=null)
        {
            System.out.printf("%c ",head.data);
            head=head.next;
        }
    }
}
