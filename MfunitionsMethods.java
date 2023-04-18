import java.util.*;
public class MfunitionsMethods {
    public static int printHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return 0;
    }


    public static int cacluteSum(int num1 , int num2) {
      int  sum = num1 + num2;
        return sum;
        
    }  
    public static int product(int a,int b) {
       int prod = a * b;
        return prod;
    } 


  /*   public static int factorial(int n){
        int f = 1;
        for (int i=1 ;i<=n; i++) {
          f = f*i;
        }
        return f;

    }*/
    public static int factorial(int n){
      int f =1;
      for (int i=1 ;i<=n; i++) {
         f = f*i;
      }
      return f;
    }
  /*   public static int binCoff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nMr =factorial(n-r);
        int binCoff = fact_n/(fact_r*fact_nMr);
        return binCoff;
    } */
    public static int binCoff(int n , int r){
      int fact_n = factorial(n);
      int fact_r = factorial(r);
      int fact_nMr =factorial(n-r);
      int binCoff = fact_n / (fact_r*fact_nMr);
      return binCoff;
  }
    public static void main(String[] args){
      //  printHelloWorld();
        Scanner sc = new Scanner(System.in);
        System.out.print("input a is :"); 
        int a = sc.nextInt();
        System.out.print("input b is :"); 
        int b = sc.nextInt();


       int sum = cacluteSum(a, b);
        System.out.println("Sum is :  "+ sum);
        int prod = product(a, b);
        System.out.println("product is :  "+ prod);
        System.out.print("type n : ");
        int n = sc.nextInt();
        int f= factorial(n);
        System.out.print("type r : ");
        int r = sc.nextInt();
        System.out.println("factorial is : "+f);
        

        System.out.println("biocoff is : "+ binCoff(n,r ));
    }
}
