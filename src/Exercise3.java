import java.util.Scanner;

public class Exercise3 {
    static int [][] Input (int n) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j)
            {
                System.out.print("a["+i+","+j+"]= ");
                a[i][j]=in.nextInt();
            }
        return a;
    }
    static void Print(int[][] a){
        for (int i = 0; i < a.length; ++i, System.out.println() )
            for (int j = 0; j < a[i].length; ++j)
                System.out.print(a[i][j]+"\t");
    }

    static int [][] Result(int[][] a, int[][] b, int n){
        int[][] c = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j)
            {
                if(a[i][j] > b[i][j]) {
                    c[i][j] = 1;
                } else {
                    c[i][j] = 0;
                }
            }
        return c;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Array elements number ");
        System.out.print("n = ");
        int n= in.nextInt();
        if (n <= 15) {
            System.out.println("A array elements:");
            int[][] A = Input(n);
            System.out.println("B array elements:");
            int[][] B = Input(n);
            System.out.println("Array A:");
            Print(A);
            System.out.println("Array B:");
            Print(B);
            System.out.println("Array C:");
            Print(Result(A, B, n));
        } else {
            System.out.println("Error n > 15");
        }
        in.close();
    }

}
