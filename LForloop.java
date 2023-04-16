import java.util.Scanner;

public class LForloop {
    public static void main(String[] args) {
        //int i = 1;
   /*  for (int i=1;i<=10;i++) {
        System.out.println("hello world");
        
    }
    */

    /// print reverse of  a number 
    Scanner sc = new Scanner(System.in);
    System.out.print("enter your number : ");
    int n = sc.nextInt();
    int rev =0;
    while (n>0) {
        int lastdigit =n%10;
       // System.out.print(lastdigit + " ");
       rev = (rev*10) + lastdigit;
        n/=10;
        
    }
    System.out.println(rev);
}
}
