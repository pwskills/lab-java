import java.util.Scanner;

public class Lbreak {
    public static void main(String[] args) {
    /* 
        for (int i = 1; i < 100; i++) {
        if(i==5){
            break;
        }
        System.out.println(i);
    }System.out.println("i am out for loop ");
    */

    // keep entering number till user entire a multipal of 10
    /* 
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("enter your number : ");
        int n = sc.nextInt();
        if(n%10 ==0 ){
            break;                       //continue statment
        }
        System.out.println(n);
        
    } while (true);
    */   
    
    Scanner sc = new Scanner(System.in);
    do {
        System.out.print("enter your number : ");
        int n = sc.nextInt();
        if (n%10 ==0) {
            continue;
            
        }System.out.println(n);
    } while (true);
}
}
