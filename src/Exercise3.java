import java.util.Scanner;

public class Exercise3 {
    static int [][] input (int n) {
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
    static void print(int[][] a){
        for (int i = 0; i < a.length; ++i, System.out.println() )
            for (int j = 0; j < a[i].length; ++j)
                System.out.print(a[i][j]+"\t");
    }

    static int [] result(int[][] a, int[][] b, int n){
        int[] c = new int[n];
        int counter = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (a[i][j] > b[i][j]) {
                    counter++;
                }
            }
            if (counter == n) {
                c[i] = 1;
            } else {
                c[i] = 0;
            }
            counter = 0;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Array elements number ");
        System.out.print("n = ");
        int n = in.nextInt();
        if (n <= 15) {
            System.out.println("A array elements:");
            int[][] A = input(n);
            System.out.println("B array elements:");
            int[][] B = input(n);
            System.out.println("Array A:");
            print(A);
            System.out.println("Array B:");
            print(B);
            System.out.println("Array C:");
            int[] resultVector = result(A, B, n);
            for (int j : resultVector) {
                System.out.print(j + " ");
            }
        } else {
            System.out.println("Error n > 15");
        }
        in.close();
    }

}
