package ALPHA;
 public class MchackPrimenumber {
    /* 
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }

        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}

*/
//optim. ans is 
//using math function

public static boolean isPrime(int n){
    if(n==2){
        return true;
    }
    for(int i =2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    

return true;
}
/* 
public static void main(String[] args) {
    System.out.println(isPrime(7));
}

 }
 */

 // print prime numbers in range

 public static void isPrimeRange(int n) {
    for(int i =2;i<=n;i++){
        if(isPrime(i)){
           System.out.print(i+"  ");
        }
    }
    
    System.out.println();
 }
 

public static void main(String[] args) {
    
    isPrimeRange(10000000);

}
}