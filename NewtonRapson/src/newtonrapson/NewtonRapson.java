
package newtonrapson;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class NewtonRapson {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        double a, b;

        System.out.println("Enter the values of a & b: ");
        
        exit: while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (f(a) * f(b) < 0) {
                
                break exit;
             
            } else {
                System.out.println("Enter more Values for a & b:  ");
            }

        }
       
         
           double x0=a;
           double x1;
        while(true)
        {
           
            x1=formater(x0-(f(x0)/f_D(x0)));
            System.out.println("The value of Root: "+x1);
             x0=x1;
             
             
           if(list.contains(x1))
           {
               break;
           }
           else
           {
               list.add(x1);
           }
        }
        System.out.println("The Root is: "+x1);
       
    
        
    }
    
    
    public static double f(double x)
    {
        return 3*x-Math.cos(x)-1;
    }
    public static double f_D(double x)
    {
        return 3+Math.sin(x);
    }
     public static double formater(double n) {
        DecimalFormat df = new DecimalFormat("#.##");
        n = Double.parseDouble(df.format(n));
        return n;
    }
    
    
}
