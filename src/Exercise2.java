import java.util.Scanner;

public class Exercise2 {
    static int [] Input(int n) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("a[" + i + "]= ");
            a[i] = in.nextInt();
        }
        return a;
    }

    static void Print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if ((i+1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    static void Change(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] >= 0 && a[j + 1] < 0) {
                    int w = a[j];
                    a[j] = a[j+1];
                    a[j+1] = w;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=in.nextInt();
        if (n <= 400) {
            int[] myArray = Input(n);
            System.out.println("Entered array:");
            Print(myArray);
            Change(myArray);
            System.out.println("Changed array:");
            Print(myArray);
        } else {
            System.out.println("Error n > 400");
        }
        in.close();

    }
}
