import java.util.*;
public class JifElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("adult : drive and vote ");
        }
        else if(age>13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adut ");
        }
    }
    
}
