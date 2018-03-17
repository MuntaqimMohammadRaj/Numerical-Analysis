package forward;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Forward {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of values:");
        int n = sc.nextInt();
        int x[] = new int[n];
        double y[][] = new double[n][n];
        int h, item, b=0,d=0,fact=1 ;
        double p,result,c=0,diff=1,ans=0;
        System.out.println("Enter  values for x: ");
        for (int i = 0; i < n; i++) {
            System.out.print("x" + "(" + i + ")" + "=");
            x[i] = sc.nextInt();
        }
        System.out.println("Enter values for y: ");
        for (int i = 0; i < n; i++) {
            System.out.print("y" + "(" + i + ")" + "=");
            y[i][0] = sc.nextDouble();

        }
        System.out.println("");
        h = x[1] - x[0];
        System.out.println("interval= " + h);
        System.out.print("Enter x for which y is to be calculated = ");
        item = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (item > x[i]) {
                b = x[i];
                c=y[i][0];
                d=i;
               

            }
        }
       
        result=item-b;
        p=result/h;
     
        System.out.println(" Full table is: ");
        System.out.print("   x   = "); 
                for (int i = 0; i < n; i++) {
            System.out.print(x[i]+"\t");
          

        }
        
        System.out.println("");
        System.out.print("   y   = "); 
        for (int j = 0; j < n; j++) {
            System.out.print(y[j][0]+"\t");

        }
        System.out.println("");
       

        for (int j = 1; j < n; j++) {
             System.out.print("del"+"("+j+")"+" = "); 
            for (int i = 0; i <= n - j - 1; i++) {
                
         y[i][j] = format(y[i + 1][j - 1] - y[i][j - 1]);

         System.out.print(y[i][j]+"\t");

            }
            System.out.println("");

        }
        
     
     int beg=0,end=n-1;
     int mid=(beg+end)/2;
   
         
        if(item<x[mid]){
                
        for ( int i =1; i <n; i++) {
            
            fact*=i;
            format( diff*=(p-(i-1)));
            format(ans+=(diff*(y[d][i]))/fact);
            
            if(i==4)
            {
                ans=format(c+ans);
            }
            
        }
        System.out.println("");
        System.out.println("Ans is: "+ans);
      
     
     
     }
     else{
         System.out.println("Try Backward Method!");
     }
    }
    

    public static double format(double n) {
        DecimalFormat d = new DecimalFormat("#.####");
        n = Double.parseDouble(d.format(n));
        return n;
    }
    
   
}
