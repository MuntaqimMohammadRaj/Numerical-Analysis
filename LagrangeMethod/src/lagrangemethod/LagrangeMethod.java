package lagrangemethod;
import java.util.Scanner;

public class LagrangeMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();

        double x[] = new double[n];
        double y[] = new double[n];
        double ans = 0, lob = 1, hor = 1;
        System.out.println("values of x & y are: ");
        for (int i = 0; i < n; i++) {
            System.out.print("x" + "(" + i + ")" + "=");
            x[i] = sc.nextDouble();
            System.out.print("y" + "(" + i + ")" + "=");
            y[i] = sc.nextDouble();
            
            System.out.println("");

        }
        System.out.print("Enter x for which y is to be calculated: ");
        int item = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    continue;
                 } 
                lob *= (item - x[j]);
                hor *= (x[i] - x[j]);
            }

            ans += (lob * y[i]) / hor;
            lob = 1;
            hor = 1;

        }
        System.out.println("Result = "+ ans);

    }
    
   

}

