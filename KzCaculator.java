import java.util.*;
public class KzCaculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("first number is : ");
        int a = sc.nextInt();
        System.out.println("sceand number is : ");
        int b = sc.nextInt();
        System.out.println("operater is : ");
        char operater = sc.next().charAt(0);
        switch (operater) {
            case '+':System.out.println(a+b);
                
                break;

            case '-':System.out.println(a-b);
                  break;
            case '*': System.out.println(a*b);
                  break;
            case '/':  System.out.println(a/b);  
                   break;             

            default: System.out.println("out of limits ");
                break;
        }
}
}