package ALPHA;
import java.util.*;
public class Mque {
     public static int factorial(int n){
        int f =1;
        for (int i=1 ;i<=n; i++) {
           f = f*i;
        }
        return f;

    }
    public static int binCoff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nMr =factorial(n-r);
        int binCoff = fact_n / (fact_r*fact_nMr);
        return binCoff;
    }

public static void main(String[] args){
    int f= factorial(7);
    System.out.println("factorial is : "+f);
    System.out.println("bioCoff is : "+ binCoff(5, 2));
  }




}