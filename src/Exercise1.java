import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Please enter variant");
        Scanner in = new Scanner(System.in);
        int variant = in.nextInt();
        if (variant == 1) {
            System.out.println("Please enter int n,m");
            int n = in.nextInt();
            int m = in.nextInt();
            int result = (int)((n-1)/(Math.pow(n, 2) * m + 2) + (m+n)/(m-n) + Math.pow(n, 3));
            System.out.println(result);
        } else if (variant == 2) {
            System.out.println("Please enter int n,m");
            int n = in.nextInt();
            int m = in.nextInt();
            float result = (float)((n-1)/(Math.pow(n, 2) * m + 2) + (m+n)/(m-n) + Math.pow(n, 3));
            System.out.println(result);
        } else {
            System.out.println("Please enter float n,m");
            float n = in.nextFloat();
            float m = in.nextFloat();
            float result = (float)((n-1)/(Math.pow(n, 2) * m + 2) + (m+n)/(m-n) + Math.pow(n, 3));
            System.out.println(result);
        }
        in.close();
    }
}

