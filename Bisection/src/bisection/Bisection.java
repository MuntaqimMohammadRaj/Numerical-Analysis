package bisection;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Bisection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        double a, b, c,prev,root;

        System.out.println("Enter the values of a & b: ");
        
            while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (f(a) * f(b) < 0) {
                c = (a + b) / 2;
                prev=c;
                System.out.println("The value of Root: " + c);
                break ;
            } else {
                System.out.println("Enter more Values for a & b:  ");
            }

        }
           /*
            while(true)
            {
                  if (f(a) * f(c) <= 0) {

                b = c;

            } else {
                a = c;

            }
            c = formater((a + b) / 2);
           System.out.println("The value of Root: " + c);
            
            if(Math.abs(prev-c)<=0.01){
                root=c;
                break;
            }
            else
            {
                prev=c;
            }
            }
            */

        while (true) {
            if (f(a) * f(c) <= 0) {

                b = c;

            } else {
                a = c;

            }
            c = formater((a + b) / 2);

            if (list.contains(c)) {
                break;
            } else {
                list.add(c);
                System.out.println("the value of Root: " + c);
            }
        }
        System.out.println("The Root is: " + c);

    }

    public static double f(double x) {
        //return 3 * x - Math.cos(x) - 1;
        return x*x-3;
    }

    public static double formater(double n) {
        DecimalFormat df = new DecimalFormat("#.####");
        n = Double.parseDouble(df.format(n));
        return n;
    }

}