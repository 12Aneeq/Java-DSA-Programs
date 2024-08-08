import java.util.*;

public class patterns {
    public static void hollow_rectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_number(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_pattern(int n) {
        // For 1st half
        for (int i = 1; i <= n; i++) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces - (n-i)*2
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // For 2nd half
        for (int i = n; i >= 1; i--) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces - (n-i)*2
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
        }
        System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for (int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        //1st half
        for(int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1; i--){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        /*
         * System.out.println("Enter the number of rows: ");
         * int rows = sc.nextInt();
         * System.out.println("Enter the number of columns: ");
         * int columns = sc.nextInt();
         * hollow_rectangle(rows, columns);
         */

        /*
         * System.out.println("Enter the number of lines: ");
         * int n = sc.nextInt();
         * inverted_half_pyramid(n);
         */

        /*
         * System.out.println("Enter the number of lines: ");
         * int n = sc.nextInt();
         * inverted_half_pyramid_number(n);
         */

        /*
         * System.out.println("Enter the number of line: ");
         * int n = sc.nextInt();
         * floyd_triangle(n);
         */

        /*
         * System.out.println("Enter the number of line: ");
         * int n = sc.nextInt();
         * zero_one_triangle(n);
         */

        /*System.out.println("Enter the number of line: ");
        int n = sc.nextInt();
        butterfly_pattern(n);*/

        /*System.out.println("Enter the number of line: ");
        int n = sc.nextInt();
        solid_rhombus(n);*/

        /*System.out.println("Enter the number of line: ");
        int n = sc.nextInt();
        hollow_rhombus(n);*/

        System.out.println("Enter the number of line: ");
        int n = sc.nextInt();
        diamond(n);
    }
}