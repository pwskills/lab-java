package ALPHA;
import java.util.Scanner;

public class KifElseIfelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=18){
            System.out.println("adult");
        }
        else if(a>13&&a<18){
            System.out.println("teeneger");
        }
        else{
            System.out.println("not adult");
        }
    }
}
