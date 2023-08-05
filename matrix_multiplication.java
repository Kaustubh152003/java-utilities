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
    public static void scan_matrix(int mat[][],int x,int y)
    {
        int j=0;
        while(j<x)
        {
            int arr[]=new int[y];
            scan_array(arr,y);
            mat[j]=arr;
            j++;
        }
    }
    public static void print_matrix(int mat[][],int x,int y)
    {
        int j=0;
        while(j<x)
        {
            int arr[]=mat[j];
            print_array(arr,y);
            System.out.printf("\n");
            j++;
        }
    }
    public static int[][] multiply_matrix(int mat1[][],int x1,int y1,int mat2[][],int x2,int y2)
    {
        if(y1==x2)
        {
            int mat3[][]=new int[x1][y2];
            int j=0;
            while(j<x1)
            {
                int k=0;
                int arr[]=new int[y2];
                while(k<y2)
                {
                    int sum=0;
                    int x=0;
                    int y=0;
                    while(y<y1 && x<x2)
                    {
                        sum=sum+mat1[j][y]*mat2[x][k];
                        x++;
                        y++;
                    }
                    arr[k]=sum;
                    k++;
                }
                mat3[j]=arr;
                j++;
            }
            return mat3;
        }
        else
        {
            System.out.printf("Matrix multiplication not possible\n");
            return null;
        }
    }
	public static void main(String[] args) 
	{
		Scanner my_scanner=new Scanner(System.in);
		System.out.printf("Enter x of matrix1 : ");
		int x1=my_scanner.nextInt();
		System.out.printf("Enter y of matrix1 : ");
		int y1=my_scanner.nextInt();
		int mat1[][]=new int[x1][y1];
		scan_matrix(mat1,x1,y1);
// 		print_matrix(mat1,x1,y1);

        System.out.printf("Enter x of matrix2 : ");
		int x2=my_scanner.nextInt();
		System.out.printf("Enter y of matrix2 : ");
		int y2=my_scanner.nextInt();
		int mat2[][]=new int[x2][y2];
		scan_matrix(mat2,x2,y2);
// 		print_matrix(mat2,x2,y2);

        int[][] mat3=multiply_matrix(mat1,x1,y1,mat2,x2,y2);
        print_matrix(mat3,x1,y2);
        
	}
}
