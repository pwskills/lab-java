import java.util.*;
public class Lloopwhile {
    public static void main(String[] args) {
/*     int a = 0;
    while (a<=10) {
        System.out.print(a + "  ");
        a++;
    } 
    System.out.println();  */ 


  /*   Scanner sc = new Scanner(System.in);
    int a =1;
    int n = sc.nextInt();
    while (a<=n) {
        System.out.print(a + " ");
        a++;
        
    }
    System.out.println();

}
*/
int sum = 0;
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i =1;
while (i<=n) {
    sum += i;
    i++;
}
System.out.println("sum is  " + sum);
}


}