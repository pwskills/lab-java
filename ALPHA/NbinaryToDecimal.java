package ALPHA;

import java.util.Scanner;

public class NbinaryToDecimal {
    public static void binaryToDeci(long binNum) {
       long Mynum = binNum;
        int pow =0;
        long decNum = 0;
        while (binNum>0) {
            Long lastDig = binNum%10;
            decNum = (decNum + (lastDig * (long)Math.pow(2, pow)));    //type casting   (int)

            pow++;
            binNum = binNum/10;
            
        }System.out.println("decimal of "+Mynum+" = " + decNum);
        
    }


  ////  Decimal to binarry
    public static void Decitobina(int n) {
       int Mynum1 = n;
       int pow = 0;
       int binNum =0;
       while (n>0) {
        int rem = n%2;
       binNum =binNum +(rem*(int)Math.pow(10,pow));
       pow++;
       n= n/2;
       }
       System.out.println("binary of "+Mynum1+" = "+ binNum);

    
  }
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("input your binary number : ");
     long x = sc.nextLong();
     System.out.print("input your decimal number : ");
     int n = sc.nextInt();
      binaryToDeci(x);    
     Decitobina(n);
}
}
